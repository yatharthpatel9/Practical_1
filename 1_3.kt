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
