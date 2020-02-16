package example

trait Greeting {
  lazy val greeting: String = "hello world!"

  val list = List(List(1, 2), List(3, 4))

  val expected: List[Array[Int]] = ???
  val target: List[Array[String]] = expected  // force error
}

object Hello extends Greeting with App {
  println(greeting)
}


