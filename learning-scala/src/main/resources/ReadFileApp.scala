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