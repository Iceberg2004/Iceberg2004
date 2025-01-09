public class reverse {
    public static void main(String[] args) {
    // rev1(1743);
    // System.out.println(sum);  //reverse a number using recursion
    int n=1234;
    System.out.println(rev2(n));
    }
                 //method 1 to reverse a number

    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum * 10 + rem;
        rev1(n/10);
    }
                   //method 2 to reverse a number

    static int rev2(int n){          

    int digits =(int)(Math.log10(n)) +1;
    return helper(n,digits);

    }

     // making another'helper' function coz we need arguments 

    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem= n % 10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);

    }
    
}
