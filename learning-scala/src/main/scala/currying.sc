import java.io.{File, PrintWriter}

//non curried function
def oldSum(x:Int,y:Int)=x+y
oldSum(1,2)

//curried function
def curriedSum(x:Int)(y:Int)=x+y
curriedSum(1)(2)

//function similar to curriedSum
def first(x:Int)=(y:Int) =>x+y
val second=first(1)
second(2)

//get the actual reference of second function
val onePlus=curriedSum(1)_
onePlus(2)


//calling own parameter on its own
def twice(op:Double => Double,x:Double)=op(op(x))
twice(_*2,3)

//write your own control structures
//This technique is called as Loan Pattern
def withPrintWriter(file:File,op:PrintWriter =>Unit)={
  val writer=new PrintWriter(file)
  try{
    op(writer)
  }finally {
    writer.close()
  }
}

withPrintWriter(
  new File("."),
  _.println(new java.util.Date())
)

println {"Hello WORLD"}




