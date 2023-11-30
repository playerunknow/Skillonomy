class Teacher (name:String  = "No data", surname:String  = "No data", age:Int = 0, email:String = "No data",
               tokens:Double = 0, money:Double = 0, list_of_students: List[Student] = Nil, list_of_course: List[Course] = Nil)
  extends Human(name, surname, age, email, tokens, money)
{
  override val role = "Teacher"
  val rand: scala.util.Random = scala.util.Random
  var ListOfStudents = list_of_students
  var ListOfCourse = list_of_course

  def amountOfStudent: Int = ListOfStudents.length

  def addStudent(student: Student): Unit =
  {
    ListOfStudents = student :: ListOfStudents
  }
  def addCourse(course: Course): Unit =
  {
    ListOfCourse = course :: ListOfCourse
  }

  def GetSalary(Market: Market): Unit =
  {
    val amountOfStudents = ListOfStudents.length
    val teacherSalary = (amountOfStudents * ListOfCourse.head.CoursePrice)
    Market.setAllTokens(Market.TokensAvailable - teacherSalary)
    //tokens = (tokens + teacherSalary)
  }

  def giveTask(student: Student): Unit =
  {
    val grade = student.doTask()
    if (grade == 1)
    {
      student.tokens = student.tokens - ((ListOfCourse.head.CoursePrice / 100) * 10)
    }
    else if(grade == 2)
    {
      student.tokens = student.tokens - ((ListOfCourse.head.CoursePrice / 100) * 5)
    }
    else if (grade == 3)
    {
      student.tokens = student.tokens - ((ListOfCourse.head.CoursePrice / 100) * 0)
    }
    else if (grade == 4)
    {
      student.tokens = student.tokens + ((ListOfCourse.head.CoursePrice / 100) * 5)
    }
    else if(grade == 5)
    {
      student.tokens = student.tokens + ((ListOfCourse.head.CoursePrice / 100) * 10)
    }
  }

  def deleteStudent(student: Student): Unit =
  {
    val newlist = ListOfStudents.filter(_ == student)
    ListOfStudents = newlist
    student.is_studying = false
  }

  def deleteCourse(course: Course, CourseId : Int): Unit =
  {
    val newlist = ListOfCourse.filter(_ == course)
    ListOfCourse = newlist
  }

  def printStudents(): Unit =
  {
    println(s"${name} ${surname} students: ")
    for (student <- ListOfStudents) student.printHuman()
  }

  def printCourse(): Unit =
  {
    println(s"${name} ${surname} courses: ")
    for (course <- ListOfCourse) course.printCourseInfo()
  }

  override def printHuman(): Unit =
  {
    super.printHuman()
    //println(s"CourseDuration = ${ListOfCourse.head.CourseDuration}, CoursePrice = ${ListOfCourse.head.CoursePrice}")
    printStudents()
  }
}