package essential.calculation

import essential.UnitSpec

class CalcTest extends UnitSpec {

  "A Calc square" should "return square of value" in {
    assert(Calc.square(2) == 4)
    assert(Calc.square(2.0) == 4.0)
  }

  "A Calc cube" should "return cube of value" in {
    assert(Calc.cube(2) == 8)
    assert(Calc.cube(2.0) == 8.0)
  }
}
