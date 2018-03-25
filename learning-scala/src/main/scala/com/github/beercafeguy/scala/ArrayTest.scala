package com.github.beercafeguy.scala

object ArrayTest {

  def main(args: Array[String]): Unit = {

    val names=new Array[String](3)
    names(0)="Hem"
    names(1)="Aman"
    names(2)="Abhay"

    names.foreach(println)
  }


}
