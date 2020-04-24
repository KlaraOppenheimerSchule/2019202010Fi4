class Cipher constructor(val cypherKey: Int){

    public fun CipherString(inputString: String) : String{
        //String to return
        var returnString = ""
        //Modulu the cypherKey in case it is higher than 26
        val shift = cypherKey % 26

        //Iterate over each character in the inputString
        for (c in inputString){
            var r = c //c is read-only, so we assign it to r(eturn)

            //Check if the end-result ends up above their corresponding decimal number and subtract 26 if so.
            // For example, we have Z with a shift of 1. So it'd be 91. 91-26=65 which is A.
            if(c in 'A'..'Z'){
                r += shift
                if(r > 'Z') r -= 26
            }

            if(c in 'a'..'z'){
                r += shift
                if(r > 'z') r -= 26
            }

            //add the changed char to the final return value
            returnString += r
        }
        return returnString
    }

    //reverse logic of the CipherString function
     fun DecipherString(inputString: String) : String{
        var returnString = ""
        val shift = cypherKey % 26


        for (c in inputString){
            var r = c

            if(c in 'A'..'Z'){
                r -= shift
                if(r < 'A') r += 26
            }

            if(c in 'a'..'z'){
                r -= shift
                if(r < 'a') r += 26
            }

            returnString += r
        }
        return returnString
    }

}