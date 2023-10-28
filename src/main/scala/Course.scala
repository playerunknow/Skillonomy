class Course(val _courseName: String = "Course", val _coursePrice: Double = 100, _courseDuration: Int = 6)
{
  var courseName: String = _courseName
  var coursePrice: Double = _coursePrice
  var courseDuration: Int = _courseDuration

  def addStudent(): Unit =
  {

  }

  def printCourseInfo(): Unit =
  {
    println(s"courseName: $courseName" + "\n" + s"coursePrice: $coursePrice" + "\n" +
      s"courseDuration: $courseDuration" + "\n")
  }

}
