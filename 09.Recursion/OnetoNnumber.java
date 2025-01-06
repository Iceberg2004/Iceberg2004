public class OnetoNnumber {
   
    public static void main(String[] args) {
        int N=5;
        OnetoN(N);
    }
    

    static void OnetoN(int N){
        if (N == 0) {           //exit case
            return ;
        }

         OnetoN(N - 1);               //execute case
         System.out.print(N + " ");          

    }
}
