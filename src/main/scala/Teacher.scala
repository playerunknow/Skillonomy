class Teacher (name:String  = "No data", surname:String  = "No data", age:Int = 0, email:String = "No data",
               tokens:Double = 0, money:Double = 0, list_of_students: List[Student] = Nil, list_of_course: List[Course] = Nil)
  extends Human(name, surname, age, email, tokens, money)
{
  override val role = "Teacher"
  val rand: scala.util.Random = scala.util.Random
  private val teaching_skills = rand.nextInt(5)
  var ListOfStudents = list_of_students
  var ListOfCourse = list_of_course

  def addStudent(student: Student): Unit =
  {
    ListOfStudents = student :: ListOfStudents
  }
  def addCourse(course: Course): Unit =
  {
    ListOfCourse = course :: ListOfCourse
  }

  def giveTask(student: Student): Unit =
  {
    val grade = student.doTask()
    if (grade == 1)
    {

    }
    else if(grade == 2)
    {

    }
    else if (grade == 3)
    {

    }
    else if (grade == 4)
    {

    }
    else if(grade == 5)
    {

    }
  }

  def deleteStudent(student: Student): Unit =
  {
    val newlist = ListOfStudents.filter(_ == student)
    ListOfStudents = newlist
    student.is_studying = false
  }

  def deleteCourse(course: Course): Unit =
  {

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
    printStudents()
  }
}