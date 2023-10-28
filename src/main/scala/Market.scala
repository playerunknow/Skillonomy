class Market(val tokensAvailable: Double = 10000, val moneyAvailable: Double = 100000, val allTokens: Double = 10000)
{
  var rate: Double = moneyAvailable / allTokens
  var _tokensAvailable = tokensAvailable
  var _moneyAvailable = moneyAvailable
  var _allTokens = allTokens


  def sellTokens(human: Human, number: Int): Unit =
  {
    if (number * rate > moneyAvailable) {
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
