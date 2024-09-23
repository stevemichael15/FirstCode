fun main(args: Array<String>) {
    var c= advancecal()
    println(c.sum())
}
open class Calculator(var a:Int=3 , var b:Int){
    var values:Int=a
    set(value){
        if(value%2==0){
            field=value
        }else{
            print("It's not an even number\n");
        }
    }
    get(){
        return field*10
    }
    init{
        print("The object is created\n")
    }
    constructor(aValue:Int, bValue:Int , cValue:Int)
            :this(aValue,bValue){
        values= aValue
    }
    fun present():Int{
        return values
    }
}

class advancecal():Calculator(2,3){
    var newval=a
    fun sum():Int{
        return a
    }
}