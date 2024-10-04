fun main() {
    var C:shape=Circle(3);
    C.area()
}
abstract class shape{
    abstract fun area():Double
}
class Circle(var radius:Int):shape(){
    override fun area(): Double {
        return radius * radius * Math.PI;
    }
}