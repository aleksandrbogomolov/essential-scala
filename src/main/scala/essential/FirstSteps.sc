println("Welcome to the Scala worksheet")

1 + 1

"Hello world!".toUpperCase()

2.min(3)

"3".toInt

"the quick brown fox" split " "

object Test {
  def name: String = "Probably the best object ever"
}

Test.name

object Test7 {
  val simpleField = {
    println("Evaluating simpleField")
    42
  }

  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}

Test7.simpleField

Test7.simpleField
