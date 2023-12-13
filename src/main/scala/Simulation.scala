import scala.math.random

class Simulation(months_to_simulate: Int, Market: Market, Office: Office)
{

  var longestCourseDuration: Int = 0
  var amountOfTeachers: Int = 5
  var amontOfStudent: Int = 20

  def createInvestors(): Unit =
  {
    var randomNumberOfInvestors: Int = scala.util.Random.nextInt(3) + 1

    var i: Int = 0
    while (i < randomNumberOfInvestors)
    {
      //val investor = new Investor()
      i += 1
    }
  }

  def createTeachers() : Unit =
  {
    var i: Int = 0
    while (i < amountOfTeachers)
    {
      val teacher = new Teacher(i.toString(), i + 1.toString(), i + 30, i + 30.toString() + "gmail.com",
        scala.util.Random.nextInt(1000) + 300, scala.util.Random.nextInt(1000) + 300)

      Office.addTeacher(teacher)
      i += 1
    }
  }

  def createStudents() : Unit =
  {
    // clear list of student
    var i: Int = 0
    while (i < amontOfStudent)
    {
      val student = new Student(i.toString(), i + 1.toString(), i + 30, i + 30.toString() + "gmail.com",
        scala.util.Random.nextInt(1000) + 300, scala.util.Random.nextInt(1000) + 300)

      Office.addStudent(student)

      i += 1
    }
  }

  def UniteStudentsWithTeachers() : Unit =
  {
    for (i <- 1 to amontOfStudent)
    {
      val random_number_teacher: Int = scala.util.Random.nextInt(amountOfTeachers) + 1
      val random_number_student: Int = scala.util.Random.nextInt(amontOfStudent) + 1

      Office.ListOfTeachers(random_number_teacher - 1).addStudent(Office.ListOfStudents(random_number_student - 1))
    }
  }

  def createCourses(): Unit =
  {
    for (i <- 1 to amountOfTeachers)
    {
      val course = new Course(i.toString(), scala.util.Random.nextInt(100) + 1, scala.util.Random.nextInt(10) + 1)
      Office.ListOfTeachers(i - 1).addCourse(course)
    }
  }

  def investorsActions(): Unit =
  {
    val rand: scala.util.Random = scala.util.Random


  }

  def theLongestCourse(): Unit =
  {
    for (i <- 0 to (Office.ListOfTeachers.length - 1))
    {
      var CurrentCourseDuration: Int = Office.ListOfTeachers(i).ListOfCourse.head.CourseDuration

      if (longestCourseDuration < CurrentCourseDuration)
      {
        longestCourseDuration = CurrentCourseDuration
      }
    }
  }

  def Simulation(): Unit =
  {
    createTeachers()
    createStudents()
    UniteStudentsWithTeachers()
    createCourses()
    theLongestCourse()

// test sell tokens
//    Office.ListOfTeachers(2).printHuman()
//    Office.ListOfTeachers(1).printHuman()
//    Market.sellTokens(Office.ListOfTeachers(1), 100)
//    Office.ListOfTeachers(1).printHuman()
//    Office.ListOfTeachers(2).printHuman()

//test buy Tokens
//    Office.ListOfTeachers(2).printHuman()
//    Office.ListOfTeachers(1).printHuman()
//    Market.buyTokens(Office.ListOfTeachers(1), 100)
//    Office.ListOfTeachers(1).printHuman()
//    Office.ListOfTeachers(2).printHuman()

//    var maxCourseDuration: Int = 0
//    var numberOfTeachers: Int = (Office.ListOfTeachers.length - 1)
//    var amountOfTeacher: Int = Office.ListOfTeachers.size



//    for(i <- 0 to (Office.ListOfTeachers.length - 1))
//    {
//      //var Teacher = Office.ListOfTeachers.apply(i)
//      var temp = Office.ListOfTeachers.apply(i).ListOfCourse.head.CourseDuration
//      for(j <- 0 to (temp - 1))
//      {
//        for(k <- 0 to (Office.ListOfTeachers.apply(i).ListOfStudents.length - 1))
//        {
//          Office.ListOfTeachers.apply(i).giveTask(Office.ListOfTeachers.apply(i).ListOfStudents.apply(k))
//        }
//      }
//    }





    for(i <- 0 to longestCourseDuration)
    {
      var amountOfTeachers: Int =  Office.ListOfTeachers.length

      for(j <- 0 to amountOfTeachers - 1)
      {
        var currentTeacherCourseDuration: Int = Office.ListOfTeachers(j).ListOfCourse.head.CourseDuration
        var currentTeacherStudentsAmount = Office.ListOfTeachers(j).ListOfStudents.length

        if (currentTeacherCourseDuration > i)
        {
          for (k <- 0 to (currentTeacherStudentsAmount - 1))
          {
            Office.ListOfTeachers(j).giveTask(Office.ListOfTeachers(j).ListOfStudents(k))
          }
          Office.ListOfTeachers(j).GetSalary(Market)
        }
      }
    }

    for (i <- 0 to amountOfTeachers - 1)
    {
      Office.ListOfTeachers(i).printHuman()
    }
  }

  def printSimulation(): Unit =
  {
    Simulation()

    //Office.printOffice()
    Market.printMarket()
  }
}
