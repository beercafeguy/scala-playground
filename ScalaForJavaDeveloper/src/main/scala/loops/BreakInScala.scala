package loops

import scala.util.control.Breaks._
object BreakInScala {
  def main(args: Array[String]): Unit = {

    breakable{
      for(ch <- "Scala"){
        println(ch)
        if(ch == 'c'){
          break()
        }
      }
    }
  }
}
