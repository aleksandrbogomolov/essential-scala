package essential.calculation

import essential.UnitSpec

class CounterTest extends UnitSpec {

  def fixture =
    new {
      val counter = Counter(10)
    }

  "The method inc" should "return new Counter with incremented value" in {
    val counter = fixture.counter
    assertResult(11) {
      counter.inc().in
    }
  }

  "The method dec" should "return new Counter with decremented value" in {
    val counter = fixture.counter
    assertResult(9) {
      counter.dec().in
    }
  }

  "The methods inc and dec" should "return new Counter with incremented and decremented the counter respectively" in {
    val counter = fixture.counter
    assertResult(12) {
      counter.inc().dec().inc().inc().in
    }
  }

  "The method inc with param" should "return new Counter with incremented value" in {
    val counter = fixture.counter
    assertResult(12) {
      counter.inc(2).in
    }
  }

  "The method dec with param" should "return new Counter with decremented value" in {
    val counter = fixture.counter
    assertResult(8) {
      counter.dec(2).in
    }
  }

  "The method adjust" should "return a new Counter with the result of applying the Adder to the count" in {
    val counter = fixture.counter
    val adder = new Adder(10)
    assertResult(20) {
      counter.adjust(adder).in
    }
  }
}
