package com.beercafeguy.scala.demo

import scala.collection.mutable

object MapDemo {

  // arrays are always mutable
  // Lists are always immutable
  // For sets and maps, we have alternatives of immutable and mutable
  def main(args: Array[String]): Unit = {

    //default Map is always Mutable
    val map=Map(1 -> "Hem",2 -> "Aman", 3 -> "Pooja")
    map.foreach(println)

    // scala.collection.Map<<Trait>> -> scala.collection.immutable.Map<<Trait>> -> scala.collection.immutable.HashMap
    // scala.collection.Map<<Trait>> -> scala.collection.mutable.Map<<Trait>> -> scala.collection.mutable.HashMap

    val employeeMap=mutable.Map[Int,String]()
    employeeMap +=(1 -> "Hem")
    employeeMap +=(2 -> "Aman")
    employeeMap +=((3,"Pooja")) //can pass 2 element tuple as well
    println(employeeMap(2))

  }
}
