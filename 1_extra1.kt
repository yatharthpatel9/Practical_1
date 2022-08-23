fun main() {
    var a=10
    var b=20
    println("With Using Third Variable")
    println("Before Swapping")
    println("The value of a is:$a and Value of b is: $b")
    val temp = a
    a=b
    b=temp

    println("After Swapping")
    println("The value of a is:$a and Value of b is: $b")

    var a1 = 10
    var b1 = 20
    println("*********")
    println("Without Using Third Variable:")
    println("Before Swapping")
    println("The value of a is:$a1 and Value of b is: $b1")
    a1 = (a1 + b1)
    b1 = (a1 - b1)
    a1 = (a1 - b1)

    println("After Swapping")
    println("The value of a is:$a1 and Value of b is: $b1")
}
