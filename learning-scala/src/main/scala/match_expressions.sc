//something similar to switch statement
val args:Array[String]=Array("Hem","Aman","Ajay")
val firstArg=if(args.length>0) args(0) else "NoName"

firstArg match {
  case "Aman" => println("This is Aman")
  case "Hem" =>println("This is Hem")
  case "Ajay" => println("This is Ajay")
  case "NoName" => println("Someone unknown")
  case _ =>println("Who ?") //default case
}

val name=firstArg match {
  case "Aman" =>"This is Aman"
  case "Hem" =>"This is Hem"
  case "Ajay" =>"This is Ajay"
  case "NoName" =>"Someone unknown"
  case _ =>"Who ?" //default case
}



//break is implicit in SCALA
//as in most of the expressions, match Expressions return value


