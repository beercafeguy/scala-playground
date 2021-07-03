for (n <- 1 to 10 if n%3==0)
  println(n)

//this represents two loops
for (i <- 1 to 3 ; j <- 1 to 3) print(f"${10*i+j}%3d")

for (i <- 1 to 3 ; j <- 1 to 3 if i!=j) print(f"${10*i+j}%3d")

val result=for(i <- 1 to 5) yield i*i
println(result.mkString(" "))

val movVal=for(i <- 1 to 5) yield i%3
println(movVal.mkString(" "))

