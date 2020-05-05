package essential.calculation

class Counter(val in: Int) {

  def inc(int: Int = 1): Counter = new Counter(in + int)

  def dec(int: Int = 1): Counter = new Counter(in - int)

  def adjust(adder: Adder): Counter = new Counter(adder.add(in))
}
