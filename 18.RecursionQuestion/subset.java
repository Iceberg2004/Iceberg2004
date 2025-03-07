import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        subseq(" ", "abc");
        System.out.println(subseqRet(" ", "abe"));   
        subseqascii(" ", "abc");
        System.out.println(subseqRetArrayAscii(" ","abc"));

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
    // doing it by arraylist- there are two ways to do it by arraylist 
    //1. we create an arraylist otside the function and pass arraylsit in the argument and then return array lsit
    //but that is the simplw method so...
    //we will make one left and one right variables and then we'll add them by adAll function  

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    //to print the ascii values of the subsets...

    static void subseqascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        subseq(p, up.substring(1));  // ignore char
        subseq(p+ ch, up.substring(1));   // add char
        subseq(p+ (ch+0), up.substring(1));   // add char ascii values

    }
    //now printing ascii values in the arraylist 
    static ArrayList<String> subseqRetArrayAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        ArrayList<String> ascii = subseqRet(p+ (ch+0), up.substring(1));   // add char ascii values

        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
    }

