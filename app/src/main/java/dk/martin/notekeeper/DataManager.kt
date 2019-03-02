package dk.martin.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseId] = course
    }

    private fun initializeNotes(){
        var noteInfo = NoteInfo(
            course = courses["android_async"],
            title = "Note for android async",
            text = "Hey this is text from the note for android sync."
        )
        notes.add(noteInfo)

        noteInfo = NoteInfo(
            course = courses["java_lang"],
            title = "Note for java_lang",
            text = "Hey this is the second text piece."
        )
        notes.add(noteInfo)

        noteInfo = NoteInfo(
            course = courses["android_intents"],
            title = "Intents for android",
            text = "Text about intents"
        )
        notes.add(noteInfo)

        noteInfo = NoteInfo(
            course = courses["java_core"],
            title = "About java core",
            text = "Java core notes"
        )
        notes.add(noteInfo)
    }
}