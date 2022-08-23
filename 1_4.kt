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
