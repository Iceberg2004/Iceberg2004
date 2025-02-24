public class skipstring {
    public static void main(String[] args) {
       System.out.println( skipString("b d c apple mango")); // slips the string apple here

       System.out.println( skipAppNotApple("b d c apple appmango")); // slips the string apple here

    }

    static String skipString(String up){
        if(up.isEmpty()){

            return " ";
        }

        if(up.startsWith("apple") ){   //starts with function checks for the start of the string with given value, here its apple(char 5)
            return skipString(up.substring(5));
        }
        else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
        // skips app string but not if its apple
        
        static String skipAppNotApple(String up){
            if(up.isEmpty()){
    
                return " ";
            }
    
            if(up.startsWith("app") && !up.startsWith("apple") ){
                return skipAppNotApple(up.substring(3));
            }
            else {
                return up.charAt(0) + skipAppNotApple(up.substring(1));
            }
    }
}
