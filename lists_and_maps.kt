fun main() {
    var lst= mutableListOf(3,5,2)
    lst.add(3)
    var lst_2= mutableListOf(3,5,1,3)
    lst.containsAll(lst)
    for(i in lst_2){
        print("$i ")
    }
//    var mps= mutableMapOf<Int,String>()
//    mps.put(0,"Pritam")
//    mps.put(1,"Steve")
//    mps.put(2,"An")
//    mps.put(3,"Chatrapal")
//    for((key,pair)in mps){
//        println("$key : $pair")
//    }
//   for(i in lst){
//        println(i)
//    }
}