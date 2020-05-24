package essential.cinema

case class Film(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {

  /**
   * @return the age of the director at the time of release
   */
  def directorAge: Int = yearOfRelease - director.yearOfBirth

  /**
   * @param in Director object
   * @return return true if film directed by given director, otherwise false
   */
  def isDirectedBy(in: Director): Boolean = in == director
}

object Film {

  /**
   * Accepts two Films and returns the highest imdbRating of the two.
   */
  def highestRating(first: Film, second: Film): Double = {
    if (first.imdbRating > second.imdbRating) first.imdbRating else second.imdbRating
  }

  /**
   * Accepts two Films and returns the Director who was oldest at the respective time of filming.
   */
  def oldestDirectorAtTheTime(first: Film, second: Film): Director = {
    if (first.director.yearOfBirth > second.director.yearOfBirth) second.director else first.director
  }
}
