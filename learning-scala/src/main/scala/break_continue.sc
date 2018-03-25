//No break and continue keywords in SCALA
//he is how it is done in SCALA

var foundIt:Boolean=false
var i:Int=0
val args:Array[String]=Array("Hem","Aman")
while(i<args.length && !foundIt){
  if(args(i).startsWith("H")){
    if(args(i).endsWith("m")){
      foundIt=true
    }
  }
  i=i+1
}
println(foundIt)


//recursion
def printHello(i:Int):Unit={
  if(i>0) {
    print("Hello Recursion")
    printHello(i - 1)
  } else
    return
}

printHello(10)


def printNum(i:Int):Unit={
  if(i>0){
    println(i)
    printNum(i-1)
  }else
    return
}

printNum(6)

//if someone still needs break
//here is how we do this

import scala.util.control.Breaks._

var x=0
breakable{
  while(true){
    println("?")
    if(x==1)
      break
    x=x+1
  }
}

