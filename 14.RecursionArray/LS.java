public class LS {
    public static void main(String[] args) {
        int [] arr={1,4,7,3,8,32};
        System.out.println(LinearS(arr, 32, 0));

    }
    static int LinearS(int [] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if (target==arr[i]) {
            return i;
        }
        
        return LinearS(arr, target, i+1);
    }
    
}
