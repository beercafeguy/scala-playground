package com.github.beercafeguy.scala

object CollectionsDemo {
  def main(args: Array[String]): Unit = {

    //Tuple
    val tuple=("Hem","Aman","Ajay")

    println(tuple)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    val m="Name" -> "Hem"
    println(m._1+":"+m._2)

    val mixTuple=(1,"Two",3.0) //mixed tuple
    println(mixTuple)

    //List -> Can't hold objects of different types

    val l=List("Delhi","Bangalore","Kochi")
    println(l(2))
    for( x <- l){
      println(x)
    }

    l.map(_.toUpperCase.reverse).foreach(println(_))
    val numbers=List(1,2,3,4,5)
    val sum=numbers.reduce((x,y)=>x+y)
    println(sum)
    val n= (1 to 100).toList.reduce((x,y)=>x+y)
    println(n)

    //Maps
    val nameMap=Map("Hem" -> "Bangalore","Ankur" -> "Delhi","Aman" -> "Noida")
    println(nameMap("Hem"))
    val x= util.Try(nameMap("Test")) getOrElse "NA"
    println(x)
  }
}
