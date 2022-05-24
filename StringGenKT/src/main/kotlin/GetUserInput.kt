package stringGenKT.src.main.kotlin

/*
* Author: Ew0345
*/

class GetUserInput {
    fun main() {
        println("If you need help please run the program again with the --info argument.")

        print ("Write strings to file: ")
        val writeToFile = readLine().toString()

        print ("Amount of Strings to Generate: ")
        val stringAmount = Integer.valueOf(readLine())

        print ("String Length: ")
        val stringLength = Integer.valueOf(readLine())

        print ("String Type: ")
        val stringType = Integer.valueOf(readLine())

        GenerateStrings().main(writeToFile, stringAmount, stringLength, stringType)
    }
}