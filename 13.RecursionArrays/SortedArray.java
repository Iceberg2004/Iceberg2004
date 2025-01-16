public class SortedArray {
    public static void main(String[] args) {
        int [] n={1,2,3,4};
        System.out.println(sortedArray(n));
    }
    static boolean sortedArray(int[] n){
         return helper(n,0);
    }
    private static boolean helper(int [] n,int i){
       
       if(i==n.length-1){
        return true;
       }
       return n[i]<n[i+1] && helper(n, i+1);
    }

    
}
