package stringGenKT.src.main.kotlin

import java.io.File
import java.util.*
import kotlin.random.Random


/*
* Author: Ew0345
*/
class GenerateStrings {
    private val stringFile = File(System.getProperty("user.home")+"/Desktop/RandomStrings.txt")
    private val debug = false

    fun main(writeToFile: String, stringAmount: Int, stringLength: Int, stringType: Int) {
        if (debug) println ("writeToFile: $writeToFile, stringAmount: $stringAmount, stringLength: $stringLength, stringType: $stringType")

        when (writeToFile.lowercase(Locale.getDefault())) {
            "yes", "y", "true", "1" -> {
                if (stringFile.exists()) stringFile.delete() else stringFile.createNewFile()

                var i = 0
                while (i < stringAmount) {
                    print ("String ${i+1}: ")
                    stringFile.appendText("String ${i+1}: ")
                    var i1 = 0
                    while (i1 < stringLength) {
                        when (stringType) { // Could add additional distinctions for combined types (uppercase/lower letters, base/modifier symbols)
                            1 -> writeChar (1) // Uppercase letters only
                            2 -> writeChar (2) // Lowercase letters only
                            3 -> { // Letters only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (2)
                                }
                            }
                            4 -> writeChar (3) // Numbers only
                            5 -> writeChar (4) // Base symbols only
                            6 -> writeChar (5) // Modifier symbols only
                            7 -> { // Symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (4)
                                    1 -> writeChar (5)
                                }
                            }
                            8 -> { // Uppercase letters & numbers only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (3)
                                }
                            }
                            9 -> { // Lowercase letters & numbers only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (2)
                                    1 -> writeChar (3)
                                }
                            }
                            10 -> { // Letters & numbers only
                                when (Random.nextInt(0, 3)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (2)
                                    2 -> writeChar (3)
                                }
                            }
                            11 -> { // Uppercase letters & base symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (4)
                                }
                            }
                            12 -> { // Uppercase letters & modifier symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (5)
                                }
                            }
                            13 -> { // Uppercase letters & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (4)
                                    2 -> writeChar (5)
                                }
                            }
                            14 -> { // Lowercase letters & base symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (2)
                                    1 -> writeChar (4)
                                }
                            }
                            15 -> { // Lowercase letters & modifier symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (2)
                                    1 -> writeChar (5)
                                }
                            }
                            16 -> { // Lowercase letters & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> writeChar (2)
                                    1 -> writeChar (4)
                                    2 -> writeChar (5)
                                }
                            }
                            17 -> { // Letters & base symbols only
                                when (Random.nextInt(0,3)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (2)
                                    2 -> writeChar (4)
                                }
                            }
                            18 -> { // Letters & modifier symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (2)
                                    2 -> writeChar (5)
                                }
                            }
                            19 -> { // Letters & symbols only
                                when (Random.nextInt(0, 4)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (2)
                                    2 -> writeChar (4)
                                    3 -> writeChar (5)
                                }
                            }
                            20 -> { // Numbers & base symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (3)
                                    1 -> writeChar (4)
                                }
                            }
                            21 -> { // Numbers & modifier symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> writeChar (3)
                                    1 -> writeChar (5)
                                }
                            }
                            22 -> { // Numbers & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> writeChar (3)
                                    1 -> writeChar (4)
                                    2 -> writeChar (5)
                                }
                            }
                            23 -> { // All
                                when (Random.nextInt(0, 5)) {
                                    0 -> writeChar (1)
                                    1 -> writeChar (2)
                                    2 -> writeChar (3)
                                    3 -> writeChar (4)
                                    4 -> writeChar (5)
                                }
                            }
                            else -> { // Anything above 23
                                println("Invalid choice for stringType, please run the program again with --info to see valid choices.")
                                exitProcess(0)
                            }
                        }
                        i1++
                    }
                    if (i != stringAmount) {
                        print("\n")
                        stringFile.appendText("\n")
                    }

                    i++
                }
            }
            "no", "n", "false", "0" -> {
                var i = 0
                while (i < stringAmount) {
                    print ("String ${i+1}: ")
                    var i1 = 0
                    while (i1 < stringLength) {
                        when (stringType) { // Could add additional distinctions for combined types (uppercase/lower letters, base/modifier symbols)
                            1 -> print (getChar (1))
                            2 -> print (getChar (2)) // Lowercase letters only
                            3 -> { // Letters only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (2))
                                }
                            }
                            4 -> print (getChar (3)) // Numbers only
                            5 -> print (getChar (4)) // Base symbols only
                            6 -> print (getChar (5)) // Modifier symbols only
                            7 -> { // Symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (4))
                                    1 -> print (getChar (5))
                                }
                            }
                            8 -> { // Uppercase letters & numbers only
                                when (Random.nextInt(0,2)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (3))
                                }
                            }
                            9 -> { // Lowercase letters & numbers only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (2))
                                    1 -> print (getChar (3))
                                }
                            }
                            10 -> { // Letters & numbers only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (2))
                                    2 -> print (getChar (3))
                                }
                            }
                            11 -> { // Uppercase letters & base symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (4))
                                }
                            }
                            12 -> { // Uppercase letters & modifier symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (5))
                                }
                            }
                            13 -> { // Uppercase letters & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (4))
                                    2 -> print (getChar (5))
                                }
                            }
                            14 -> { // Lowercase letters & base symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (2))
                                    1 -> print (getChar (4))
                                }
                            }
                            15 -> { // Lowercase letters & modifier symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (2))
                                    1 -> print (getChar (5))
                                }
                            }
                            16 -> { // Lowercase letters & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar (2))
                                    1 -> print (getChar (4))
                                    2 -> print (getChar (5))
                                }
                            }
                            17 -> { // Letters & base symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (2))
                                    2 -> print (getChar (4))
                                }
                            }
                            18 -> { // Letters & modifier symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (2))
                                    2 -> print (getChar (5))
                                }
                            }
                            19 -> { // Letters & symbols only
                                when (Random.nextInt(0, 4)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (2))
                                    2 -> print (getChar (4))
                                    3 -> print (getChar (5))
                                }
                            }
                            20 -> { // Numbers & base symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (3))
                                    1 -> print (getChar (4))
                                }
                            }
                            21 -> { // Numbers & modifier symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar (3))
                                    1 -> print (getChar (5))
                                }
                            }
                            22 -> { // Numbers & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar (3))
                                    1 -> print (getChar (4))
                                    2 -> print (getChar (5))
                                }
                            }
                            23 -> { // All
                                when (Random.nextInt(0, 4)) {
                                    0 -> print (getChar (1))
                                    1 -> print (getChar (2))
                                    2 -> print (getChar (3))
                                    3 -> print (getChar (4))
                                    4 -> print (getChar (5))
                                }
                            }
                            else -> { // Anything above 23
                                println("Invalid choice for stringType, please run the program again with --info to see valid choices.")
                                exitProcess(0)
                            }
                        }
                        i1++
                    }
                    if (i != stringAmount) print("\n")

                    i++
                }
            }
        }
    }

    private fun getChar(selection: Int): Char {
        when (selection) {
            1 -> return Characters().lettersUpperCase[Random.nextInt(0, Characters().lettersUpperCase.size - 1)]
            2 -> return Characters().lettersLowerCase[Random.nextInt(0, Characters().lettersLowerCase.size - 1)]
            3 -> return Characters().numbers[Random.nextInt(0, Characters().numbers.size - 1)]
            4 -> return Characters().symbolsBase[Random.nextInt(0, Characters().symbolsBase.size - 1)]
            5 -> return Characters().symbolsModifier[Random.nextInt(0, Characters().symbolsModifier.size -1)]
        }
        return '\n'
    }

    private fun writeChar(selection: Int) {
        val char = getChar(selection)
        stringFile.appendText(char.toString())
        print(char)
    }
}
