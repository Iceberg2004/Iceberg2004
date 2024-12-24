public class BSRecursion {
    public static void main(String[] args) {
        int [] arr={3,6,2,88,6,44};
       System.out.println(BSRecur(arr, 44, 0, arr.length-1));
    }
    static int BSRecur(int [] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
       
        
        if(arr[m]==target){
           return m;
        }
        if(arr[m]>target){
            BSRecur(arr, target, s, m-1);
        }
        return BSRecur(arr, target, m+1, e);
    }
}
