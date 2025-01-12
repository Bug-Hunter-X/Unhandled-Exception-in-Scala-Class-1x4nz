```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge > 0) {
      _age = newAge
    } else {
      throw new IllegalArgumentException("Age must be positive")
    }
  }
}

object Main extends App {
  val myObj = new MyClass("John")
  println(myObj.age) // Output: 0
  myObj.age = 30
  println(myObj.age) // Output: 30
  myObj.age = -10 // This will throw an exception
  println(myObj.age)
}
```