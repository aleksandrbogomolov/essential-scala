package essential.cinema

import essential.UnitSpec

class DirectorTest extends UnitSpec {

  val eastwood = new Director("Clint", "Eastwood", 1930)
  val mcTiernan = new Director("John", "McTiernan", 1951)
  val nolan = new Director("Christopher", "Nolan", 1970)
  val someBody = new Director("Just", "Some Body", 1990)

  "An older" should "return the oldest of the two" in {
    assertResult(nolan) {
      Director.older(nolan, someBody)
    }
  }
}
