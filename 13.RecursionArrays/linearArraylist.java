import java.util.ArrayList;

public class linearArraylist {
    public static void main(String[] args) {
        int [] arr={1,3,6,4,4,4,8};
        System.out.println(LSinAL(arr));
    }
    static ArrayList<Integer> list= new ArrayList<Integer>();
    
    static ArrayList<Integer> LSinAL(int [] arr){
        return helper(arr,4,0,list);
    }
    private static ArrayList<Integer> helper(int [] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return helper(arr, target, i+1, list);

    }
    
}
