import scala.math.random

class Simulation(months_to_simulate: Int, Market: Market, Office: Office)
{

  def createTeachers() : Unit =
  {
    var i: Int = 0
    while (i < 5)
    {
      val teacher = new Teacher(i.toString(), i + 1.toString(), i + 30, i + 30.toString() + "gmail.com",
        scala.util.Random.nextInt(1000) + 300, scala.util.Random.nextInt(1000) + 300)

      Office.addTeacher(teacher)
      i += 1
    }
  }

  def createStudents() : Unit =
  {
    var i: Int = 0
    while (i < 20)
    {
      val student = new Student(i.toString(), i + 1.toString(), i + 30, i + 30.toString() + "gmail.com",
        scala.util.Random.nextInt(1000) + 300, scala.util.Random.nextInt(1000) + 300)

      Office.addStudent(student)

      i += 1
    }
  }

  def UniteStudentsWithTeachers() : Unit =
  {
    for (i <- 1 to 20)
    {
      val random_number_teacher: Int = scala.util.Random.nextInt(5) + 1
      val random_number_student: Int = scala.util.Random.nextInt(20) + 1

      Office.ListOfTeachers(random_number_teacher - 1).addStudent(Office.ListOfStudents(random_number_student - 1))
    }
  }

  def createCourses(): Unit =
  {
    var i: Int = 0

    while (i < 10)
    {
      val random_number_teacher: Int = scala.util.Random.nextInt(5) + 1
      val random_number_course: Int = scala.util.Random.nextInt(10) + 1

      val course = new Course(i.toString(), scala.util.Random.nextInt(100) + 1, scala.util.Random.nextInt(10) + 1)

      Office.ListOfTeachers(random_number_teacher - 1).addCourse(course)
    }


  }
  def AddCoursesToTeachers(): Unit =
  {
    val random_number_teacher: Int = scala.util.Random.nextInt(5) + 1
    val random_number_course: Int = scala.util.Random.nextInt(5) + 1
  }

  def printSimulation(): Unit =
  {
    createTeachers()
    createStudents()
    UniteStudentsWithTeachers()
    Office.printOffice()
    Market.printMarket()
  }


  //private val teacher1 = new Teacher("Joe", "Smith", 47, "JoeSmith@gmail.com", 500, 4000)
  //private val teacher2 = new Teacher("Adam", "Johnson", 54, "AdamJohnson@gmail.com", 600, 3700)
  //private val teacher3 = new Teacher("Mike", "Miller", 38, "MikeMiller@gmail.com", 900, 2300)


  //private val investor1 = new Investor(Market,"Elon", "Musk", 41, "ElonMusk@gmail.com", 2000, 7000)

  //private val student1 = new Student("John", "Doe", 30, "JohnDoe@gmail.com", 100, 1200)
  //private val student2_1 = new Student("Jacob", "Davis", 30, "JacobDavis@gmail.com", 50, 800)
  //private val student2_2 = new Student("William", "Brown", 30, "WilliamBrown@gmail.com", 450, 900)

  //office.addTeacher(teacher1)
  //office.addTeacher(teacher2)
  //office.addTeacher(teacher3)

  //office.addInvestor(investor1)

  //teacher1.addStudent(student1)
  //teacher2.addStudent(student2_1)
  //teacher2.addStudent(student2_2)


}
