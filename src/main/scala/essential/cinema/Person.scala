package essential.cinema

class Person(val firstName: String, val lastName: String) {
}

object Person {

  def apply(fullName: String): Person = {
    val names = fullName.split(" ")
    new Person(names(0), names(1))
  }
}
