package InClassPractice

fun main(){
    val simpleLampTurnOn = Device("Bed Room")
    simpleLampTurnOn.turnOn()
    val smartLampTurnOn = SmartLamp("Living Room", 11)
    smartLampTurnOn.turnOn()
}
//## Task 1: Smart Devices
//
//Imagine you are designing software for smart home devices.
//
//- There is a basic class `Device` with properties like `name` and a function `turnOn()` that prints a simple message.
open class Device(val name: String){
    open fun turnOn(){
        println("${name} lamp turned on")
    }
}
//- You need to make a class `SmartLamp` that comes from `Device` and adds a property for brightness.
class SmartLamp(name: String, _brightness: Int) : Device(name){
    var brightness : Int = _brightness
        get(){
            if (field < 10)
                return 10
            else return field
        }
    //- Override the `turnOn()` function in `SmartLamp` so it prints a message including the lamp’s name and brightness.
    override fun turnOn(){
        println("${name} lamp has been turned on with brightness of ${brightness}")
    }
}

//
//**Extra:**
//Add a getter for the brightness property so that if the brightness is less than 10, it always returns 10.
//
//---