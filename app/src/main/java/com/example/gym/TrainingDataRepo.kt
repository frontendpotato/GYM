package com.example.gym

object TrainingDataRepo {
    // Current language setting (this can be user-selectable)
    var currentLanguage: Language = Language.EN

    // ----- Chest Exercises -----
    val chestExercises = listOf(
        Exercise(
            id = 101,
            title = LocalizedText("Bench Press", "Presse Développé", "ضغط الصدر"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 10",
            description = LocalizedText(
                "A compound chest exercise.",
                "Un exercice composé pour la poitrine.",
                "تمرين مركب للصدر."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=benchpress"
        ),
        /*Exercise(
            id = 102,
            title = LocalizedText("Incline Dumbbell Press", "Presse Incliné aux Haltères", "ضغط الدمبل المائل"),
            imageResId = R.drawable.exercise_incline_dumbbell_press,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Targets the upper chest.",
                "Cible la partie supérieure de la poitrine.",
                "يستهدف الجزء العلوي من الصدر."
            ),
            gifResId = R.drawable.gif_incline_dumbbell_press,
            youtubeLink = "https://www.youtube.com/watch?v=incline"
        ),
        Exercise(
            id = 103,
            title = LocalizedText("Chest Fly", "Écarté Couché", "تفتيح الصدر"),
            imageResId = R.drawable.exercise_chest_fly,
            repetitions = "3 sets of 15",
            description = LocalizedText(
                "Isolation exercise for the chest.",
                "Exercice d'isolation pour la poitrine.",
                "تمرين عزل للصدر."
            ),
            gifResId = R.drawable.gif_chest_fly,
            youtubeLink = "https://www.youtube.com/watch?v=chestfly"
        )*/
        // ... add more chest exercises to reach 20–30 items
    )

    // ----- Shoulder Exercises -----
    val shoulderExercises = listOf(
        Exercise(
            id = 201,
            title = LocalizedText("Overhead Press", "Développé Militaire", "ضغط عسكري"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 10",
            description = LocalizedText(
                "Shoulder compound exercise.",
                "Exercice composé pour les épaules.",
                "تمرين مركب للكتفين."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=overheadpress"
        )/*,
        Exercise(
            id = 202,
            title = LocalizedText("Lateral Raise", "Élévation Latérale", "رفع جانبي"),
            imageResId = R.drawable.exercise_lateral_raise,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Isolates the side delts.",
                "Isole les deltoïdes latéraux.",
                "يعزل عضلات الكتف الجانبية."
            ),
            gifResId = R.drawable.gif_lateral_raise,
            youtubeLink = "https://www.youtube.com/watch?v=lateralraise"
        ),
        Exercise(
            id = 203,
            title = LocalizedText("Front Raise", "Élévation Frontale", "رفع أمامي"),
            imageResId = R.drawable.exercise_front_raise,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Targets the front delts.",
                "Cible les deltoïdes antérieurs.",
                "يستهدف عضلات الكتف الأمامية."
            ),
            gifResId = R.drawable.gif_front_raise,
            youtubeLink = "https://www.youtube.com/watch?v=frontraise"
        )*/
        // ... add more shoulder exercises
    )

    // ----- Back Exercises -----
    val backExercises = listOf(
        Exercise(
            id = 301,
            title = LocalizedText("Pull-Up", "Traction", "سحب"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 8",
            description = LocalizedText(
                "Bodyweight back exercise.",
                "Exercice de dos avec le poids du corps.",
                "تمرين ظهر بوزن الجسم."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=pullup"
        )/*,
        Exercise(
            id = 302,
            title = LocalizedText("Bent Over Row", "Rowing Penché", "تجديف مائل"),
            imageResId = R.drawable.exercise_bent_over_row,
            repetitions = "3 sets of 10",
            description = LocalizedText(
                "Compound back exercise.",
                "Exercice composé pour le dos.",
                "تمرين مركب للظهر."
            ),
            gifResId = R.drawable.gif_bent_over_row,
            youtubeLink = "https://www.youtube.com/watch?v=bentoverrow"
        ),
        Exercise(
            id = 303,
            title = LocalizedText("Lat Pulldown", "Tirage Vertical", "سحب عرضي"),
            imageResId = R.drawable.exercise_lat_pulldown,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Works the lats.",
                "Travaille les dorsaux.",
                "يعمل على تقوية عضلات الظهر."
            ),
            gifResId = R.drawable.gif_lat_pulldown,
            youtubeLink = "https://www.youtube.com/watch?v=latpulldown"
        )*/
        // ... add more back exercises
    )

    // ----- Leg Exercises -----
    val legExercises = listOf(
        Exercise(
            id = 401,
            title = LocalizedText("Squat", "Squat", "قرفصاء"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Fundamental lower body exercise.",
                "Exercice fondamental pour le bas du corps.",
                "تمرين أساسي للساقين."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=squat"
        )/*,
        Exercise(
            id = 402,
            title = LocalizedText("Leg Press", "Presse à Jambes", "ضغط الأرجل"),
            imageResId = R.drawable.exercise_leg_press,
            repetitions = "3 sets of 10",
            description = LocalizedText(
                "Machine exercise for legs.",
                "Exercice machine pour les jambes.",
                "تمرين باستخدام الآلة للساقين."
            ),
            gifResId = R.drawable.gif_leg_press,
            youtubeLink = "https://www.youtube.com/watch?v=legpress"
        ),
        Exercise(
            id = 403,
            title = LocalizedText("Lunge", "Fente", "اندفاع"),
            imageResId = R.drawable.exercise_lunge,
            repetitions = "3 sets of 12 per leg",
            description = LocalizedText(
                "Targets quads and glutes.",
                "Cible les quadriceps et les fessiers.",
                "يستهدف عضلات الفخذ والأرداف."
            ),
            gifResId = R.drawable.gif_lunge,
            youtubeLink = "https://www.youtube.com/watch?v=lunge"
        )*/
        // ... add more leg exercises
    )

    // ----- Abdominal Exercises -----
    val absExercises = listOf(
        Exercise(
            id = 501,
            title = LocalizedText("Crunch", "Crunch", "كرانش"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 20",
            description = LocalizedText(
                "Basic abdominal exercise.",
                "Exercice abdominal de base.",
                "تمرين أساسي للبطن."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=crunch"
        )/*,
        Exercise(
            id = 502,
            title = LocalizedText("Plank", "Planche", "بلانك"),
            imageResId = R.drawable.exercise_plank,
            repetitions = "3 sets of 60 sec",
            description = LocalizedText(
                "Core stability exercise.",
                "Exercice de stabilité du tronc.",
                "تمرين استقرار النواة."
            ),
            gifResId = R.drawable.gif_plank,
            youtubeLink = "https://www.youtube.com/watch?v=plank"
        ),
        Exercise(
            id = 503,
            title = LocalizedText("Leg Raise", "Relevé de Jambes", "رفع الساقين"),
            imageResId = R.drawable.exercise_leg_raise,
            repetitions = "3 sets of 15",
            description = LocalizedText(
                "Works lower abs.",
                "Travaille le bas des abdominaux.",
                "يعمل على عضلات البطن السفلية."
            ),
            gifResId = R.drawable.gif_leg_raise,
            youtubeLink = "https://www.youtube.com/watch?v=legraise"
        )*/
        // ... add more abs exercises
    )

    // ----- Biceps Exercises -----
    val bicepsExercises = listOf(
        Exercise(
            id = 601,
            title = LocalizedText("Bicep Curl", "Curl Biceps", "تمرين بايسبس"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Classic bicep exercise.",
                "Exercice classique pour les biceps.",
                "تمرين كلاسيكي للبايسبس."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=bicepcurl"
        )/*,
        Exercise(
            id = 602,
            title = LocalizedText("Hammer Curl", "Curl Marteau", "تمرين المطرقة"),
            imageResId = R.drawable.exercise_hammer_curl,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Targets brachialis.",
                "Cible le brachial.",
                "يستهدف عضلة الذراع."
            ),
            gifResId = R.drawable.gif_hammer_curl,
            youtubeLink = "https://www.youtube.com/watch?v=hammercurl"
        ),
        Exercise(
            id = 603,
            title = LocalizedText("Concentration Curl", "Curl Concentré", "تمرين تركيز بايسبس"),
            imageResId = R.drawable.exercise_concentration_curl,
            repetitions = "3 sets of 10",
            description = LocalizedText(
                "Isolation for biceps.",
                "Isolation pour les biceps.",
                "عزل للبايسبس."
            ),
            gifResId = R.drawable.gif_concentration_curl,
            youtubeLink = "https://www.youtube.com/watch?v=concentrationcurl"
        )*/
        // ... add more biceps exercises
    )

    // ----- Triceps Exercises -----
    val tricepsExercises = listOf(
        Exercise(
            id = 701,
            title = LocalizedText("Tricep Dip", "Dips Triceps", "تمرين غمس الترايسبس"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Bodyweight triceps exercise.",
                "Exercice de triceps avec le poids du corps.",
                "تمرين ترايسبس بوزن الجسم."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=tricepdip"
        )/*,
        Exercise(
            id = 702,
            title = LocalizedText("Tricep Pushdown", "Extension Triceps", "تمرين دفع الترايسبس"),
            imageResId = R.drawable.exercise_tricep_pushdown,
            repetitions = "3 sets of 12",
            description = LocalizedText(
                "Cable exercise for triceps.",
                "Exercice à la poulie pour les triceps.",
                "تمرين بالكابل للترايسبس."
            ),
            gifResId = R.drawable.gif_tricep_pushdown,
            youtubeLink = "https://www.youtube.com/watch?v=triceppushdown"
        ),
        Exercise(
            id = 703,
            title = LocalizedText("Overhead Tricep Extension", "Extension Triceps au-dessus de la Tête", "تمرين تمديد الترايسبس"),
            imageResId = R.drawable.exercise_overhead_tricep_extension,
            repetitions = "3 sets of 10",
            description = LocalizedText(
                "Targets the long head of the triceps.",
                "Cible la longue portion des triceps.",
                "يستهدف الرأس الطويل للترايسبس."
            ),
            gifResId = R.drawable.gif_overhead_tricep_extension,
            youtubeLink = "https://www.youtube.com/watch?v=overheadtricep"
        )*/
        // ... add more triceps exercises
    )

    // ----- Forearms Exercises -----
    val forearmsExercises = listOf(
        Exercise(
            id = 801,
            title = LocalizedText("Wrist Curl", "Curl Poignet", "تمرين معصم"),
            imageResId = R.drawable.exercise_bench_press,
            repetitions = "3 sets of 15",
            description = LocalizedText(
                "Focuses on the forearm flexors.",
                "Concentre sur les fléchisseurs de l'avant-bras.",
                "يركز على ثنيات الساعد."
            ),
            gifResId = R.drawable.exercise_bench_press,
            youtubeLink = "https://www.youtube.com/watch?v=wristcurl"
        )/*,
        Exercise(
            id = 802,
            title = LocalizedText("Reverse Wrist Curl", "Curl Inversé Poignet", "تمرين معصم معكوس"),
            imageResId = R.drawable.exercise_reverse_wrist_curl,
            repetitions = "3 sets of 15",
            description = LocalizedText(
                "Targets the forearm extensors.",
                "Cible les extenseurs de l'avant-bras.",
                "يستهدف بسط الساعد."
            ),
            gifResId = R.drawable.gif_reverse_wrist_curl,
            youtubeLink = "https://www.youtube.com/watch?v=reversewristcurl"
        ),
        Exercise(
            id = 803,
            title = LocalizedText("Farmer's Walk", "Marche du Fermier", "مشية الفلاح"),
            imageResId = R.drawable.exercise_farmers_walk,
            repetitions = "3 sets of 1min",
            description = LocalizedText(
                "Builds grip strength and forearm endurance.",
                "Développe la force de préhension et l'endurance des avant-bras.",
                "يقوي القبضة وقدرة الساعد على التحمل."
            ),
            gifResId = R.drawable.gif_farmers_walk,
            youtubeLink = "https://www.youtube.com/watch?v=farmerswalk"
        )*/
        // ... add more forearms exercises
    )

    // ----- Define Programs with Splits -----
    // In these examples, each Program contains several Splits (workout days) that combine exercises for one or more muscle groups.
    val programs = listOf(
        Program(
            id = 1,
            title = LocalizedText("Full Body Transformation", "Transformation Totale du Corps", "تحول كامل للجسم"),
            imageResId = R.drawable.program1,
            splits = listOf(
                Split(
                    day = LocalizedText("Chest & Triceps", "Poitrine & Triceps", "صدر وترايسبس"),
                    duration = "60min",
                    muscle = Muscle(LocalizedText("Chest", "Poitrine", "صدر"), R.drawable.exercise_bench_press),
                    exercises = chestExercises + tricepsExercises
                ),
                Split(
                    day = LocalizedText("Back & Biceps", "Dos & Biceps", "ظهر وبايسبس"),
                    duration = "60min",
                    muscle = Muscle(LocalizedText("Back", "Dos", "ظهر"), R.drawable.exercise_bench_press),
                    exercises = backExercises + bicepsExercises
                ),
                Split(
                    day = LocalizedText("Leg Day", "Jour de Jambes", "يوم الأرجل"),
                    duration = "70min",
                    muscle = Muscle(LocalizedText("Legs", "Jambes", "أرجل"), R.drawable.exercise_bench_press),
                    exercises = legExercises
                ),
                Split(
                    day = LocalizedText("Shoulders & Abs", "Épaules & Abdos", "كتفين وبطن"),
                    duration = "55min",
                    muscle = Muscle(LocalizedText("Shoulders", "Épaules", "كتفين"), R.drawable.exercise_bench_press),
                    exercises = shoulderExercises + absExercises
                ),
                Split(
                    day = LocalizedText("Forearms & Core", "Avant-bras & Core", "ساعد وبطن"),
                    duration = "50min",
                    muscle = Muscle(LocalizedText("Forearms", "Avant-bras", "ساعد"), R.drawable.exercise_bench_press),
                    exercises = forearmsExercises
                )
            )
        ),
        Program(
            id = 2,
            title = LocalizedText("Strength Builder", "Constructeur de Force", "باني القوة"),
            imageResId = R.drawable.exercices,
            splits = listOf(
                Split(
                    day = LocalizedText("Chest & Biceps", "Poitrine & Biceps", "صدر وبايسبس"),
                    duration = "65min",
                    muscle = Muscle(LocalizedText("Chest", "Poitrine", "صدر"), R.drawable.exercise_bench_press),
                    exercises = chestExercises + bicepsExercises
                ),
                Split(
                    day = LocalizedText("Back & Triceps", "Dos & Triceps", "ظهر وترايسبس"),
                    duration = "65min",
                    muscle = Muscle(LocalizedText("Back", "Dos", "ظهر"), R.drawable.exercise_bench_press),
                    exercises = backExercises + tricepsExercises
                ),
                Split(
                    day = LocalizedText("Leg Day", "Jambes", "أرجل"),
                    duration = "75min",
                    muscle = Muscle(LocalizedText("Legs", "Jambes", "أرجل"), R.drawable.exercise_bench_press),
                    exercises = legExercises
                ),
                Split(
                    day = LocalizedText("Shoulders & Abs", "Épaules & Abdos", "كتفين وبطن"),
                    duration = "55min",
                    muscle = Muscle(LocalizedText("Shoulders", "Épaules", "كتفين"), R.drawable.exercise_bench_press),
                    exercises = shoulderExercises + absExercises
                ),
                Split(
                    day = LocalizedText("Forearms", "Avant-bras", "ساعد"),
                    duration = "50min",
                    muscle = Muscle(LocalizedText("Forearms", "Avant-bras", "ساعد"), R.drawable.exercise_bench_press),
                    exercises = forearmsExercises
                )
            )
        ),
        Program(
            id = 3,
            title = LocalizedText("Muscle Mass Accelerator", "Accélérateur de Masse Musculaire", "مسرع كتلة العضلات"),
            imageResId = R.drawable.exercise_bench_press,
            splits = listOf(
                Split(
                    day = LocalizedText("Chest Day", "Jour Poitrine", "يوم الصدر"),
                    duration = "60min",
                    muscle = Muscle(LocalizedText("Chest", "Poitrine", "صدر"), R.drawable.exercise_bench_press),
                    exercises = chestExercises
                ),
                Split(
                    day = LocalizedText("Back Day", "Jour Dos", "يوم الظهر"),
                    duration = "60min",
                    muscle = Muscle(LocalizedText("Back", "Dos", "ظهر"), R.drawable.exercise_bench_press),
                    exercises = backExercises
                ),
                Split(
                    day = LocalizedText("Leg Day", "Jour Jambes", "يوم الأرجل"),
                    duration = "70min",
                    muscle = Muscle(LocalizedText("Legs", "Jambes", "أرجل"), R.drawable.exercise_bench_press),
                    exercises = legExercises
                ),
                Split(
                    day = LocalizedText("Shoulders & Arms", "Épaules & Bras", "كتفين وذراعين"),
                    duration = "55min",
                    muscle = Muscle(LocalizedText("Shoulders", "Épaules", "كتفين"), R.drawable.exercise_bench_press),
                    exercises = shoulderExercises + bicepsExercises + tricepsExercises
                )
            )
        ),
        Program(
            id = 4,
            title = LocalizedText("Power and Endurance", "Puissance et Endurance", "القوة والقدرة على التحمل"),
            imageResId = R.drawable.exercise_bench_press,
            splits = listOf(
                Split(
                    day = LocalizedText("Chest & Abs", "Poitrine & Abdos", "صدر وبطن"),
                    duration = "60min",
                    muscle = Muscle(LocalizedText("Chest", "Poitrine", "صدر"), R.drawable.exercise_bench_press),
                    exercises = chestExercises + absExercises
                ),
                Split(
                    day = LocalizedText("Back & Shoulders", "Dos & Épaules", "ظهر وكتفين"),
                    duration = "65min",
                    muscle = Muscle(LocalizedText("Back", "Dos", "ظهر"), R.drawable.exercise_bench_press),
                    exercises = backExercises + shoulderExercises
                ),
                Split(
                    day = LocalizedText("Leg Day", "Jour Jambes", "يوم الأرجل"),
                    duration = "75min",
                    muscle = Muscle(LocalizedText("Legs", "Jambes", "أرجل"), R.drawable.exercise_bench_press),
                    exercises = legExercises
                ),
                Split(
                    day = LocalizedText("Arms", "Bras", "ذراعين"),
                    duration = "50min",
                    muscle = Muscle(LocalizedText("Biceps & Triceps", "Biceps & Triceps", "بايسبس وترايسبس"), R.drawable.exercise_bench_press),
                    exercises = bicepsExercises + tricepsExercises
                )
            )
        ),
        /*Program(
            id = 5,
            title = LocalizedText("Functional Fitness", "Fitness Fonctionnel", "اللياقة الوظيفية"),
            imageResId = R.drawable.program5,
            splits = listOf(
                Split(
                    day = LocalizedText("Full Body Circuit", "Circuit Corps Complet", "دائرة كاملة للجسم"),
                    duration = "70min",
                    muscle = Muscle(LocalizedText("Full Body", "Corps Complet", "جسم كامل"), R.drawable.muscle_fullbody),
                    exercises = chestExercises + backExercises + legExercises + shoulderExercises + absExercises
                ),
                Split(
                    day = LocalizedText("Arms & Core", "Bras & Core", "ذراعين وبطن"),
                    duration = "55min",
                    muscle = Muscle(LocalizedText("Arms", "Bras", "ذراعين"), R.drawable.muscle_arms),
                    exercises = bicepsExercises + tricepsExercises + forearmsExercises
                )
            )
        ),
        Program(
            id = 6,
            title = LocalizedText("Ultimate Shred", "Échauffement Ultime", "التفتيح النهائي"),
            imageResId = R.drawable.program6,
            splits = listOf(
                Split(
                    day = LocalizedText("High-Intensity Chest & Back", "Poitrine & Dos Haute Intensité", "صدر وظهر عالية الكثافة"),
                    duration = "65min",
                    muscle = Muscle(LocalizedText("Chest & Back", "Poitrine & Dos", "صدر وظهر"), R.drawable.muscle_chest_back),
                    exercises = chestExercises + backExercises
                ),
                Split(
                    day = LocalizedText("Legs & Abs", "Jambes & Abdos", "أرجل وبطن"),
                    duration = "75min",
                    muscle = Muscle(LocalizedText("Legs & Abs", "Jambes & Abdos", "أرجل وبطن"), R.drawable.muscle_legs_abs),
                    exercises = legExercises + absExercises
                ),
                Split(
                    day = LocalizedText("Shoulders, Arms & Forearms", "Épaules, Bras & Avant-bras", "كتفين، ذراعين وساعدين"),
                    duration = "60min",
                    muscle = Muscle(LocalizedText("Shoulders & Arms", "Épaules & Bras", "كتفين وذراعين"), R.drawable.muscle_shoulders_arms),
                    exercises = shoulderExercises + bicepsExercises + tricepsExercises + forearmsExercises
                )
            )
        )*/
    )
}
