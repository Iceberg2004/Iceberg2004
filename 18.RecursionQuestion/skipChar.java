public class skipChar {
    public static void main(String[] args) {
    skip(" ","bcdaaach" );   
 }

    static void skip(String p,String up){  // code to remove 'a; from the string or array of characters

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0); //here char at works as indexing in array like : arr[0]
        if(ch=='a'){
            skip(p,up.substring(1)); // substring cuts the string and make subset of it from the index we give

        }
        else{
            skip(p+ch,up.substring(1));

        }
    }
    
}
