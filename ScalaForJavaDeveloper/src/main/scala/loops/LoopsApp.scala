package loops

object LoopsApp {
  def main(args: Array[String]): Unit = {

    println("Here are loops")

    //while loop
    var n=0;
    while(n<=10){
      print(n+" ")
      n+=1
    }

    println()

    //for loop
    for(i <- 1 to 10 if i%2==0){
      print(i+" ")
    }

    println()

    //loping string
    for(ch <- "Hello"){
      print(ch+" ")
    }

    println(
    )

    //string with index
    val input="Scala"
    var sum=0
    for(i <- 0 to input.length -1 ){
      sum+=input(i) // adding chars as int
    }
    println(sum)

    sum=0
    for(ch <- input){sum+=ch}
    println(sum)
  }
}
