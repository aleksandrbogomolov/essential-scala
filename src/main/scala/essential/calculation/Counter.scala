package essential.calculation

case class Counter(in: Int = 0) {

  def inc(int: Int = 1): Counter = Counter(in + int)

  def dec(int: Int = 1): Counter = Counter(in - int)

  def adjust(adder: Adder): Counter = Counter(adder(in))
}
