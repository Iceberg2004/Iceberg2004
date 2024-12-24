public class recursion {

    public static void main(String[] args) {
      
        //a self calling function is called recursion
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;                               // here f(0)=0 & f(1)=1
        }
        return fibo(n-1) + fibo(n-2);
    }
}

// steps to dolve recursion problem
/*
  1. break the problem into smaller problems
  2.write the reoccurence relation if needed
  3.draw the recursion tree
  4.see the flow of functions ,how they are getting in stack

 */