package com.beercafeguy.scala.demo

object ListDemo {

  def main(args: Array[String]): Unit = {

    //scala lists are immutable
    val numbers=List(1,2,3,4,5)
    numbers.foreach(print)

    println()

    val oneTwo=List(1,2)
    val threeFour=List(3,4)
    val oneTwoThreeFour=oneTwo:::threeFour
    oneTwoThreeFour.foreach(print)

    println()
    val oneTwoThreeFourNil=oneTwo:::threeFour:::Nil //::: is a method to concat
    oneTwoThreeFourNil.foreach(print)

    println
    //using cons
    val zeroOneTwo=0::oneTwo
    println("List "+oneTwo+" after using :(con) is "+zeroOneTwo)
    //interesting part in above example is
    // method invocation is like oneTwo.::(0) instead of 0.::(oneTwo)
    // This kind of invocation is called as right invocation

    val zeroToFive=0::1::2::3::4::5::Nil
    println("Zero to five:"+zeroToFive)
    val length=zeroToFive.count(_>3)
    println("Length of the list for values more then 3 is:"+length)
    println("Check if zero exists: "+zeroToFive.exists(_==0))
    println("First Element:"+zeroToFive.head)
    println("All except first element:"+zeroToFive.tail)
    println("Last Element:"+zeroToFive.last)
    println("All except last element:"+zeroToFive.init)
    println("Increase by 1")
    println(zeroToFive.map(_+1))
    println("Convert to String: "+zeroToFive.mkString(","))
    println("Even numbers from list: "+zeroToFive.filter(_%2==0))
    println("Odd numbers from list: "+zeroToFive.filter(_%2!=0))

    println("Reverse the list:"+zeroToFive.reverse)
  }
}
