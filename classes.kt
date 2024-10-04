fun main() {
    var r= readLine();
    var number = r?.toInt()
    val shape: Shape = Circle(number)
    println("${shape.area()}")
}
open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(var radius:Int):Shape(){
    override fun area():Double{
        return Math.PI * radius * radius;
    }
    fun parameter():Double{
        return 2 * Math.PI * radius;
    }
}