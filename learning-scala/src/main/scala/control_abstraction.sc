object FileMatcher {
  private def filesHere = new java.io.File(".").listFiles()
  def filesEnding(query:String)={
    for(file <-filesHere if file.getName.endsWith(query))
      yield file
  }

  def filesStarting(query:String)={
    for(file <-filesHere if file.getName.startsWith(query))
      yield file
  }

  def filesContains(query:String)={
    for(file <-filesHere if file.getName.contains(query))
      yield file
  }

  def filesRegex(query:String)={
    for(file <-filesHere if file.getName.matches(query))
      yield file
  }

  //higher order function
  //this will reduce the line of code drastically
  def filesMatching(query:String,matcher:(String,String)=>(Boolean)): Unit ={
    for(file <- filesHere if matcher(file.getName,query))
      yield file
  }

  def filesContaining(query: String) =filesMatching(query,_.contains(_))

}


def containsNeg(nums:List[Int]):Boolean={
  var exists=false;
  for(num <- nums if num<0)
    exists=true
  exists
}

containsNeg(List(1,2,3,4))
containsNeg(List(-1,2,0,9))

def containsNegV1(nums:List[Int])=nums.exists(_<0)
containsNegV1(List(-1,2,0,9))
containsNegV1(Nil)

//similarly
def containsOdd(nums:List[Int])=nums.exists(_%2!=0)


