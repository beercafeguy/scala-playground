package com.github.beercafeguy.scala.csv

import java.nio.file.{Files, Paths}

import org.apache.commons.csv.{CSVFormat, CSVParser}


object CsvReaderApp extends App {

  val fileName="C:\\Users\\beercafeguy\\git\\Spark-The-Definitive-Guide\\data\\flight-data\\csv\\2015-summary.csv";


  val reader=Files.newBufferedReader(Paths.get(fileName))
  val parser=new CSVParser(reader,CSVFormat.DEFAULT.
    withIgnoreHeaderCase().
    withTrim().
    withDelimiter(',').withFirstRecordAsHeader())

  val csvRecords = parser.getRecords
  println(csvRecords.size())
  println(csvRecords.get(0))
  for( i <- 0 until csvRecords.size()){
    val record=csvRecords.get(i)
    println(record.get("DEST_COUNTRY_NAME"))
  }
}
