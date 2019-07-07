package jimmyshaw.me

class DataManager {
  val courses = HashMap<String, CourseInfo>()
  val notes = ArrayList<NoteInfo>()

  init {
    initializeCourses()
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
}