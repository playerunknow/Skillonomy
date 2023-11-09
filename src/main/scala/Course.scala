class Course(val _courseName: String = "Course", val _coursePrice: Double = 100, _courseDuration: Int = 6)
{

  // getters
  def CourseName: String = _courseName
  def CoursePrice: Double = _coursePrice
  def CourseDuration: Int = _courseDuration

  // setters

  def printCourseInfo(): Unit =
  {
    println(s"courseName: $CourseName" + "\n" + s"coursePrice: $CoursePrice" + "\n" +
      s"courseDuration: $CourseDuration" + "\n")
  }


}
