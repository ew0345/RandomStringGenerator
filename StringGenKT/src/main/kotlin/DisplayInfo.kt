/*
* Author: Ew0345
*/

class DisplayInfo {
    private val author = "Ew0345"
    private val version = "1.0.1-KT"

    fun main() {
        println(
            "--Random String Generator--\n"
                    +"      Author: " + author + "\n"
                    +"      Version: " + version + "\n"
            +"---------------------------\n"
            +"String Types:\n"
            +"      1: Uppercase letters only\n"
            +"      2: Lowercase letters only\n"
            +"      3: Mixed-case letters only\n"
            +"      4: Numbers only\n"
            +"      5: Base symbols only\n"
            +"      6: Modifier symbols only (Symbols that require holding shift to type)\n"
            +"      7: Symbols only (Both base and modifier symbols)\n"
            +"      8: Mixed-case letters & numbers\n"
            +"      9: Mixed-case letters & symbols\n"
            +"      10: Numbers & symbols\n"
            +"      11: All\n"
            +"---------------------------"
        )
    }
}