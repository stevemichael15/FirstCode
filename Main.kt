fun main() {
    var a= advancecal();
}
open class cal(var a:Int, var b:Int){
    init {
        println("This is the base class")
    }
    fun sum():Int{
        return a+b;
    }
    fun sub():Int{
        return a-b;
    }
}
class advancecal():cal(2,5){
    init{
        print("This is the child class")
    }
    fun mul():Int{
        return a*b;
    }
    fun div():Int{
        return a/b;
    }
}
