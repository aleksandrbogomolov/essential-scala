package essential.cinema

case class Director(firstName: String, lastName: String, yearOfBirth: Int) {

  def name: String = s"$firstName $lastName"
}

object Director {

  def older(first: Director, second: Director): Director = if (first.yearOfBirth > second.yearOfBirth) second else first
}
