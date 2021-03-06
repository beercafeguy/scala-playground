package com.github.beercafeguy.scala

import scala.io.Source
object LongLines {

  def processFile(fileName:String,width:Int):Unit={

    val source=Source.fromFile(fileName);
    for(line<-source.getLines()){
      processLine(fileName,width,line)
    }
  }

  def processLine(fileName:String,width:Int,line:String):Unit={
    if(line.length>width)
      println(fileName+" : "+line)
  }
}
