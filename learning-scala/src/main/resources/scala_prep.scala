class User(id:Int,name:String){
println("Inside constructor for User")
override def toString()="User("+id+":"+name+")"
}

object User{
def apply(id:Int,name:String):User={
new User(id,name)
}
}

//Case classes
case class User(id:Int,name:String){
println("Inside constructor for User")
//override def toString()="User("+id+":"+name+")"
}


case class User(var id:Int,var name:String){
println("Inside constructor for User")
//override def toString()="User("+id+":"+name+")"
}


object User{
def apply(id:Int,name:String):User={
new User(id,name)
}
}

                       ^

scala> HelloScala.main(Array[String](""))
Hello Scala!

scala> class Order(orderId:Int,orderDate:String,orderCustomerId:Int,orderCustomerStatus:String){
     | println("I am in Order constructor")
     | override def toString()={
     | "Order("+orderId+":"+orderDate+":"+orderCustomerId+":"+orderCustomerStatus+")"
     | }
     | }
defined class Order

scala> object Order{
     | def apply(orderId:Int,orderDate:String,orderCustomerId:Int,orderCustomerStatus:String){
     | Terminate batch job (Y/N)? N

C:\Users\hchandra>class User(id:Int,name:String){
'class' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\hchandra>println("Inside constructor for User")
'println' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\hchandra>override def toString()="User("+id+":"+name+")"
'override' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\hchandra>:paste
C:\Users\hchandra>scala
Welcome to Scala 2.12.3 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_151).
Type in expressions for evaluation. Or try :help.

scala> :paste
// Entering paste mode (ctrl-D to finish)

class User(id:Int,name:String){
println("Inside constructor for User")
override def toString()="User("+id+":"+name+")"
}

object User{
def apply(id:Int,name:String):User={
new User(id,name)
}
}

// Exiting paste mode, now interpreting.

defined class User
defined object User

scala> User(101,"Hem")
Inside constructor for User
res0: User = User(101:Hem)

scala> val u1=User(101,"Hem")
Inside constructor for User
u1: User = User(101:Hem)

scala> :javap -p User
Compiled from "<console>"
public class $line3.$read$$iw$$iw$User {
  private final int id;
  private final java.lang.String name;
  public java.lang.String toString();
  public $line3.$read$$iw$$iw$User(int, java.lang.String);
}

scala> :javap -p User$
Compiled from "<console>"
public class $line3.$read$$iw$$iw$User$ {
  public static $line3.$read$$iw$$iw$User$ MODULE$;
  public static {};
  public $line3.$read$$iw$$iw$User apply(int, java.lang.String);
  public $line3.$read$$iw$$iw$User$();
}

scala> :paste
// Entering paste mode (ctrl-D to finish)

case class User(id:Int,name:String){
println("Inside constructor for User")
override def toString()="User("+id+":"+name+")"
}

// Exiting paste mode, now interpreting.

defined class User

scala> :javap -p User
Compiled from "<pastie>"
public class $line6.$read$$iw$$iw$User implements scala.Product,scala.Serializable {
  private final int id;
  private final java.lang.String name;
  public int id();
  public java.lang.String name();
  public java.lang.String toString();
  public $line6.$read$$iw$$iw$User copy(int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public boolean equals(java.lang.Object);
  public $line6.$read$$iw$$iw$User(int, java.lang.String);
}

scala> :paste
// Entering paste mode (ctrl-D to finish)

case class User(id:Int,name:String){
println("Inside constructor for User")
//override def toString()="User("+id+":"+name+")"
}

// Exiting paste mode, now interpreting.

defined class User

scala> :javap -p User
Compiled from "<pastie>"
public class $line7.$read$$iw$$iw$User implements scala.Product,scala.Serializable {
  private final int id;
  private final java.lang.String name;
  public int id();
  public java.lang.String name();
  public $line7.$read$$iw$$iw$User copy(int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public $line7.$read$$iw$$iw$User(int, java.lang.String);
}

scala> :javap -p User$
Compiled from "<pastie>"
public class $line7.$read$$iw$$iw$User$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.String, $line7.$read$$iw$$iw$User> implements scala.Serializable {
  public static $line7.$read$$iw$$iw$User$ MODULE$;
  public static {};
  public final java.lang.String toString();
  public $line7.$read$$iw$$iw$User apply(int, java.lang.String);
  public scala.Option<scala.Tuple2<java.lang.Object, java.lang.String>> unapply($line7.$read$$iw$$iw$User);
  private java.lang.Object readResolve();
  public java.lang.Object apply(java.lang.Object, java.lang.Object);
  public $line7.$read$$iw$$iw$User$();
}

scala> :paste
// Entering paste mode (ctrl-D to finish)

case class User(var id:Int,var name:String){
println("Inside constructor for User")
//override def toString()="User("+id+":"+name+")"
}

// Exiting paste mode, now interpreting.

defined class User

scala>

scala> :javap -p User
Compiled from "<pastie>"
public class $line8.$read$$iw$$iw$User implements scala.Product,scala.Serializable {
  private int id;
  private java.lang.String name;
  public int id();
  public void id_$eq(int);
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public $line8.$read$$iw$$iw$User copy(int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public $line8.$read$$iw$$iw$User(int, java.lang.String);
}

scala> val u2=User(1,"Aman")
Inside constructor for User
u2: User = User(1,Aman)

scala> u2.
canEqual   copy   equals   hashCode   id   name   productArity   productElement   productIterator   productPrefix   toString

scala> u2.id=10
u2.id: Int = 10

scala> u2
res1: User = User(10,Aman)

scala> :h? Order(
104 class Order(orderId:Int,orderDate:String,orderCustomerId:Int,orderCustomerStatus:String){
106 override def toString()="Order("+orderId+":"+orderDate+":"+orderCustomerId+":"+orderCustomerStatus+")"
110 class Order(var orderId:Int,var orderDate:String,var orderCustomerId:Int,var orderCustomerStatus:String){
112 override def toString()="Order("+orderId+":"+orderDate+":"+orderCustomerId+":"+orderCustomerStatus+")"
115 val or1=new Order(1,"20180101",102,"PROCESSING")
124 class Order(orderId:Int,orderDate:String,orderCustomerId:Int,orderCustomerStatus:String){
127 "Order("+orderId+":"+orderDate+":"+orderCustomerId+":"+orderCustomerStatus+")"
166 :h? Order(

scala> val a=Array(1,2,3,4)
a: Array[Int] = Array(1, 2, 3, 4)

scala> val l=List(1,2,3,4)
l: List[Int] = List(1, 2, 3, 4)

scala> val s=Set(1,2,3,4,4,5)
s: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

scala> val m=Map("Hem" -> 26,"Aman" ->18)
m: scala.collection.immutable.Map[String,Int] = Map(Hem -> 26, Aman -> 18)

scala> l.foreach(println)
1
2
3
4

scala> s.foreach(println)
5
1
2
3
4

scala> a.foreach(println)
1
2
3
4

scala> m.foreach(println)
(Hem,26)
(Aman,18)

scala> m("Hem")
res6: Int = 26

scala> m("Hemm")
java.util.NoSuchElementException: key not found: Hemm
  at scala.collection.immutable.Map$Map2.apply(Map.scala:129)
  ... 29 elided

scala> a(0)
res8: Int = 1

scala> l(0)
res9: Int = 1

scala> s(0)
res10: Boolean = false

scala> (1 to 100)
res11: scala.collection.immutable.Range.Inclusive = Range 1 to 100

scala> val r=(1 to 100)
r: scala.collection.immutable.Range.Inclusive = Range 1 to 100

scala> r.toList
res12: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

scala> val list=r.toList
list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

scala> //get sum of all even numbers

scala> list.filter(a => a%2==0)
res13: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100)

scala> list.filter(a => a%2==0).sum
res14: Int = 2550

scala> list.filter(a => a%2==0).reduce((a,b) => a+b)
res15: Int = 2550

scala> list.filter(a => a%2==0).foldLeft((a,b) => a+b)
<console>:14: error: missing parameter type
       list.filter(a => a%2==0).foldLeft((a,b) => a+b)
                                          ^
<console>:14: error: missing parameter type
       list.filter(a => a%2==0).foldLeft((a,b) => a+b)
                                            ^
<console>:14: error: missing argument list for method foldLeft in trait LinearSeqOptimized
Unapplied methods are only converted to functions when a function type is expected.
You can make this conversion explicit by writing `foldLeft _` or `foldLeft(_)(_)` instead of `foldLeft`.
       list.filter(a => a%2==0).foldLeft((a,b) => a+b)
                                        ^

scala> //sum of squares of all even numbers

scala> list.filter(a => a%2==0).map(a=>a*a).reduce((a,b) => a+b)
res17: Int = 171700

scala> list.filter(a => a%2==0).map(a=>a*a).reduce((a,b) => a+b)
res18: Int = 171700


val l=(1 to 100).toList
val evenSum=l.filter(element=>element%2==0).map(a=>a*a).reduce((a,b)=>(a+b))
val evenSum=l.filter(element => element%2==0).map(a=>a*a).sum



$

hchandra@hchandra-WX-2 MINGW64 ~/git/data/retail_db/order_items (master)
$

hchandra@hchandra-WX-2 MINGW64 ~/git/data/retail_db/order_items (master)
$ pwd
/c/Users/hchandra/git/data/retail_db/order_items

hchandra@hchandra-WX-2 MINGW64 ~/git/data/retail_db/order_items (master)
$ cd ../../../

hchandra@hchandra-WX-2 MINGW64 ~/git
$ pwd
/c/Users/hchandra/git

hchandra@hchandra-WX-2 MINGW64 ~/git
$ cd ../IdeaProjects/learning-scala/src/main/scala/
break_continue.sc           com/                        control_structure.sc        functions_closures.sc       types_operations.sc
classes_objects.sc          composition_inheritance.sc  currying.sc                 higher_order_methods.sc     variable_scope.sc
closures.sc                 control_abstraction.sc      functional_objects.sc       match_expressions.sc

hchandra@hchandra-WX-2 MINGW64 ~/git
$ cd ../IdeaProjects/learning-scala/src/main/scala/

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/scala
$ vi ReadFileApp.scala

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/scala
$

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/scala
$ ls -ltr
total 36
-rw-r--r-- 1 hchandra 1049089 1132 Jan 20 19:15 classes_objects.sc
drwxr-xr-x 1 hchandra 1049089    0 Jan 21 10:53 com/
-rw-r--r-- 1 hchandra 1049089  524 Jan 22 20:48 types_operations.sc
-rw-r--r-- 1 hchandra 1049089  385 Jan 23 20:07 functional_objects.sc
-rw-r--r-- 1 hchandra 1049089 1060 Jan 24 18:58 control_structure.sc
-rw-r--r-- 1 hchandra 1049089  686 Jan 24 19:10 match_expressions.sc
-rw-r--r-- 1 hchandra 1049089  800 Jan 24 19:46 break_continue.sc
-rw-r--r-- 1 hchandra 1049089  327 Jan 24 20:14 variable_scope.sc
-rw-r--r-- 1 hchandra 1049089 1747 Jan 27 20:02 functions_closures.sc
-rw-r--r-- 1 hchandra 1049089  988 Jan 27 20:46 closures.sc
-rw-r--r-- 1 hchandra 1049089 1246 Jan 28 18:28 control_abstraction.sc
-rw-r--r-- 1 hchandra 1049089  824 Jan 28 19:10 currying.sc
-rw-r--r-- 1 hchandra 1049089  374 Jan 29 18:29 higher_order_methods.sc
-rw-r--r-- 1 hchandra 1049089    0 Jan 29 18:32 composition_inheritance.sc

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/scala
$ pwd
/c/Users/hchandra/IdeaProjects/learning-scala/src/main/scala

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/scala
$ cd ../resources/

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ ls -ltr
total 14
-rw-r--r-- 1 hchandra 1049089 11606 Jan 31 19:07 scala_prep.scala
-rw-r--r-- 1 hchandra 1049089   323 Jan 31 19:29 scala_io.scala
-rw-r--r-- 1 hchandra 1049089   480 Jan 31 20:10 ReadFileApp.scala

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ scala ReadFileApp.scala
C:\Users\hchandra\IdeaProjects\learning-scala\src\main\resources\ReadFileApp.scala:4: error: ')' expected but ':' found.
        def main(args:Array[String]:Unit={
                                   ^
one error found

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ scala ReadFileApp.scala
Total Revenue:579.98

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ ls -ltr
total 14
-rw-r--r-- 1 hchandra 1049089 11606 Jan 31 19:07 scala_prep.scala
-rw-r--r-- 1 hchandra 1049089   323 Jan 31 19:29 scala_io.scala
-rw-r--r-- 1 hchandra 1049089   481 Jan 31 20:11 ReadFileApp.scala

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ scalac ReadFileApp.scala

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ ls -ltr
total 26
-rw-r--r-- 1 hchandra 1049089 11606 Jan 31 19:07  scala_prep.scala
-rw-r--r-- 1 hchandra 1049089   323 Jan 31 19:29  scala_io.scala
-rw-r--r-- 1 hchandra 1049089   481 Jan 31 20:11  ReadFileApp.scala
-rw-r--r-- 1 hchandra 1049089   614 Jan 31 20:12  ReadFileApp.class
-rw-r--r-- 1 hchandra 1049089  4409 Jan 31 20:12 'ReadFileApp$.class'

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ javap
Usage: javap <options> <classes>
where possible options include:
  -help  --help  -?        Print this usage message
  -version                 Version information
  -v  -verbose             Print additional information
  -l                       Print line number and local variable tables
  -public                  Show only public classes and members
  -protected               Show protected/public classes and members
  -package                 Show package/protected/public classes
                           and members (default)
  -p  -private             Show all classes and members
  -c                       Disassemble the code
  -s                       Print internal type signatures
  -sysinfo                 Show system info (path, size, date, MD5 hash)
                           of class being processed
  -constants               Show final constants
  -classpath <path>        Specify where to find user class files
  -cp <path>               Specify where to find user class files
  -bootclasspath <path>    Override location of bootstrap class files

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ javap -p ReadFileApp
Compiled from "ReadFileApp.scala"
public final class ReadFileApp {
  public static void main(java.lang.String[]);
}

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ javap -p ReadFileApp$
Compiled from "ReadFileApp.scala"
public final class ReadFileApp$ {
  public static ReadFileApp$ MODULE$;
  public static {};
  public void main(java.lang.String[]);
  public static final boolean $anonfun$main$1(java.lang.String);
  public static final float $anonfun$main$2(java.lang.String);
  public static final float $anonfun$main$3(float, float);
  private ReadFileApp$();
  public static final java.lang.Object $anonfun$main$1$adapted(java.lang.String);
  public static final java.lang.Object $anonfun$main$2$adapted(java.lang.String);
  public static final java.lang.Object $anonfun$main$3$adapted(java.lang.Object, java.lang.Object);
  private static java.lang.Object $deserializeLambda$(java.lang.invoke.SerializedLambda);
}

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ pwd
/c/Users/hchandra/IdeaProjects/learning-scala/src/main/resources

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ pwd
/c/Users/hchandra/IdeaProjects/learning-scala/src/main/resources

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects/learning-scala/src/main/resources
$ cd ../../../../

hchandra@hchandra-WX-2 MINGW64 ~/IdeaProjects
$ cd ../git

hchandra@hchandra-WX-2 MINGW64 ~/git
$ ls -ltr
total 32
drwxr-xr-x 1 hchandra 1049089 0 Jan 26 18:10 java-collections/
drwxr-xr-x 1 hchandra 1049089 0 Jan 27 14:31 junit-testing/
drwxr-xr-x 1 hchandra 1049089 0 Jan 27 22:43 spring-boot-demo/
drwxr-xr-x 1 hchandra 1049089 0 Jan 28 14:53 spring-boot-mysql/
drwxr-xr-x 1 hchandra 1049089 0 Jan 29 14:04 docker-playground/
drwxr-xr-x 1 hchandra 1049089 0 Jan 29 23:30 boot-jdbc-h2/
drwxr-xr-x 1 hchandra 1049089 0 Jan 30 16:04 session-replication-redis/
drwxr-xr-x 1 hchandra 1049089 0 Jan 31 19:22 data/
drwxr-xr-x 1 hchandra 1049089 0 Jan 31 20:15 project/

hchandra@hchandra-WX-2 MINGW64 ~/git
$ mkdir scala_spark_workshop_code

hchandra@hchandra-WX-2 MINGW64 ~/git
$ mkdir scala-spark-workshop-code

hchandra@hchandra-WX-2 MINGW64 ~/git
$ cd scala-spark-workshop-code/

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code
$ pwd
/c/Users/hchandra/git/scala-spark-workshop-code

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code
$ mkdir scala-demo/src/main/scala
mkdir: cannot create directory ‘scala-demo/src/main/scala’: No such file or directory

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code
$ mkdir -p scala-demo/src/main/scala

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code
$ cp ~/IdeaProjects/learning-scala/src/main/resources/
ReadFileApp$.class  ReadFileApp.class   ReadFileApp.scala   scala_io.scala      scala_prep.scala

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code
$ cp ~/IdeaProjects/learning-scala/src/main/resources/ReadFileApp.scala  ~/git/scala-spark-workshop-code/scala-demo/src/main/scala/

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code
$ cd ~/git/scala-spark-workshop-code/scala-demo/src/main/scala/

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo/src/main/scala
$ ls -ltr
total 1
-rw-r--r-- 1 hchandra 1049089 481 Jan 31 20:17 ReadFileApp.scala

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo/src/main/scala
$ cd ../../../

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo
$ scala -v
bad option: '-v'

Usage: scala <options> [<script|class|object|jar> <arguments>]
   or  scala -help

All options to scalac (see scalac -help) are also allowed.


hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo
$ scala -version
Scala code runner version 2.12.3 -- Copyright 2002-2017, LAMP/EPFL and Lightbend, Inc.

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo
$ ls -ltr
total 1
drwxr-xr-x 1 hchandra 1049089  0 Jan 31 20:16 src/
-rw-r--r-- 1 hchandra 1049089 60 Jan 31 20:20 build.sbt

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo
$ sbt package
[info] Updated file C:\Users\hchandra\git\scala-spark-workshop-code\scala-demo\project\build.properties: set sbt.version to 1.1.0
[info] Loading project definition from C:\Users\hchandra\git\scala-spark-workshop-code\scala-demo\project
[info] Updating ProjectRef(uri("file:/C:/Users/hchandra/git/scala-spark-workshop-code/scala-demo/project/"), "scala-demo-build")...
[info] Done updating.
[info] Loading settings from build.sbt ...
[info] Set current project to retail (in build file:/C:/Users/hchandra/git/scala-spark-workshop-code/scala-demo/)
[info] Updating ...
[info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.3/scala-reflect-2.12.3.jar ...
[info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-compiler/2.12.3/scala-compiler-2.12.3.jar ...
[info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.3/scala-library-2.12.3.jar ...
[info]  [SUCCESSFUL ] org.scala-lang#scala-reflect;2.12.3!scala-reflect.jar (52062ms)
[info]  [SUCCESSFUL ] org.scala-lang#scala-library;2.12.3!scala-library.jar (53232ms)
[info]  [SUCCESSFUL ] org.scala-lang#scala-compiler;2.12.3!scala-compiler.jar (105715ms)
[info] Done updating.
[info] Compiling 1 Scala source to C:\Users\hchandra\git\scala-spark-workshop-code\scala-demo\target\scala-2.12\classes ...
[info] Non-compiled module 'compiler-bridge_2.12' for Scala 2.12.3. Compiling...
[info]   Compilation completed in 15.366s.
[info] Done compiling.
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/C:/Users/hchandra/.sbt/boot/scala-2.12.4/org.scala-sbt/sbt/1.1.0/protobuf-java-3.3.1.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[info] Packaging C:\Users\hchandra\git\scala-spark-workshop-code\scala-demo\target\scala-2.12\retail_2.12-1.0.jar ...
[info] Done packaging.
[success] Total time: 133 s, completed Jan 31, 2018, 8:24:11 PM

hchandra@hchandra-WX-2 MINGW64 ~/git/scala-spark-workshop-code/scala-demo
$ ls -ltr
total 1
drwxr-xr-x 1 hchandra 1049089  0 Jan 31 20:16 src/
-rw-r--r-- 1 hchandra 1049089 60 Jan 31 20:20 build.sbt
drwxr-xr-x 1 hchandra 1049089  0 Jan 31 20:21 project/
drwxr-xr-x 1 hchandra 1049089  0 Jan 31 20:22 target/

// `pwt` = "~/git/scala-spark-workshop-code/scala-demo"
// run app using SBT run
$ sbt run

//running scala jar using scala command
$ scala <jar file path> <main class name>
$ scala target/scala-2.12/retail_2.12-1.0.jar ReadFileApp



