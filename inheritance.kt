import java.util.Objects

fun main() {
    var d:Dog_1= Dog_1("German Shephard")
    var c:String=d.breed_name()
    var arr= arrayOf(Dog_1("German Shephard"),Dog_2("Rottweiller") )
    check(arr)
}
fun check(objects: Array<Dog_breed>){
    for(i in objects){
        if(i is Dog_1){
            println("Yes it is")
        }else{
            println("No it is not")
        }
    }
}

interface price{
    fun price_tag():Int
}
abstract class Dog_breed{
    abstract fun breed_name():String
    abstract fun color():String
}
class Dog_1(var name:String):Dog_breed(),price{
    override fun breed_name(): String {
        return "The name of the breed is $name"
    }
    override fun price_tag():Int{
        val a:Int=3423
        return a
    }

    override fun color(): String {
        return "white"
    }
    constructor( he:Int):
            this("Hello")
}
class Dog_2(var name:String):Dog_breed(){
    override fun breed_name(): String {
        return "The name of the breed is $name"
    }

    override fun color(): String {
        return "black"
    }
}