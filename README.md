1. Store & Display values in different variable of different type (Integer, Double, Float, Long, Short, Byte, Char, Boolean, String)

Answer : 
 
fun main()
{
    // Defining Variables :
    var i: Int = 22
    var f: Float = 1.5F
    var c: Char = 'T'
    var st: String = "HMS"
    var bl: Boolean = false
    var d: Double = 96.36
    var l: Long = 338927847
    var s: Short = -2
    var b: Byte = 127

    // Printing all the Variables :
    println("Integer Value: $i")
    println("Float Value: $f")
    println("Character Value: $c")
    println("String Value: $st")
    println("Boolean Value: $bl")
    println("Double Value: $d")
    println("Long Value: $l")
    println("Short Value: $s")
    println("Byte Value: $b")
}


Output : ![image](https://user-images.githubusercontent.com/93566991/186707464-0d28833b-a897-437a-b543-ab5fbe475a21.png)

 
 

2. Type conversion: 
Integer to Double, String to Integer, String to Double. Answer : 
 
fun main(){
    var a:Int = 10
    var b = a.toDouble()
    var g: String = "10"
    var f: String = "11.12"
    var c = Integer.parseInt(g)
    var d = g.toInt()
    var e = f.toDouble()
    println("Integer Value:$a")
    println("Double Value (From Integer):$b")
    println("String Value:$g")
    println("Integer Value1 (From String):$c")
    println("Integer Value2 (From String):$d")
    println("Double Value (From String):$e")
}

Output : 
 ![image](https://user-images.githubusercontent.com/93566991/186707550-4f12c86e-b2be-440d-9930-69c5a3d64d64.png)

 
 
3. Scan student’s information and display all the data.

 Answer : 
 
fun main() {
    
    print("Student Enrollnment Number: ")
    val EnrollNo: String = readLine()!!.toString()
    
    print("Student Name: ")
    val Name: String = readLine()!!.toString()

    print("Student Branch: ")
    val Branch: String = readLine()!!.toString()

    print("Student Class: ")
    val Class: String = readLine()!!.toString()

    print("Student Batch: ")
    val Batch: String = readLine()!!.toString()

    print("Student College Name: ")
    val ColName: String = readLine()!!.toString()

    print("Student University Name: ")
    val UniName: String = readLine()!!.toString()

    print("Student Age: ")
    val Age: Int = readLine()!!.toInt()
    

    

    println("\n\n*******************\n\n")
    println("Student's Data:")
    println("Enrollnment Name: $EnrollNo")
    println("Name: $Name")
    println("Age: $Age")
    println("Branch: $Branch")
    println("Class: $Class")
    println("Batch: $Batch")
    println("College Name: $ColName")
    println("University Name: $UniName")
}

Output : 
 
 ![image](https://user-images.githubusercontent.com/93566991/186707685-ba7e0c2e-d8b0-4c0d-a714-1bbdcda09811.png)

 
4.	Find the number is odd or even by using Control Flow inside println() method. 
Answer : 
 
fun main(){
    print("Enter Number: ")
    val num = readLine()!!.toInt()
    if (num%2==0){
        println("$num is Even")
    }
    else{
        println("$num is Odd ")
    }
}
 
Output : 
 
 ![image](https://user-images.githubusercontent.com/93566991/186707748-b8227ec5-b5ef-4523-a6f2-d4d6b0788900.png)

 
5.	Display month name using When 
Answer : 
 
fun main() {
    print("Enter the Month : ")
    val month = readLine()!!.toInt()

    when (month) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("please enter proper number")
    }
}

Output : 
 
![image](https://user-images.githubusercontent.com/93566991/186707800-6da443fb-59b9-4a04-97c4-23d8a0a517f6.png)
![image](https://user-images.githubusercontent.com/93566991/186707828-5b6c9ae1-6d70-49d0-88cb-aa77515d2558.png)
 
 
 
6.	By using a user defined function perform all arithmetic operations. Answer : 
 
fun calc(a:Int, b:Int,c:Int){
    println("Addition of $a, $b, $c is ${a+b+c}")
    println("Subtraction of $a, $b , $c is ${a-b-c}")
    println("Multiplication of $a, $b , $c is ${a*b*c}")
    println("Division of $b , $a is ${b/a}")
}

fun main(){
    calc(111,2222,-222)
}
Output :
![image](https://user-images.githubusercontent.com/93566991/186707884-0d37d5ad-f907-4f8c-aa5a-2028a32b4ce8.png)

  


7. Find the factorial of number by recursion. Explain "tailrec" keyword. 
Answer : 
 
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

Output : 
 
 ![image](https://user-images.githubusercontent.com/93566991/186707946-c96559b9-6c35-4486-9009-41f8f7122e18.png)

 
8. Create different types of Array as shown in image. Explore Arrays.deepToString(), contentDeepToString() methods, IntArray variable .joinToString()  and use in program to print Array. Explore range, downTo, until etc. for loop and use in this program. Sort Array of Integer data type without using inbuilt function & with using inbuilt function 
Answer : 
 
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

Output : 
 
 ![image](https://user-images.githubusercontent.com/93566991/186708015-01539c86-584e-4979-ae40-4a8052b3da76.png)

  
 
9.	Find the max number from ArrayList. 
Answer : 
 
fun main() {
    print("Enter Elements : ")
    val n:Int = readLine()!!.toInt()
    val a = ArrayList<Int>()
    var maxa = 0
    for (i:Int in 0 until n){
        print("a[$i] = ")
        a.add(i,readLine()!!.toInt())
        if (maxa<a[i]){
            maxa = a[i]
        }
    }
    println("Largest element =$maxa")
    } 
Output : 
 
 
![image](https://user-images.githubusercontent.com/93566991/186708067-633cee0c-f32d-4e7b-b706-f2ff8745f978.png)

 
10.	Write Different types of Class & Constructor. Create a class Car and set various members like type, model, price, owner, milesDrive. add the function getCarPrice in it. Create an object of Car class and access property of it. (getCarInformation(), getOriginalCarPrice(), getCurrentCarPrice(), displayCarInfo() etc.)

Answer : 
 
fun main() {
    val car1 = Car("BMW, 2018", "Aman", 105, 100000.0, 98950.0)
    car1.getCarFullDetails()

    val car2 = Car("BMW, 2019", "Karan", 20, 400000.0, 399800.0)
    car2.getCarFullDetails()

    val Cars = ArrayList<Car> (2)
    val car3 = Car("Toyota, 2017","KJS",100,1080000.0,1079000.0)
    val car4 = Car("Maruti, 2020","NPP",200,4000000.0,3998000.0)
    Cars.add(car3)
    Cars.add(car4)

    for (i in Cars){
        println("-------------------")
        i.getCarFullDetails()
    }
}

class Car(private val model: String, private val owner: String, private val miles: Int, private val original: Double, private val current: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }

    private fun info(): String {
        return model
    }

    private fun carowner(): String {
        return owner
    }

    private fun milesDrive(): Int {
        return miles
    }

    private fun orgprice(): Double {
        return original
    }

    private fun currprice(): Double {
        return current
    }

    fun getCarFullDetails() {
        println("----------")
        println("Car Information : ${info()}")
        println("Car owner : ${carowner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${orgprice()}")
        println("Current Car Price : ${currprice()}")
        println("----------\n")
    }
} 
Output : 

 
 ![image](https://user-images.githubusercontent.com/93566991/186708145-1e225aa3-35df-4ddb-b71a-20620ed68e6b.png)

 



11. Write about Operator Overloading. Perform Matrix Addition, Subtraction & Multiplication using Class Matrix & operator overloading. Overload toString() function in Matrix class. 
Answer : 
 
class Matrix(private val matrix: Array<IntArray>, private val rows: Int, private val cols: Int) {

    override fun toString(): String {
        var res = "($rows x $cols Matrix): \n"
        for (i in matrix) {
            for (j in i) {
                res += "$j\t"
            }
            res += "\n"
        }
        return res
    }

    operator fun plus(obj: Matrix): Matrix {
        val sum = Array(this.rows) { IntArray(this.cols) }

        for (i in 0 until this.rows) {
            for (j in 0 until this.cols) {
                sum[i][j] = this.matrix[i][j] + obj.matrix[i][j]
            }
        }
        return Matrix(sum, this.rows, this.cols)
    }

    operator fun minus(obj: Matrix): Matrix {
        val sub = Array(this.rows) { IntArray(this.cols) }

        for (i in 0 until this.rows) {
            for (j in 0 until this.cols) {
                sub[i][j] = this.matrix[i][j] - obj.matrix[i][j]
            }
        }
        return Matrix(sub, this.rows, this.cols)
    }

    operator fun times(obj: Matrix): Matrix {
        val mul = Array(this.rows) { IntArray(obj.cols) }

        for (i in 0 until this.rows) {
            for (j in 0 until obj.cols) {
                mul[i][j] = 0
                for (k in 0..obj.cols) {
                    mul[i][j] += this.matrix[i][k] * obj.matrix[k][j]
                }
            }
        }
        return Matrix(mul, this.rows, obj.cols)
    }
}

fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix2 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("*********************** Addition ***********************")
    println("Matrix 1 : ")
    println(secondMatrix2.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val addMatrix = secondMatrix2 + secondMatrix1
    println("Addition : $addMatrix")

    println("*********************** Subtraction ***********************")
    println("Matrix 1 : ")
    println(secondMatrix2.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val subMatrix = secondMatrix2 - secondMatrix1
    println("Subtraction : $subMatrix")

    println("*********************** Multiplication ***********************")
    println("Matrix 1 : ")
    println(firstMatrix.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val mulMatrix = firstMatrix * secondMatrix1
    println("Multiplication : $mulMatrix")
} 
 
Output : 

![image](https://user-images.githubusercontent.com/93566991/186708236-40fa0238-3299-4b8c-93ea-f5b1d1fbc177.png)
![image](https://user-images.githubusercontent.com/93566991/186708268-2ff716c9-5b26-4f6d-8147-5f2a776d8fa3.png)


 EXERCISES: KOTLIN PROGRAMS 
1. Swap Value of two variables without using third variable and with using third variable 

CODE:
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

OUTPUT:
 ![image](https://user-images.githubusercontent.com/93566991/186708326-90afbd14-54dd-45c2-ab51-3028ffa4ebc0.png)



