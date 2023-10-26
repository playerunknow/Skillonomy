class Teacher (name:String  = "No data", surname:String  = "No data", age:Int = 0, email:String = "No data",
               tokens:Int = 0, money:Double = 0, list_of_students: List[Student] = Nil)
  extends Human(name, surname, age, email, tokens, money)
{
  override val role = "Teacher"
  val rand: scala.util.Random = scala.util.Random
  private val teaching_skills = rand.nextInt(5)
  var ListOfStudents = list_of_students

  def addStudent(student: Student): Unit =
  {
    ListOfStudents = student :: ListOfStudents
  }

  def giveTask(student: Student): Unit =
  {
    val grade = student.doTask()
    //if (grade > 4) student.tokens += grade * 5
    //money += grade * 30 + 50
  }

  def deleteStudent(student: Student): Unit =
  {
    val newlist = ListOfStudents.filter(_ == student)
    ListOfStudents = newlist
    student.is_studying = false
  }

  def printStudents(): Unit =
  {
    println(s"${name} ${surname} students: ")
    for (student <- ListOfStudents) student.printHuman()
  }

  override def printHuman(): Unit =
  {
    super.printHuman()
    printStudents()
  }
}