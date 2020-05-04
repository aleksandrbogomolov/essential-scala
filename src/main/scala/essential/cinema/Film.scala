package essential.cinema

class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {

  /**
   * @return the age of the director at the time of release
   */
  def directorAge: Int = yearOfRelease - director.yearOfBirth

  /**
   * @param in Director object
   * @return return true if film directed by given director, otherwise false
   */
  def isDirectedBy(in: Director): Boolean = in == director

  /**
   * Make copy of the current film.
   *
   * @param name          of film, optional
   * @param yearOfRelease of film, optional
   * @param imdbRating    of film, optional
   * @param director      of film, optional
   * @return copy of current film, with optional new params
   */
  def copy(name: String = name, yearOfRelease: Int = yearOfRelease, imdbRating: Double = imdbRating, director: Director = director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
}
