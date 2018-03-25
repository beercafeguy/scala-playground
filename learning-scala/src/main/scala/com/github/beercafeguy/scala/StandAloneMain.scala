package com.github.beercafeguy.scala

import ChecksumAccumulator.calculate

object StandAloneMain {

  def main(args:Array[String]):Unit={
    println("This is a standalone object because this does not have any companion class")
    val s="Hem Chandra"
    println(calculate(s))
  }
}
