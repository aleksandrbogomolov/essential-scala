package essential.cinema

import essential.UnitSpec

class StormtrooperTest extends UnitSpec {

  def fixture = {
    new {
      val stop = "Stop, rebel scum!"
      val move = "Move along, "
    }
  }

  "An inspect" should "return 'Stop, rebel scum!', when Luke or Han check" in {
    assertResult(fixture.stop) {
      Stormtrooper.inspect(Person("Luke Skywalker"))
    }
    assertResult(fixture.stop) {
      Stormtrooper.inspect(Person("Han Solo"))
    }
  }

  "An inspect" should "return 'Move along, ' + first name, when other person check" in {
    assertResult(fixture.move + "Noel") {
      Stormtrooper.inspect(Person("Noel Welsh"))
    }
  }
}
