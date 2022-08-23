fun fact(n:Int):Int{
    var f=1
    for (i in 1..n) {
        f *= i
    }
    return f
}

tailrec fun factTail(n:Int):Int {
    return if (n==1) 1 else n * factTail(n-1)
}

fun main() {
    print("Enter Number:")
    val n : Int = readLine()!!.toInt()
    println("Factorial of 5 : ${fact(n)}")
    println("By Tailrec Keyword, Factorial of 5 : ${factTail(n)}")
}
