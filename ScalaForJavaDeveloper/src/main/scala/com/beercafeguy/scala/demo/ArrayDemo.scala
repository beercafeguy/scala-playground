package com.beercafeguy.scala.demo

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    val names="Hem Chandra".split(" ")
    names.foreach(println)


    val proffessions=new Array[String](3)
    proffessions(0)="Dev"
    proffessions(1)="QA"
    proffessions(2)="BA"
    proffessions.foreach(println(_))
  }
}
