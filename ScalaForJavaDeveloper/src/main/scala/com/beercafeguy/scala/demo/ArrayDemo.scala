package com.beercafeguy.scala.demo

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    val names="Hem Chandra".split(" ")
    names.foreach(println)


    val professions=new Array[String](3)
    professions(0)="Dev"
    professions(1)="QA"
    professions(2)="BA"
    professions.foreach(println(_))

    //another way of printing array elements
    // this is considered as more of imperative programming
    for (i  <- 0 to 2)
      //println(professions(i))
      println(professions.apply(i))

    //note that professions(i) will be transformed as professions.apply(1)

    val nums=Array[Integer](1,2,3,4,5); //using the companion object of Array class
    nums.foreach(print)

    println()
    val salaries=Array.apply(12345.6,121212.4,456734.6)
    salaries.foreach(println(_))

  }
}
