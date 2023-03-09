fun main() {
    word()
    numbers( 3, 4, 5)
    println()
    create("Adalab")
    join()
    var calcu =(Calculator=(3,4))

}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun word(): String {
    var x = "Adalab"
    var y = "Adalab is my class"
    return (x)

}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements

fun numbers( value1: Int, value2: Int, value3: Int): Int {
var average = (value1+value2+value3)/3
    return average
}



//    Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun create(word: String){
var name = "Rachel"
    println(name.split("Rachel"))
}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.

fun join(word: String){
   var name= arrayOf("Belyse", "Gloria","Clarisse")
    return (name)
}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculator(var num1: Int, var num2: Int){
    fun add(){
        num1+num2
    }
    fun subtract(){
        num2-num1
    }
    fun div(){
        num2/num1
    }
    fun mult(){
        num1*num2
    }
}

