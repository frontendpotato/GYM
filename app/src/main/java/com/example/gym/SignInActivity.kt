package com.example.gym

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import android.widget.Button

import android.widget.Toast

import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Get references to UI elements
        val emailPhoneEditText = findViewById<TextInputEditText>(R.id.emailPhoneEditText)
        val passwordEditText = findViewById<TextInputEditText>(R.id.passwordEditText)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val signUpText = findViewById<TextView>(R.id.signUpText)

        // Set click listener for the Sign-In button
        signInButton.setOnClickListener {
            val emailPhone = emailPhoneEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (emailPhone.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Sign in with Firebase Authentication
            auth.signInWithEmailAndPassword(emailPhone, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign-in success, navigate to HomeScreen
                        startActivity(Intent(this, Homescreen::class.java))
                        finish()
                    } else {
                        // Sign-in failed
                        Toast.makeText(this, "Sign-In Failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        // Make "Sign up" text clickable
        val fullText = "Don't have an account? Sign up"
        val spannableString = SpannableString(fullText)

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                // Navigate to SignUpActivity
                startActivity(Intent(this@SignInActivity, SignUpActivity::class.java))
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.color = Color.parseColor("#FFA500") // Orange color
                ds.isUnderlineText = false // Remove underline
            }
        }

        val startIndex = fullText.indexOf("Sign up")
        val endIndex = startIndex + "Sign up".length
        spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        signUpText.text = spannableString
        signUpText.movementMethod = LinkMovementMethod.getInstance()
        signUpText.highlightColor = Color.TRANSPARENT
    }
}