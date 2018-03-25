package com.github.beercafeguy.scala

object LongLinesApp extends App {

  val width:Int=args(0).toInt;
  //val fileName:String="README.md"
  for(arg<-args.drop(1))
    LongLines.processFile(arg,width)

}
