public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,5,7,33,9,6};     //no need of sorted array
        System.out.println(linear(arr));
    }
    static int linear(int [] arr){
        return helper(arr,7,0);

    }
    private static int helper(int [] arr,int target,int i){
        if(arr[i]==target){
            return i;

        }
        if(i==5){
            return -1;
        }
        return helper(arr, target, i+1);
    }
}
