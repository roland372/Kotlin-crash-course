// abstract class prevents us from creating Animal, we can only inherit from this class
abstract class Animal(
    // constructor
    val name: String,
    var legCount: Int = 4
) {
    // block of code that will be executed whenever we create instance of this class
    init {
        println("Hello my name is $name")
    }
}