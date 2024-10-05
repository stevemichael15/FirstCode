fun main() {
    val hello_1= Hello_1("Steve")
    print(hello_1.no)
}
sealed class Hello
class Hello_1(val name:String, val no:Int=2):Hello()
class Hello_2(val name:String, val marks:String):Hello()