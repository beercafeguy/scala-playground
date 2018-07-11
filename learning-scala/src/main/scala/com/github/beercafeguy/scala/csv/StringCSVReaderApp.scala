package com.github.beercafeguy.scala.csv

import java.io.StringReader

import org.apache.commons.csv.{CSVFormat, CSVParser}

object StringCSVReaderApp extends App{
  //private val FILE_HEADER_MAPPING = Array("DEST_COUNTRY_NAME", "ORIGIN_COUNTRY_NAME", "count")
  processDelimitedLine("\"Bonaire, Sint Eustatius, and Saba\",United States,58")
  def processDelimitedLine(record:String): Unit ={
    val reader=new StringReader(record)
    val parser=new CSVParser(reader,CSVFormat.DEFAULT.
      withTrim().
      withDelimiter(','))
      //.withHeader("DEST_COUNTRY_NAME", "ORIGIN_COUNTRY_NAME", "count"))
    val csvRecords = parser.getRecords
    println(csvRecords.get(0))
    println(csvRecords.get(0).get(0))
  }
}
