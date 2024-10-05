fun main() {
    var d:Data_class=Data_class(2,"Steve");
    var d_copy= d.copy(3)
    println(d_copy.toString())
}
data class Data_class(var id:Int, var name:String){
    init {
        println("Id-$id, name- $name")
    }
}

enum class Day(val num:Int){
    sunday(1),
    monday(2),
    tuesday(3),
    wednesday(4),
    thursday(5),
    friday(6),
}


