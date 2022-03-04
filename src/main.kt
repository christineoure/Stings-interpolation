fun main(){
    name()
    val hello = greet ("Hi my name is Oure", "and I am 21 years old")
    println(hello)
    val y = length ("I love dancing")
    println(y)
    command()
}
//write a function that is composed of 1st 3rd and 4th charactters
fun name(){
    var name = "Akirachix"
    var x = name[0].toString()+name[2]+name[3]
    println(x)
}//writing a function that takes in two parameters and returns a string with a structure
//Hi my name is x and I am y yearas old

fun greet(info:String,text:String):String{
    return info + text
}
//writing a function that takes in a string and returns its length

fun length(opt:String) :Int{
    return opt.length
}
//writing a command that takes my name and prints out that's me

fun command(){
    var name ="Oure"
    if(name.equals("Oure")){
        println("Thats me!")
    }else{
        println("I dont know who that is")
    }
}