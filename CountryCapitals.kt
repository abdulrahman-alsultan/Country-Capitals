fun main(){
    var country = listOf("Saudi Arabia", "Egypt", "United States of America")
    var arr = arrayListOf<String>()

    for(i in 0..2){
        print("What is the capital city of ${country[i]}: ")
        arr.add(readLine().toString())
    }
    for(i in 0..2){
        println("The capital city of ${country[i]} is: ${arr[i]}")
    }
}