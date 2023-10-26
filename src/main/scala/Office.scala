class Office
{
  val Country = "Ukraine"

  var ListOfTeachers: List[Teacher] = Nil
  var ListOfInvestors: List[Investor] = Nil
  var ListOfStudents: List[Student] = Nil


  def addTeacher(teacher: Teacher): Unit =
  {
    ListOfTeachers = teacher :: ListOfTeachers
  }

  def addInvestor(investor: Investor): Unit =
  {
    ListOfInvestors = investor :: ListOfInvestors
  }

  def addStudent(student: Student): Unit =
  {
    ListOfStudents = student :: ListOfStudents
  }

  def printOffice(): Unit =
  {
    println("<---Office--->")
    println("Country: " + Country)
    println("Teachers: ")
    for (teacher <- ListOfTeachers) teacher.printHuman()
    println(" ")
    println("Investors: ")
    for (investor <- ListOfInvestors) investor.printHuman()
    println("--------------------------------------------")
  }
}
