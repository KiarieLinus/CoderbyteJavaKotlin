// For this challenge you will be capitalizing certain characters in a string.
// Capitalize the first letter of each word. Words will be separated by only one space.

fun LetterCapitalize(str: String): String{     
    val strArr = str.trim().split(" ").map{s ->
        s.replaceFirstChar{it.uppercaseChar()}
    }
    return strArr.joinToString(" ")
}

fun main() {
    print(LetterCapitalize("     please end the suffering "))
}