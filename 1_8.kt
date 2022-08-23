fun main() {

    println("Create Array-1 by using arrayOf() method: ")
    val a1 = arrayOf(10, 90, 60, 80, 100)
    println(a1.contentToString())

    println("Create Array-2 by using Array<>(): ")
    val a2 = Array(5) { 0 }
    println(a2.contentToString())

    println("Create Array-3 by using Array<>() and lambda function: ")
    val a3 = Array(8) { i -> i }
    println(a3.contentToString())

    println("Create Array-4 by using IntArray() : ")
    val a4 = IntArray(5)
    println(a4.joinToString(", "))



    println("\nCreate Array-5 by using intArrayOf() : ")
    val a5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println(a5.joinToString(", "))



    println("\nCreate 2-D Array using arrayOf() & intArrayOf() : ")
    val a6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println(a6.contentDeepToString())

    print("Please enter Array Value: ")
    val size: Int = readLine()!!.toInt()
    val a7 = IntArray(size) { 0 }

    for (i in 0 until size) {
        print("a[$i]=")
        a7[i] = readLine()!!.toInt()
    }

    println("\nEntered Array : ")
    println(a7.contentToString())

    println("************* With Built-in Function***************")
    println("After Sorting by built-in function : ")
    a7.sort()
    println(a7.joinToString(", "))

    val a8 = intArrayOf(56,23,49,12,2)
    println("\n*************Without Built-in Function***************")
    println("Before Sorting: ")
    println(a8.joinToString(", "))

    var temp: Int
    for (i in a8.indices) {
        for (j in a8.indices) {
            if (a8[j] > a8[i]) {
                temp = a8[j]
                a8[j] = a8[i]
                a8[i] = temp
            }
        }
    }
    println("\nAfter Sorting without built-in function : ")
    println(a8.joinToString(", "))
}
