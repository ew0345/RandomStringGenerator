import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import kotlin.random.Random
import kotlin.system.exitProcess

const val version = "1.1.0"

val letters = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L",
    "M","N","O","P","Q","R","S","T","U","V","W","X", "Y","Z","a","b",
    "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
    "s","t","u","v","w","x","y","z")
val numbers = arrayOf("0","1","2","3","4","5","6","7","8","9")
val symbols = arrayOf("`","~","!","@","#","$","%","^","&","*","(",")",
    "-","_","=","+","[","{","]","}",";",":","\'","\"",",","<",".",">",
    "/","?","\\","|")

fun displayInfo() {
    println("--Random String Generator--\n"
            +"      Author: Ew0345\n"
            +"      Version: $version\n"
            +"\n"
            +"How to use: StringGenKT [<Write To File " +
            "[yes|y|true|1]|[no|n|false|0]> <Numbers of strings to " +
            "generator> <Length of strings> <String type (1-6)>]\n"
            +"--Random String Generator--")
}

fun pickType(stringType:Int): Int {
    var type:Int = 100
    when (stringType) {
        1 -> type = 1 //letters only
        2 -> type = 2 //numbers only
        3 -> type = 3 // symbols only
        4 -> type = Random.nextInt(1, 3) //letters & numbers
        5 -> { //letters & symbols
            type = Random.nextInt(1, 3)
            if (type == 2) type = 3
        }
        6 -> { //numbers & symbols
            type = Random.nextInt(1, 3)
            if (type == 1) {
                type = 2
            } else if (type == 2) {
                type = 3
            }
        }
        7 -> {
            type = Random.nextInt(1, 4)
        }
        else -> {
            println("Invalid string generation type. Valid types are"
                    +" 1 (Letters Only), 2 (Numbers Only), 3 (Symbols only)"
                    +", 4 (Letters and Numbers), 5 (Letters and Symbols), "
                    +"6 (Numbers and Symbols), 7 (All)")
            exitProcess(0)
        }
    }
    return type
}

fun pickChar(type:Int): String {
    var char:String = "oh no"

    when (type) {
        1 -> char = letters[Random.nextInt(0, letters.size)]
        2 -> char = numbers[Random.nextInt(0, numbers.size)]
        3 -> char = symbols[Random.nextInt(0, symbols.size)]
        else -> {
            println("Selection error.\nPlease report issue on " +
                    "https://github.com/ew0345/RandomStringGenerator/issues with the title: \'Type " +
                    "Error: type was $type\'.")
        }
    }
    return char
}

fun generateString(writeToFile:String, stringAmount:Int,
                   stringLength:Int,
                   stringType:Int) {
    when (writeToFile.lowercase()) {
        "true","yes","y","1" -> {
            val stringFile = File(System.getProperty("user.home")
                    +"/Desktop/RandomStrings.txt")
            BufferedWriter(FileWriter(stringFile.absolutePath)).use { bw ->
                for (i in 1..stringAmount) {
                    print("String #$i: ")
                    bw.write("String #$i: ")
                    for (i1 in 1..stringLength) {
                        val type: Int = pickType(stringType)
                        val char: String = pickChar(type)

                        if (char == "oh no") exitProcess(0)

                        print(char)
                        bw.write(char)
                    }
                    print("\n")
                    bw.newLine()
                }
            }
        }
        "false","no","n","0" -> {
            for (i in 1..stringAmount) {
                print("String #$i: ")
                for (i1 in 1..stringLength) {
                    val type:Int = pickType(stringType)
                    val char:String = pickChar(type)

                    if (char == "oh no") exitProcess(0)

                    print(char)
                }
                print("\n")
            }
        }
    }
}

fun getUserInput() {
    print("Write to File: ")
    val writeToFile = readLine().toString()
    print("String Amount: ")
    val stringAmount = Integer.valueOf(readLine())
    print("String Length: ")
    val stringLength = Integer.valueOf(readLine())
    print("String Type: ")
    val stringType = Integer.valueOf(readLine())

    generateString(writeToFile, stringAmount, stringLength,
        stringType)
}

fun main(args: Array<String>) {
    if (args.size == 4) {
        val strGenInf = arrayOf(Integer.parseInt(args[1]),
            Integer.parseInt(args[2]), Integer.parseInt(args[3]))
        generateString(args[0].toString(), strGenInf[0],
            strGenInf[1], strGenInf[2])
    } else if (args.isNotEmpty() && args[0] == "--info"
        || args.isNotEmpty() && args[0] == "/?") {
        displayInfo()
    } else {
        getUserInput()
    }
}