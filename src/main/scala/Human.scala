abstract class Human(val name: String = "No Data", val surname: String = "No Data", val age: Int = 0,
                             val email: String = "No Data", var tokens: Int = 0, var money: Double = 0)
{
  var Tokens: Int = tokens
  private val Money: Double = money
  val role: String = "No Data"
  
  def printHuman() : Unit = 
  {
    println(s"${role} ${name} ${surname}: ${role}, ${age} years old, email - ${email}, tokens - ${Tokens}, money - ${money}")
  }
}