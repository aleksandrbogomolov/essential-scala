package essential.cats

import essential.UnitSpec

class ChipShopTest extends UnitSpec {

  "A will serve functions" should "return true if cat's favourite food is 'Chips', otherwise return false" in {
    val cat1 = new Cat("Oswald", "Black", "Milk")
    val cat2 = new Cat("Henderson", "Ginger", "Chips")
    val cat3 = new Cat("Quentin", "Tabby and white", "Curry")

    assert(!ChipShop.willServe(cat1))
    assert(ChipShop.willServe(cat2))
    assert(!ChipShop.willServe(cat3))
  }
}
