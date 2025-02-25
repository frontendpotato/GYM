package com.example.gym



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


//class ProgramsAdapter(private val exercises: List<Exercise>) :
//    RecyclerView.Adapter<ProgramsAdapter.ProgramsViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramsViewHolder {
//        val binding = ItemBinding.inflate(
//            LayoutInflater.from(parent.context), parent, false
//        )
//        return ProgramsViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ProgramsViewHolder, position: Int) {
//        holder.bind(exercises[position])
//    }
//
//    override fun getItemCount(): Int = exercises.size
//
//    inner class ProgramsViewHolder(private val binding: ItemBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(exercise: Program) {
//            binding.textViewExerciseName.text = exercise.title
//            // Bind other views if necessary
//        }
//    }
//}


import com.example.gym.databinding.ItemProgramBinding

class ProgramsAdapter(
    private val programs: List<Program>,
    private val onItemClick: (Program) -> Unit
) : RecyclerView.Adapter<ProgramsAdapter.ProgramViewHolder>() {

    inner class ProgramViewHolder(private val binding: ItemProgramBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(program: Program) {
            // Set the program title using the current language from the repository
            binding.textViewProgramTitle.text = program.title.get(TrainingDataRepo.currentLanguage)
            // Set the program image from the drawable resource
           // binding.imageViewProgram.setImageResource(program.imageResId)


            Glide.with(binding.root.context)
                .load(program.imageResId) // Assuming it's a drawable resource ID
                .placeholder(R.drawable.exercise_bench_press) // Optional: placeholder while loading
                .into(binding.imageViewProgram)


            // Set a click listener to notify when an item is clicked
            binding.root.setOnClickListener {
                onItemClick(program)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramViewHolder {
        val binding = ItemProgramBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProgramViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
        holder.bind(programs[position])
    }

    override fun getItemCount(): Int = programs.size
}



