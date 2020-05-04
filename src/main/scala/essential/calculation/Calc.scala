package essential.calculation

object Calc {

  def square(in: Double): Double = in * in

  def square(in: Int): Int = in * in

  def cube(in: Double): Double = in * square(in)

  def cube(in: Int): Int = in * square(in)
}
