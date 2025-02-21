package com.example.gym

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import android.content.Intent

import android.widget.Button
import android.widget.Toast

import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

import android.graphics.Color

import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView


class SignUpActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Get references to UI elements
        val nameEditText = findViewById<TextInputEditText>(R.id.nameEditText)
        val emailEditText = findViewById<TextInputEditText>(R.id.emailEditText)
        val phoneEditText = findViewById<TextInputEditText>(R.id.phoneEditText)
        val passwordEditText = findViewById<TextInputEditText>(R.id.passwordEditText)
        val signUpButton = findViewById<Button>(R.id.signUpButton)

        // Set click listener for the Sign-Up button
        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Create user with Firebase Authentication
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign-up success, navigate to HomeScreen
                        startActivity(Intent(this, Homescreen::class.java))
                        finish()
                    } else {
                        // Sign-up failed
                        Toast.makeText(this, "Sign-Up Failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        // Get reference to the TextView
        val signInText = findViewById<TextView>(R.id.signInText)

        // Create the full text with "Sign in" as a clickable span
        val fullText = "Already have an account? Sign in"
        val spannableString = SpannableString(fullText)

        // Define the clickable span for "Sign in"
        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                // Navigate to the SignInActivity
                val intent = Intent(this@SignUpActivity, SignInActivity::class.java)
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.color = Color.parseColor("#FFA500") // Orange color
                ds.isUnderlineText = false // Remove underline
            }
        }

        // Set the clickable span to the "Sign in" part
        val startIndex = fullText.indexOf("Sign in")
        val endIndex = startIndex + "Sign in".length
        spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Apply the SpannableString to the TextView
        signInText.text = spannableString
        signInText.movementMethod = LinkMovementMethod.getInstance() // Make it clickable
        signInText.highlightColor = Color.TRANSPARENT // Remove the highlight color when clicked
    }
}
