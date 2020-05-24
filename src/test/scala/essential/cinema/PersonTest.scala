package essential.cinema

import essential.UnitSpec

class PersonTest extends UnitSpec {

  "An apply with one param" should "return the new Person with first and last name" in {
    val person = Person("Aleksandr Bogomolov")
    assertResult("Aleksandr") {
      person.firstName
    }
    assertResult("Bogomolov") {
      person.lastName
    }
  }
}
