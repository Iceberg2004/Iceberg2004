public class subset {
    public static void main(String[] args) {
        subseq(" ", "abc");
    }
    //subseq is a function making power set of a function that is 2^n no of sets

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        subseq(p, up.substring(1));  // ignore char
        subseq(p+ ch, up.substring(1));   // add char
 
    }
    
}
