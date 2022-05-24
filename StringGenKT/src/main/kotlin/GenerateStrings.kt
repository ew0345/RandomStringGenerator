package stringGenKT.src.main.kotlin

import java.io.File
import java.util.*
import kotlin.random.Random


/*
* Author: Ew0345
*/
class GenerateStrings {

    fun main(writeToFile: String, stringAmount: Int, stringLength: Int, stringType: Int) {
        when (writeToFile.lowercase(Locale.getDefault())) {
            "yes", "y", "true", "1" -> {
                val stringFile = File(System.getProperty("user.home")+"/Desktop/RandomStrings.txt")
                if (stringFile.exists()) stringFile.delete() else stringFile.createNewFile()

                var i = 0
                while (i < stringAmount) {
                    print ("String ${i+1}: ")
                    stringFile.appendText("String ${i+1}: ")
                    var i1 = 0
                    while (i1 < stringLength) {
                        when (stringType) { // Could add additional distinctions for combined types (uppercase/lower letters, base/modifier symbols)
                            1 -> { // Uppercase Letters Only
                                val character = getChar(1)
                                print (character)
                                stringFile.appendText(character.toString())
                            }
                            2 -> { //Lowercase Letters Only
                                val character = getChar(2)
                                print (character)
                                stringFile.appendText(character.toString())
                            }
                            3 -> { // Letters only
                                when (Random.nextInt(0, 2)) {
                                    0 -> {
                                        val character = getChar(1)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    1 -> {
                                        val character = getChar(2)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                }
                            }
                            4 -> { // Numbers only
                                val character = getChar(3)
                                print (character)
                                stringFile.appendText(character.toString())
                            }
                            5 -> { // Base symbols only
                                val character = getChar(4)
                                print (character)
                                stringFile.appendText(character.toString())
                            }
                            6 -> { // Modifier symbols only
                                val character = getChar(5)
                                print(character)
                                stringFile.appendText(character.toString())
                            }
                            7 -> { // Symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> {
                                        val character = getChar(4)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    1 -> {
                                        val character = getChar(5)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                }
                            }
                            8 -> { // Letters & numbers only
                                when (Random.nextInt(0, 3)) {
                                    0 -> {
                                        val character = getChar(1)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    1 -> {
                                        val character = getChar(2)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    2 -> {
                                        val character = getChar(3)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                }
                            }
                            9 -> { // Letters & symbols only
                                when (Random.nextInt(0, 4)) {
                                    0 -> {
                                        val character = getChar(1)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    1 -> {
                                        val character = getChar(2)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    2 -> {
                                        val character = getChar(4)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    3 -> {
                                        val character = getChar(5)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                }
                            }
                            10 -> { // Numbers & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> {
                                        val character = getChar(3)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    1 -> {
                                        val character = getChar(4)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    2 -> {
                                        val character = getChar(5)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                }
                            }
                            11 -> { // All
                                when (Random.nextInt(0, 4)) {
                                    0 -> {
                                        val character = getChar(1)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    1 -> {
                                        val character = getChar(2)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    2 -> {
                                        val character = getChar(3)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    3 -> {
                                        val character = getChar(4)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                    4 -> {
                                        val character = getChar(5)
                                        print (character)
                                        stringFile.appendText(character.toString())
                                    }
                                }
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
                            1 -> print (getChar(1))
                            2 -> print (getChar(2)) // Lowercase letters only
                            3 -> { // Letters only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar(1))
                                    1 -> print (getChar(2))
                                }
                            }
                            4 -> print (getChar(3)) // Numbers only
                            5 -> print (getChar(4)) // Base symbols only
                            6 -> print (getChar(5)) // Modifier symbols only
                            7 -> { // Symbols only
                                when (Random.nextInt(0, 2)) {
                                    0 -> print (getChar(4))
                                    1 -> print (getChar(5))
                                }
                            }
                            8 -> { // Letters & numbers only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar(1))
                                    1 -> print (getChar(2))
                                    2 -> print (getChar(3))
                                }
                            }
                            9 -> { // Letters & symbols only
                                when (Random.nextInt(0, 4)) {
                                    0 -> print (getChar(1))
                                    1 -> print (getChar(2))
                                    2 -> print (getChar(4))
                                    3 -> print (getChar(5))
                                }
                            }
                            10 -> { // Numbers & symbols only
                                when (Random.nextInt(0, 3)) {
                                    0 -> print (getChar(3))
                                    1 -> print (getChar(4))
                                    2 -> print (getChar(5))
                                }
                            }
                            11 -> { // All
                                when (Random.nextInt(0, 4)) {
                                    0 -> print (getChar(1))
                                    1 -> print (getChar(2))
                                    2 -> print (getChar(3))
                                    3 -> print (getChar(4))
                                    4 -> print (getChar(5))
                                }
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
}