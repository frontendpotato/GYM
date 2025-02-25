package com.example.gym

// Define a simple data class for localized text.
data class LocalizedText(
    val en: String,
    val fr: String,
    val ar: String
) {
    fun get(language: Language): String {
        return when (language) {
            Language.EN -> en
            Language.FR -> fr
            Language.AR -> ar
        }
    }
}

enum class Language {
    EN, FR, AR
}

// Data model for an exercise.
data class Exercise(
    val id: Int,
    val title: LocalizedText,
    @androidx.annotation.DrawableRes val imageResId: Int,
    val repetitions: String,
    val description: LocalizedText,
    @androidx.annotation.DrawableRes val gifResId: Int,
    val youtubeLink: String
)

// Data model for a muscle (used for labeling a split).
data class Muscle(
    val title: LocalizedText,
    @androidx.annotation.DrawableRes val imageResId: Int
)

// Data model for a split (workout day).
data class Split(
    val day: LocalizedText,
    val duration: String,
    val muscle: Muscle,
    val exercises: List<Exercise>
)

// Data model for a program.
data class Program(
    val id: Int,
    val title: LocalizedText,
    @androidx.annotation.DrawableRes val imageResId: Int,
    val splits: List<Split>
)
