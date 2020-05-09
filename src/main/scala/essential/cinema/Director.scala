package essential.cinema

class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {

  def name: String = s"$firstName $lastName"
}

object Director {

  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = new Director(firstName, lastName, yearOfBirth)

  def older(first: Director, second: Director): Director = if (first.yearOfBirth > second.yearOfBirth) second else first
}
