fun main() {
    var a: (Int, Int)->Int =::sum
    fun highOrderFun(a:Int,b:Int,fn:(Int , Int)->Int):Int{
        var w:Int=2
        return fn(w,b)
    }
    print(highOrderFun(3,5, ::sum))
}
fun sum(a:Int, b:Int ):Int{
    return a+b
}