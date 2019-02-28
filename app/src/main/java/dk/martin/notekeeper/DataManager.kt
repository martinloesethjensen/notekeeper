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
        var noteInfo = NoteInfo(course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services"), title = "Note for android async", text = "Hey this is text")
        notes.add(noteInfo)

        noteInfo = NoteInfo(course = CourseInfo(courseId = "java_lang", title = "Java Fundamentals: The Java Language"), title = "Note for java_lang", text = "Hey this is text")
        notes.add(noteInfo)
    }
}