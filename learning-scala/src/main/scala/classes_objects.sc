class ChecksumAccumulator{
  private var sum=0
  def getSum()=sum
  def add(b:Byte):Unit=sum+=b
  def checksum():Int= ~ (sum & 0xFF) +1;
}

//add method in above class is not a function
//its a procedure

//below is the companion object for defined class
import scala.collection.mutable
import scala.collection.mutable.Map

object ChecksumAccumulator{
  private val cache = mutable.Map.empty[String,Int]
  def calculate(s:String):Int={
    if(cache.contains(s)){
      cache(s)
    }else{
      val acc=new ChecksumAccumulator
      for(c<-s){
        acc.add(c.toByte)
      }
      val cs=acc.checksum()
      cache+=(s ->cs)
      cs
    }
  }
  def companion()="I am companion"
}

val acc=new ChecksumAccumulator
val csa=new ChecksumAccumulator
//acc.sum=3
csa.add(20)
println(csa.getSum())
println(csa.getSum())
println(ChecksumAccumulator.companion())
println(ChecksumAccumulator.calculate("Hem"))

//acc=new ChecksumAccumulator
//above line is not legal because we can't reassign to val

//below line is legal in REPL but not in real code
//val acc=new ChecksumAccumulator



