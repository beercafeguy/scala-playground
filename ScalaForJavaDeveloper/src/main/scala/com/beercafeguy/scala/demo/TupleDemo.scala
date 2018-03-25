package com.beercafeguy.scala.demo

//like list Tuples are also immutable but unlike list Tuple can contain the object of any type
object TupleDemo {

  def main(args: Array[String]): Unit = {
    val pair=(1,"Hem Chandra")
    println(pair._1+":"+pair._2)

    //one might wonder, why can't I access tuple like array i.e. pair(0), pair(1) etc.
    //The reason remains in the implementation of apply method
    // apply method return type always remains fixed but tuple may return anything
    // so apply() method can't be used

  }
}
