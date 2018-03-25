package com.beercafeguy.scala.demo

import scala.collection.mutable

// arrays are always mutable
// Lists are always immutable
// For sets and maps, we have alternatives of immutable and mutable
object SetDemo {

  def main(args: Array[String]): Unit = {
    val mySet=Set(1,2,2,3)
    mySet.foreach(println)//this will only print 1,2,3 because Set can't have duplicates

    // scala.collection.Set<<Trait>> -> scala.collection.immutable.Set<<Trait>> -> scala.collection.immutable.HashSet
    // scala.collection.Set<<Trait>> -> scala.collection.mutable.Set<<Trait>> -> scala.collection.mutable.HashSet

    var drinkSet=Set("Beer","Rum","Scotch")
    drinkSet+="Wine" //same as drinkSet = drinkSet + "Wine"
    println(drinkSet.contains("Wine"))

    val mutableSet=mutable.Set(1,2,3,4)
    mutableSet+=10 // notice that I am mutating the actual set
    println(mutableSet.contains(10))

  }
}
