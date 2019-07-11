package jimmyshaw.me

object DataManager {
  val courses = HashMap<String, CourseInfo>()
  val notes = ArrayList<NoteInfo>()

  init {
    initializeCourses()
    initializeNotes()
  }

  private fun initializeCourses() {
    var course = CourseInfo("android_intents", "Android Programming with Intents")
    courses.set(course.courseId, course)

    course = CourseInfo(courseId = "android_async", title = "Android Async Programming")
    courses.set(course.courseId, course)

    course = CourseInfo(title = "Java Language", courseId = "java_lang")
    courses.set(course.courseId, course)

    course = CourseInfo("java_core", "Java Core Platform")
    courses.set(course.courseId, course)
  }

  private fun initializeNotes() {
    var note = NoteInfo(courses.getValue("java_lang"), "Methods", "Method names use camel case")
    notes.add(note)

    note = NoteInfo(courses.getValue("android_intents"), "Intent Forms", "There are two intent forms: explicit and implicit")
    notes.add(note)

    note = NoteInfo(courses.getValue("java_core"), "Compilation", "Java code compiles down to bytecode")
    notes.add(note)
  }
}