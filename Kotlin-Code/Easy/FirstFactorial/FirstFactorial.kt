// For this challenge you will be determining the factorial 
//for a given number.

fun FirstFactorial(num: Int): Int{
    return when(num){
        0 -> 1
        1,2 -> num
        else -> num * FirstFactorial(num-1)
    }
}

fun main() {
    print(FirstFactorial(12))
}