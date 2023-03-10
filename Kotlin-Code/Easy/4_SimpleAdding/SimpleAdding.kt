//  For this challenge you will be 
//  adding up all the numbers from 1 to a certain argument.

fun SimpleAdding(num: Int): Int{
    if(num == 1) return 1

    return num + SimpleAdding(num-1)
}
fun main() {
    print(SimpleAdding(5))
}