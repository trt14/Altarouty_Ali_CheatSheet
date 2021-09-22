import kotlin.random.Random

fun main(){
    val count =7 // immutable
    var a = 4 //mutable
    a = 2

    //nullable types ??


    // type declarations
    val num: Int = 3
    val num2: Float = 4f
    val num3: Double = 5.0
    val num4 : Long = 23985738L

    val str : String = "words"
    val chr : Char = 'C'

    val istrue: Boolean = true
    val isfalse: Boolean = false

    //Comparison operators
    val isCorrect = istrue && istrue
    val notCoreect = istrue && isfalse
    val isright = istrue || isfalse

    val bigger = (5 > 2)
    val smaller = (2< 5)
    val bigEqual = (5 >= 3)
    val smEqual = (2 <= 3)
    val notEqual = (2 !=3)
    val equal = (2 == 2)

    //Console ? User Input
    val userInput = readLine()
    val forceRead = readLine()!!.toInt() //!! ensure that the user will input a value


    //array declarations
    val collection = arrayOf(3,5,6,2,3,1) //mutable
    val lists = listOf("l", 2, true, "fun") //immutable
    //lists[0]= 1 is wrong
    collection[0]=1 //changes
    val arrayList = arrayListOf<Int>() //we can add and del from this list
    val moviesArray = arrayOfNulls<String>(5) //empty array


    //array manipulation
    val arraySize= collection.size
    arrayList.add(1)
    arrayList.remove(arrayList[0])
    arrayList.add(2)
    arrayList.add(3)

    arrayList.sort()
    val addArr = arrayList.sum()

    val credentials = ArrayList<ArrayList<String>>()

    credentials.add(ArrayList(arrayListOf("user1", "12345")))
    credentials.add(ArrayList(arrayListOf("user2", "password")))
    credentials.add(ArrayList(arrayListOf("Bob", "00000")))
    credentials.add(ArrayList(arrayListOf("Tim", "55555")))

    println(credentials[2][0])  // --> Bob
    println(credentials[0][1])  // --> 12345

    //Dictionaries
    val seats = mapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
    println(seats[2])  // --> Jim
    println(seats[0])  // --> null

    val seats = mutableMapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
    println(seats[2])  // --> Jim
    println(seats[0])  // --> null
    seats[0] = "Fred"
    println(seats[0])  // --> Fred
    println("${seats.keys}  to ${seats.values} + size ${seats.size}")


    //Randomization
    val randomNumber = Random.nextInt(11)
    val randomNum2 = Random.nextInt(0,11)  // 1..10

    //if statement
    if( 5 >= num){

    } else if( 5 < num2 ){

    } else {

    }

    //When statement
    when(num){
        1 -> print("x==1")
        2 -> print("x==2")
        else->print("not 1 or 2")
    }
    when (num){
        in 1..10 -> print("in range")
        !in 10..20 -> print("out of range")
        else -> print(" non of the above")
    }

    //for Loop

    for( i in 1..5){

    }
    for (items in collection){

    }
    for(i in 3 downTo 1){

    }

    for(i in collection.indices){

    }

    for((index, value) in collection.withIndex()){

    }

    //While Loop
    var counter = 5
    while( counter > 0){
        counter --
    }
    do{
        print("while loop")
    }while( num2 >=2)

    //Functions
    fun sayHi(){
        print("Hi")
    }
    sayHi() //function call

    //functions with parameters
    fun userInfo(name: String, age: Int){
        if(age >=18){
            println("Hi $name, Congrats you are of legal age and is able to join our competition")
        } else{
            println("Hi $name, We are sorry to inform you that you are too young to join us. maybe next time ")
        }
    }
    userInfo("Ahmad", 21)

    //Exception Handling
    try{

    } catch (e: Exception){

    }
}
//OOP

//Map
val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
println(numbersMap.get("one"))
println(numbersMap["one"])
println(numbersMap.getOrDefault("four", 10))
println(numbersMap["five"])               // null
//numbersMap.getValue("six")      // exception!

val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
println(numbersMap.keys)
println(numbersMap.values)

//Filter on map

val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
println(filteredMap)

val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
val filteredKeysMap = numbersMap.filterKeys { it.endsWith("1") }
val filteredValuesMap = numbersMap.filterValues { it < 10 }

println(filteredKeysMap)
println(filteredValuesMap)

val numbersMap = mutableMapOf("one" to 1, "two" to 2)
val previousValue = numbersMap.put("one", 11)
println("value associated with 'one', before: $previousValue, after: ${numbersMap["one"]}")
println(numbersMap)


//OOP
class Car{
    var color = ""
    init {
        val colors = listOf("Red", "Blue", "Green", "Yellow")
        color = colors[Random.nextInt(colors.size)]  // --> colors.size is 4 in this case
    }
}
val myCar = Car()
println(myCar.color)  // --> This will print the random color assigned to our car
myCar.color = "Silver"
println(myCar.color)  // --> Silver

//Another OOP Ex
abstract class Vehicle{
    var color = "Blue"
    abstract fun doors()
}
class FamilyCar: Vehicle(){
    override fun doors() {
        println("This car has 4 doors")
    }
}
class SportsCar: Vehicle(){
    override fun doors() {
        println("This car has 2 doors")
    }
}
FamilyCar().doors()  // --> This car has 4 doors
println("The family car is ${FamilyCar().color}.")  // --> The family car is Blue.
val mySportsCar = SportsCar()
mySportsCar.doors()  // --> This car has 2 doors
mySportsCar.color = "Red"
println("The color of my sports car is ${mySportsCar.color}.")  // --> The color of my sports car is Red.