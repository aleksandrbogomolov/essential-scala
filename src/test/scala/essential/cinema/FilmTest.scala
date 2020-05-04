package essential.cinema

import essential.UnitSpec

class FilmTest extends UnitSpec {

  val eastwood = new Director("Clint", "Eastwood", 1930)
  val mcTiernan = new Director("John", "McTiernan", 1951)
  val nolan = new Director("Christopher", "Nolan", 1970)
  val someBody = new Director("Just", "Some Body", 1990)

  val memento = new Film("Memento", 2000, 8.5, nolan)
  val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
  val inception = new Film("Inception", 2010, 8.8, nolan)
  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
  val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
  val invictus = new Film("Invictus", 2009, 7.4, eastwood)
  val predator = new Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

  "A directorAge" should "return the age of the director at the time of release" in {
    assert(memento.directorAge == 30)
  }

  it should "return correct age of the director at the time of release" in {
    assert(memento.directorAge != 31)
  }

  "An isDirectedBy" should "return true if film directed by given director" in {
    assert(highPlainsDrifter.isDirectedBy(eastwood))
  }

  it should "return false if film not directed by given director" in {
    assert(!highPlainsDrifter.isDirectedBy(someBody))
  }

  "A copy" should "return full copy of current film if no new params added" in {
    val copy = inception.copy()
    assert(copy.name == inception.name)
    assert(copy.yearOfRelease == inception.yearOfRelease)
    assert(copy.imdbRating == inception.imdbRating)
    assert(copy.director == inception.director)
  }

  it should "return copy of current film with new name param" in {
    val newName = "Kukuepta"
    val copyMemento = memento.copy(name = newName)
    assert(copyMemento.name == newName)

    assert(copyMemento.yearOfRelease == memento.yearOfRelease)
    assert(copyMemento.imdbRating == memento.imdbRating)
    assert(copyMemento.director == memento.director)
  }

  it should "return copy of current film with new yearOfRelease param" in {
    val newYearOfRelease = 2011
    val copyDarkKnight = darkKnight.copy(yearOfRelease = newYearOfRelease)
    assert(copyDarkKnight.yearOfRelease == newYearOfRelease)

    assert(copyDarkKnight.name == darkKnight.name)
    assert(copyDarkKnight.imdbRating == darkKnight.imdbRating)
    assert(copyDarkKnight.director == darkKnight.director)
  }

  it should "return copy of current film with new imdbRating param" in {
    val newImdbRating = 8.4
    val copyUnforgiven = unforgiven.copy(imdbRating = newImdbRating)
    assert(copyUnforgiven.imdbRating == newImdbRating)

    assert(copyUnforgiven.name == unforgiven.name)
    assert(copyUnforgiven.yearOfRelease == unforgiven.yearOfRelease)
    assert(copyUnforgiven.director == unforgiven.director)
  }

  it should "return copy of current film with new director param" in {
    val copyGranTorino = granTorino.copy(director = someBody)
    assert(copyGranTorino.director == someBody)

    assert(copyGranTorino.name == granTorino.name)
    assert(copyGranTorino.yearOfRelease == granTorino.yearOfRelease)
    assert(copyGranTorino.imdbRating == granTorino.imdbRating)
  }
}
