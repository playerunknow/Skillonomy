class Investor (Market: Market, name:String  = "No data", surname:String  = "No data", age:Int = 0, email:String = "No data",
                tokens:Int = 0, money:Double = 0, money_invested:Double = 0) extends Human(name, surname, age, email, tokens, money)
{
  override val role = "Investor"

  // getters
  def MoneyInvested: Double = money_invested

  def getMoney(): Unit =
  {
    Market.sellTokens(this, tokens)
  }

}