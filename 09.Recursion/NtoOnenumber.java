public class NtoOnenumber {
    public static void main(String[] args) {
        // que-> given a number 'n' and u have to print n ,n-1 ,n-2, n-3,n-4... and so on.
        
        int n = 5;
        bothFun(n);
    }

    static void NtoOne(int n) {
        if (n == 0) {           //exit case
            return ;
        }

         NtoOne(n - 1);               //execute case
         System.out.print(n+ " ");
    }
    static void bothFun(int n){
        if (n == 0) {           //exit case
            return ;
        }
        System.out.print(n+ " ");
         bothFun(n - 1);               //execute case
         System.out.print(n+ " ");

    }
    
}
