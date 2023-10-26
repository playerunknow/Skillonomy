object Main {
  def main(args: Array[String]): Unit =
  {
    val Market = new Market()
    val Office = new Office()

    val Simulation = new Simulation(10, Market, Office)
    println("Simulation print: ->")
    Simulation.printSimulation()

  }
}