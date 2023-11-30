class Course(val _courseName: String = "Course", var _coursePrice: Double = 100, var _courseDuration: Int = scala.util.Random.nextInt(5) + 7)
{

  // getters
  def CourseName: String = _courseName
  def CoursePrice: Double = _coursePrice
  def CourseDuration: Int = _courseDuration

  // setters

  def SetCoursePrice(Value: Double): Unit =
  {
    _coursePrice = Value
  }

  def SetCourseDuration(Value: Int): Unit =
  {
    _courseDuration = Value
  }

  def printCourseInfo(): Unit =
  {
    println(s"courseName: $CourseName" + "\n" + s"coursePrice: $CoursePrice" + "\n" +
      s"courseDuration: $CourseDuration" + "\n")
  }


}
