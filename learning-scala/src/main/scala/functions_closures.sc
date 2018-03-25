import com.github.beercafeguy.scala.LongLines
import com.github.beercafeguy.scala.LongLinesApp.args

import scala.io.Source

//nested function
object LongLines {
  def processFile(fileName: String, width: Int): Unit = {

    //local function
    //private modifier can only be used with class members
    def processLine(fileName: String, width: Int, line: String) = {
      if (line.length > width)
        println(fileName + " : " + line)
    }
    //one more way to implement same function
    //because local function can access members of there enclosing functions
    def processLine1(line: String) = {
      if (line.length > width)
        println(fileName + " : " + line)
    }

    val source = Source.fromFile(fileName);
    for (line <- source.getLines()) {
      processLine(fileName, width, line)
    }
  }
}

object LongLinesApp{
  def main(args:Array[String]):Unit={
    val width:Int=args(0).toInt;
    for(arg<-args.drop(1))
      LongLines.processFile(arg,width)
  }
}

//functional literals
var increase=(x:Int)=> x+1
increase(10)
increase=(x:Int)=>{
  println("This ")
  println("is")
  println("functional")
  println("literal")
  x+2
}
increase(10)



val x=(x:String) => println("Welcome "+x)
val l=List("Hem","Aman","Ajay")
l.foreach(x)
l.foreach((x:String)=>println(x))

l.filter((x:String)=>x.contains("H")).foreach((x:String)=>println(x))

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach(println)
someNumbers.filter(_>0).foreach(println)
someNumbers.filter(x=>x>0).foreach(println)

//partially applied function
def sum(a:Int,b:Int,c:Int)=a+b+c
val s=sum _
println(s(1,2,3))
val sum13=sum(1,_:Int,3)
println(sum13(12))






