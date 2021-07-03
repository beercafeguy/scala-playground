package loops

object Shadowing {

  def main(args: Array[String]): Unit = {

    val n=10;
    for(n <- 1 to 5){
      print(n+ " ")
    }
    println()
    println(n) // this won't be shadowed by for loop local variable
  }
}
