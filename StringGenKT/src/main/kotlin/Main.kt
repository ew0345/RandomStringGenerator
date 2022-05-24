package stringGenKT.src.main.kotlin
/*
* Author: Ew0345
*/

fun main(args: Array<String>) {
   if (args.size == 4) {
       // Store arguments
       val writeToFile: String = args[0]
       val stringAmount: Int = args[1].toInt()
       val stringLength: Int = args[2].toInt()
       val stringType: Int = args[3].toInt()

       // Give arguments to stringGenKT.src.main.kotlin.GenerateStrings()
       GenerateStrings().main(writeToFile, stringAmount, stringLength, stringType)

   } else if (args.size == 1 && args[0].equals("--info", true) || args.size == 1 && args[0].equals("--help", true)) {
       // Display info about the program
       DisplayInfo().main()
   } else {
       // Get user input to generate strings
       GetUserInput().main()
   }
}