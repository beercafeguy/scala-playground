//rational numbers does not have mutable state

//curly braces are optional in scala if the class is empty
//this is used mostly for case classes
class Rational(n:Int,d:Int)

//n and d mentioned above are parameter which will be used for creating
//constructor in final class file

val x=16%24

def gcd(x:Int,y:Int):Int= if(y==0) x else gcd(y,x%y)
println(gcd(16,24))


