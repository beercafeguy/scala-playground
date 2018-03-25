package com.github.beercafeguy.scala

class Rational(n:Int,d:Int) {

  //this line will go inside constructor


  require(d!=0)
  println(s"Rational created with n=$n and d=$d")
  private val div=gcd(n.abs,d.abs)
  val num:Int=n/div
  val den:Int=d/div

  def this(n:Int)=this(n,1)//auxiliary constructor
  override def toString: String = num+"/"+den

  def +(that:Rational):Rational=this add that
  def *(that:Rational):Rational=new Rational(this.num*that.num,this.den*that.den)
  def add(that:Rational):Rational={
    //though n and d are members of this class but can not be accessed from outside the class
    //because that is not refering to the object on which it was called
    new Rational(this.n*that.den+this.d*that.num,this.d*that.den)
  }

  def lessThan(that:Rational):Boolean=this.num*that.den<that.num*this.den
  def max(that:Rational):Rational=if(this.lessThan(that)) that else this
  private def gcd(x:Int,y:Int):Int= if(y==0) x else gcd(y,x%y)
}
