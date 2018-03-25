val a=0;
{
  val a=1
  println(a)
}
println(a)


def printNumbers(lowerLimit:Int,higherLimit:Int):Unit={
  if(lowerLimit>higherLimit){
    return
  }else {
    print(lowerLimit + " ")
    printNumbers(lowerLimit + 1, higherLimit)
  }
}

def printNum(i: Int): Unit ={
  printNumbers(0,i)
}

printNum(20)

