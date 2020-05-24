package essential.cinema

object Stormtrooper {

  def inspect(person: Person): String = {
    person match {
      case Person("Luke", "Skywalker") => "Stop, rebel scum!"
      case Person("Han", "Solo") => "Stop, rebel scum!"
      case Person(first, last) => s"Move along, $first"
    }
  }
}
