import scala.io._
val orderItems=Source.fromFile("C:/Users/hchandra/git/data/retail_db/order_items/part-00000") 
val t10=orderItems.take(10)
t10.foreach(println)

val orderItems=Source.fromFile("C:/Users/hchandra/git/data/retail_db/order_items/part-00000").getLines
val t10=orderItems.take(10)
t10.foreach(println)


val orderItems=Source.fromFile("C:/Users/hchandra/git/data/retail_db/order_items/part-00000").getLines.toList
val orderItemsCleaned=orderItems.filter(orderItem => orderItem.split(",")(1).toInt == 2) //only records with order it 2
val orderItemsAmount=orderItemsCleaned.map(orderItem => orderItem.split(",")(4).toFloat)
val orderItemsAmountSum=orderItemsAmount.reduce((a,b)=>{ println(a+":"+b+"="+(a+b));a+b})

val t=() //start tuple
val thirdValue=t._3


import scala.io.Source

object ReadFileApp{
	def main(args:Array[String]):Unit={
		val orderItems=Source.fromFile("C:/Users/hchandra/git/data/retail_db/order_items/part-00000").getLines.toList
		val orderItemsCleaned=orderItems.filter(_.split(",")(1).toInt == 2) //only records with order it 2
		val orderItemsAmount=orderItemsCleaned.map(_.split(",")(4).toFloat)
		val orderItemsAmountSum=orderItemsAmount.reduce(_+_)
		println("Total Revenue:"+orderItemsAmountSum)
	}
}


 // In root directory of project
sbt package
sbt run
//or
sbt "run-main com.github.beercafeguy.scala.collections.ReadFileApp 2"


val explodeDF = parquetDF.explode($"address") {
  case Row(address: Address) => address.map{ address =>
    val firstName = address(0).asInstanceOf[Int]
    val lastName = address(1).asInstanceOf[String]
    val email = address(2).asInstanceOf[String]
    val salary = address(3).asInstanceOf[Int]
    Employee(firstName, lastName, email, salary)
  }
}.cache()

