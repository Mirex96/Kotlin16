// 16. Написать функцию, которая на вход принимает число и массив и проверяет,
// содержится ли это число в массиве. (IntArray, Int) -> Boolean
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val number = 10
    check(array, number)
}

fun check(array: Array<Int>, number: Int): Boolean {
    val check = array.contains(number)
    println(check)
    return true
}