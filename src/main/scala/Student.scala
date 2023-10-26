class Student (name:String  = "No data", surname:String  = "No data", age:Int = 0, email:String = "No data",
               tokens:Int = 0, money:Double = 0) extends Human(name, surname, age, email, tokens, money)
{
  override val role = "Student"
  val rand: scala.util.Random = scala.util.Random
  var desire_to_learn = rand.nextInt(5)
  var generateGrade: Int = scala.util.Random.nextInt(100)
  var list_of_grades: List[Int] = Nil
  var is_studying = true

  override def printHuman(): Unit =
  {
    super.printHuman()
    if (is_studying) println("Studying now")
    else println("Already work")
    println("Average grade = " )
  }

  def doTask(): Int =
  {
    var grade: Int = 0;
    if (0 <= generateGrade && generateGrade <= 34)
    {
      grade = 1
      println("1 з 5")
    }
    else if (35 <= generateGrade && generateGrade <= 59)
    {
      grade = 2
      println("2 з 5")
    }
    else if (60 <= generateGrade && generateGrade <= 74)
    {
      grade = 3
      println("3 з 5")
    }
    else if (75 <= generateGrade && generateGrade <= 89)
    {
      grade = 4
      println("4 з 5")
    }
    else if (90 <= generateGrade && generateGrade <= 100)
    {
      grade = 5
      println("5 з 5")
    }
    list_of_grades = grade :: list_of_grades
    grade
  }
}