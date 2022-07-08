package stringGenKT.src.main.kotlin
/*
* Author: Ew0345
*/

class DisplayInfo {
    private val author = "Ew0345"
    private val version = "1.1.0-KT"

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
            +"      8: Uppercase letters & numbers\n"
            +"      9: Lowercase letters & numbers\n"
            +"      10: Mixed-case letters & numbers\n"
            +"      11: Uppercase letters & base symbols\n"
            +"      12: Uppercase letters & modifier symbols\n"
            +"      13: Uppercase letters & symbols\n"
            +"      14: Lowercase letters & base symbols\n"
            +"      15: Lowercase letters & modifier symbols\n"
            +"      16: Lowercase letters & symbols\n"
            +"      17: Mixed-case letters & base symbols \n"
            +"      18: Mixed-case letters & modifier symbols\n"
            +"      19: Mixed-case letters & symbols\n"
            +"      20: Numbers & base symbols\n"
            +"      21: Numbers & modifier symbols\n"
            +"      22: Numbers & symbols\n"
            +"      23: All\n"
            +"---------------------------"
        )
    }
}