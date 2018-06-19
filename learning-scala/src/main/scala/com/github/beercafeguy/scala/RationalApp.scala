package com.github.beercafeguy.scala

object RationalApp extends App {
  implicit def intToRational(x:Int):Rational=new Rational(x)
  val r1=new Rational(2,3)
  //below statement is not legal
  //println(r1.n)
  println(r1.den)
  println(s"print onject with toString:$r1")

  println("Calling add on rational...")
  println(r1 add (new Rational(4,5)))

  val n2=new Rational(2)
  //def gcd(x:Int,y:Int):Int= if(y==0) x else gcd(y,x%y)
  //println(gcd(16,24))
  println(new Rational(66,42))
  println(r1 * n2)

  val x=2
  println(s"Adding Integer: ${x} with Rational: ${r1}")
  println(r1+x)
}
