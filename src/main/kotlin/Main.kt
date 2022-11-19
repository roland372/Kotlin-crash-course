fun main() {
    println("Hello World!")

    // <----- variables ----->
    var x: Int = 3
    println("value of x is $x")

    // val - makes variable constant - we cannot redeclare it
    val y: Int = 5
    // y = 4

    val string = "hello"
    println(string.uppercase())

    // <----- user input ----->
    // val userInput = readln()
    // println(userInput)

    // <----- lists ----->
    val shoppingList = listOf("item1", "item2", "item3")
    val mutableShoppingList = mutableListOf("item1", "item2", "item3")

    // shoppingList.add("item4") // won't work, list is immutable
    mutableShoppingList.add("item4")

    println(shoppingList[0])

    // <----- loops ----->
    var counter = 0
    while (counter < mutableShoppingList.size) {
        println(mutableShoppingList[counter])
        counter++
    }

    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    for (i in 1..100) {
        println(i)
    }

    // <----- functions ----->
    printNumbers()
    val even = isEven(5)
    println(even)

    val odd = 4
    println(odd.isOdd())

    // <----- classes ----->
    val dog = Dog()
    dog.bark()
    dog.legCount = 3
    println(dog.legCount)

    val cat = Cat()
    // cat.bark() // won't work
    cat.meow()

    // <----- exceptions ----->
    val number = readLine() ?: "0"

    val parsedNumber = try {
        number.toInt()
    } catch (e: Exception) {
        0
    }
    println(parsedNumber)
}

// <----- lambda functions -----> - functions that are passed as parameter to another functions

fun printNumbers() {
    for (i in 1..10) {
        println(i)
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// extend function
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}