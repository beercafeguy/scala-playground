//here c is a closure
//because it is closing a free variable a
var a=2000;
val c=(x:Int) => x+a;
println(c(20))
a=3000
println(c(20))

val someNumbers=List(-10,-5,0,4,9)
var sum:Int=0
someNumbers.foreach(sum += _)
println(sum)

def makeIncrease(more:Int)= (x:Int)=>x+more
val incByOne=makeIncrease(1)
println(incByOne(10))

//variable length argument lists
def echo(args:String*)={
  for(arg<-args)
    println(arg)
}
echo("Hem","Joy")

//named functions
def speed(distance:Float,time:Float):Float=distance/time
println(speed(100,10))
println(speed(distance = 100,time=20))

def printNum(limit:Int): Unit ={
  if(limit==0){
    return
  }else{
    println(limit)
    printNum(limit-1)
  }
}

printNum(5)

def printNumWhile(limit:Int): Unit ={
  var x=limit;
  while(x!=0){
    println(x)
    x=x-1
  }
}
printNumWhile(5)

val funValue=nestedFun(_)
def nestedFun(x:Int): Unit ={
  if(x!=0){
    println(x)
    funValue(x-1)
  }
}

