fun main(){
    print("Please type in a message: ")
    val inputString = readLine()!!

    print("Please type in the amount to Cipher Shift: ")
    val cipher = Cipher(readLine()!!.trim().toInt())

    println("Do you want to cipher or decipher?")
    println("Type Y to cipher. N to decipher")
    val choice = readLine()!!.trim()

    print("Your result is: ")
    if(choice == "Y"){
        print(cipher.CipherString(inputString))
    }else if(choice == "N"){
        print(cipher.DecipherString(inputString))
    }

}
