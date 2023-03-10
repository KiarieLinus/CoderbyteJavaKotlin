// For this challenge you will be manipulating characters
// in a string based off their positions in the alphabet.
// Replace every letter in the string with the letter 
// following it in the alphabet (ie. c becomes d, z becomes a). 
// Then capitalize every vowel in this new string (a, e, i, o, u) 
// and finally return this modified string.

fun LetterChanges(str: String): String{
    str.lowercase()
    val result = str.replace("[^a-z]".toRegex(),"").map{prev -> 
        var curr = if(prev == 'z') 'a' else (prev+1).toChar()
        if("[aeiou]".toRegex().matches(curr.toString())) curr.uppercaseChar()
        else curr 
    }
    return result.joinToString("")
} 

fun main() {
    print(LetterChanges("handz"))
}