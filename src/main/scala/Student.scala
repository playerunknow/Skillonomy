class Student (name:String  = "No data", surname:String  = "No data", age:Int = 0, email:String = "No data",
               tokens:Double = 0, money:Double = 0) extends Human(name, surname, age, email, tokens, money)
{
  override val role = "Student"
  val rand: scala.util.Random = scala.util.Random
  var desire_to_learn = rand.nextInt(5)
  var list_of_grades: List[Int] = Nil
  var is_studying = true


  //geters
  def GetTokens: Double = tokens
  def GetMoney: Double = money

  //seters



  override def printHuman(): Unit =
  {
    super.printHuman()
    if (is_studying) println("Studying now")
    else println("Already work or left")
    print("Grades = " )
    for(i <- 0 to (list_of_grades.length - 1))
    {
      print(list_of_grades.apply(i) + " ")
    }
    println(" ")
  }

  def doTask(): Int =
  {
    val generateGrade: Int = scala.util.Random.nextInt(100)
    var grade: Int = 0;
    if (0 <= generateGrade && generateGrade <= 34)
    {
      grade = 1
    }
    else if (35 <= generateGrade && generateGrade <= 59)
    {
      grade = 2
    }
    else if (60 <= generateGrade && generateGrade <= 74)
    {
      grade = 3
    }
    else if (75 <= generateGrade && generateGrade <= 89)
    {
      grade = 4
    }
    else if (90 <= generateGrade && generateGrade <= 100)
    {
      grade = 5
    }
    list_of_grades = grade :: list_of_grades
    grade
  }

}