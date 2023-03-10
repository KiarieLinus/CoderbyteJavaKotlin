// For this challenge you will be determining 
// the largest word in a string.

fun LongestWord (sen: String): String{
    val senArr = sen.trim().replace("[\\s]+".toRegex(),",").split(",")
    var result = senArr[0]
    for(i in 1 until senArr.size){
        val word = senArr[i]
        if(result.length < word.length){
            result = word
        }
    }
    return result
}

fun main() {
    println(LongestWord("  what   happened  "))
    println(LongestWord("Wow very beautiful"))
}