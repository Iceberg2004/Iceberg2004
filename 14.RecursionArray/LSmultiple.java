import java.util.ArrayList;

public class LSmultiple {
    public static void main(String[] args) {
        int [] arr={1,54,23,23,78,65};
        System.out.println(LSM(arr, 23, 0));
        
    }
    static ArrayList<Integer> list= new ArrayList<Integer>();

    static ArrayList<Integer> LSM(int [] arr,int target, int i){
        if(i==arr.length){
            return list;
        }
        if (target==arr[i]) {
            list.add(i);
        }
        
        return LSM(arr, target, i+1);
    }
    
}
