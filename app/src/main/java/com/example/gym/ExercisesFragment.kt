import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gym.ExerciceAdapter
import com.example.gym.ExerciceItem
import com.example.gym.R

class ExercisesFragment : Fragment(R.layout.fragment_exercises) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize RecyclerView
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.setItemViewCacheSize(10) // Cache 20 views

        // Set LinearLayoutManager with horizontal orientation
        recyclerView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, // Horizontal orientation
            false // Reverse layout (set to false)
        )

        // Sample data for the RecyclerView
        val exerciceItems = listOf(
            ExerciceItem(R.drawable.program1, "Exercice 1"),
            ExerciceItem(R.drawable.program2, "Exercice 2"),
            ExerciceItem(R.drawable.program3, "Exercice 3")
            // Add more items as needed
        )

        // Initialize adapter
        val adapter = ExerciceAdapter(exerciceItems) { item ->
            // Handle item click
            // Example: Navigate to a new fragment or show a toast
            // Toast.makeText(requireContext(), "Clicked: ${item.title}", Toast.LENGTH_SHORT).show()
        }

        // Set adapter to RecyclerView
        recyclerView.adapter = adapter
    }
}
