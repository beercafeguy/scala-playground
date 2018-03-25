package com.github.beercafeguy.scala

import ChecksumAccumulator.calculate
object AppTraitTest extends App {

  for (i <-List("One","Two","Three")){
    println(calculate(i))
  }
}
