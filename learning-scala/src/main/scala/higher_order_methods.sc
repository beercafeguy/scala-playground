val a=List(1,2,3,4,5,6,12,-1)
a.reduceLeft((a,b)=>{println(a+","+b); a+b})
a.reduce((a,b)=>{println(a+","+b); a+b})
a.reduceRight((a,b)=>{println(a+","+b); a+b})

a.fold(0)((a,b)=>{println(a+","+b); a+b})
a.foldLeft(0)((a,b)=>{println(a+","+b); a+b})
a.foldRight(0)((a,b)=>{println(a+","+b); a+b})

a.fold("")((a,b)=>{println(a+","+b); a.toString+b.toString})


