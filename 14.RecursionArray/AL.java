import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {

        int [] arr={1,54,23,23,23,23,23,78,65};
        LSM(arr, 23, 0,list);
        System.out.println(list);
        //printing list and calling function will give same output
        System.out.println(LSM(arr, 0, 0, list));

        
    }
    static ArrayList<Integer> list= new ArrayList<Integer>();

    static ArrayList<Integer> LSM(int [] arr,int target, int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if (target==arr[i]) {
            list.add(i);
        }
        
        return LSM(arr, target, i+1,list);
    }
    
}
    