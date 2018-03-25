package com.beercafeguy.scala.demo

import scala.io.Source

object ReadFileDemo {

  def main(args: Array[String]): Unit = {
    if(args.length==1){
      for(line <- Source.fromFile(args(0)).getLines())
        println("line.length"+line.length+":"+line)
    }else{
      println("Usage: <class name> <file location>")
    }
  }
}
