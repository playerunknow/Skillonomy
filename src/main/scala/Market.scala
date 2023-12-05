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

  def sellTokens(human: Human, number: Double): Unit =
  {
    var LocalNumber: Double = number
    if (number * rate > moneyAvailable)
    {
      println("Sorry, Market doesn't have enough money now. Please, try later or sell less tokens")
      return
    }
    if (human.tokens >= number)
    {
      human.tokens -= number
    }
    else
    {
      LocalNumber -= human.tokens
      human.tokens = 0
    }
    human.money += (LocalNumber * rate).toInt
    moneyAvailable -= LocalNumber * rate
    tokensAvailable += LocalNumber
    recalculationRate()
  }

  def buyTokens(human: Human, number: Double): Unit =
  {
    var LocalNumber: Double = number
    if (number > tokensAvailable)
    {
      println("Sorry, Market doesn't have enough tokens now. Please, try later or buy less tokens")
      return
    }
    if (human.money >= number * rate) human.money -= (number * rate).toInt
    else
    {
      LocalNumber -= (human.money / rate).toInt
      human.money = 0
    }
    human.tokens += number
    tokensAvailable -= LocalNumber
    moneyAvailable += (LocalNumber * rate).toInt
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
