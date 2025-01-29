import java.util.ArrayList;

public class LSinALM2 {
    public static void main(String[] args) {
        //doing linear search but storing values in arraylist that is not passed in arguments

        int [] arr={1,3,6,4,4,4,8};
        System.out.println(LSinAL(arr));
    }

     static ArrayList<Integer> LSinAL(int [] arr){
        return helper(arr,4,0);
        
    }
    private static ArrayList<Integer> helper(int [] arr,int target,int i){
         ArrayList<Integer> list= new ArrayList<Integer>();             //if i dont have to pass arrray list int the argument then i will use addAll to sum up all the answers from the recurdion call

        if(i==arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> AllAnsFromBelow= helper(arr, target, i+1);

        list.addAll(AllAnsFromBelow);

        return list;

    }
    
}
