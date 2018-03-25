import java.io.{File, FileNotFoundException}

var fileName="file.txt"
if(fileName.contains(".txt"))
  fileName="1"+fileName;
println(fileName)


val name=if(true) "Hem" else "Aman"


def gcd(x:Int,y:Int):Int={
  var a=x;
  var b=y;
  while(a!=0){
    var tmp=a;
    a=b%a;
    b=tmp;
  }
  b
}

println(gcd(16,24))


def greet():Unit=println("Hello")
val a=greet()
println(a)

val files=List(new java.io.File(".").listFiles)

for(file <- files)
  println(file)

for (i <- 1 until 10 if i%2==0)
  i

val numbers=for(
  i <- 1 to 10
  if (i!=5)
  if (i%2==0)

) yield {
  println(i)
  i+1
}

def half(n:Int):Int= if(n%2==0) n / 2 else throw new RuntimeException("n must be even")
println(half(34))
println(half(33))

try{
  val f=new File("input.txt")
}catch{
  case ex:FileNotFoundException => println("File not found")
  case ex:java.io.IOException => println("Some other IO issue")
}

@throws(classOf[java.io.IOException])
def readFile(location:String)={

  println(location)
}









