class Market(var tokensAvailable: Double = 10000, var moneyAvailable: Double = 100000, var allTokens: Double = 10000)
{
  var rate: Double = moneyAvailable / allTokens

  // getters
  def Rate: Double = moneyAvailable / allTokens
  def TokensAvailable: Double = tokensAvailable
  def MoneyAvailable: Double = moneyAvailable
  def AllTokens: Double = allTokens

  // setters

  def setTokensAvailable(Value:Double): Unit =
  {
    tokensAvailable = Value
  }
  def setMoneyAvailable(Value: Double): Unit =
  {
    moneyAvailable = Value
  }
  def setAllTokens(Value: Double): Unit =
  {
    allTokens = Value
  }


  def sellTokens(human: Human, number: Int): Unit =
  {
    if (number * rate > moneyAvailable)
    {
      println("Sorry, Market doesn't have enough money now. Please, try later or sell less tokens")
      return
    }
    if (human.tokens >= number)
    {
      //human.tokens -= number
      //human.money += (number * rate).toInt
      //_moneyAvailable -= number * rate
      //_tokensAvailable += number
      // дописать
      //human.tokens = 0;
    }
    else
    {
      println("you haven't enough tokens")
    }
    recalculationRate()
  }

  def recalculationRate(): Unit =
  {
    rate = moneyAvailable / allTokens
  }

  def printMarket(): Unit =
  {
    println(s"All tokens = ${allTokens}, tokens availible = ${tokensAvailable}, money = ${moneyAvailable}, rate of currency = $rate")
  }


}
