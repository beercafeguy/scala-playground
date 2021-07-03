package com.beercafeguy.scala.demo

import scala.io.StdIn

object IODemo {

  def main(args:Array[String]):Unit={

    val name=StdIn.readLine("Type Name: ")
    printf("Name : %s",name)
    println()
    print("Enter Age : ")
    val age=StdIn.readInt()
    print(f"Age: $age")
  }
}
