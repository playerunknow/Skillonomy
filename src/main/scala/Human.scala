abstract class Human(val name: String = "No Data", val surname: String = "No Data", val age: Int = 0,
                             val email: String = "No Data", var tokens: Double = 0, var money: Double = 0)
{
  //var Tokens: Double = tokens        may cause a problem
  //private val Money: Double = money       may cause a problem
  val role: String = "No Data"

  def Tokens: Double = tokens
  def Money: Double = money
  def Role: String = "No Data"
  
  def printHuman() : Unit = 
  {
    println(s"${role} ${name} ${surname}: ${role}, ${age} years old, email - ${email}, tokens - ${Tokens}, money - ${money}")
  }
}