package com.beercafeguy.scala.json

import java.nio.file.{Files, Paths}

import java.util.HashMap
import java.lang.reflect.Type

import net.liftweb.json._

object JsonParserDemo {

  def main(args: Array[String]): Unit = {

    val configJsonLocation="C:\\Users\\hemc943\\git\\scala-playground\\SbtLibTest\\hive_to_hbase.json"
    val content = new String(Files.readAllBytes(Paths.get(configJsonLocation)))
    println(content)

    val jsonJVal: JValue = parse(content)
    val jsonMap: Map[String,Any] = jsonJVal.values.asInstanceOf[Map[String,Any]]
    for ((key,value) <- jsonMap) {
      println("key = " + key + ", value = " + value.toString)
    }

    println("Key 1's value is " + jsonMap("hiveTableName"))
    //val t = new TypeToken[HashMap[String,String]]() {}.getType
    //val jobConfig=new Gson().fromJson(content, t)
    //println(jobConfig)
    //val hiveTableName=jobConfig.getOrElse("hiveTableName","hiveTableNameNotFound")
    //println(s"Hive table Name ${hiveTableName}")

    val in="Hem Chandra"
    println(in.replace(" ",""))
  }
}
