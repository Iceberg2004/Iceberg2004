public class sortedornot {
    public static void main(String[] args) {
        int [] arr={1,2,6,4,5};
        System.out.println(SoNArray(arr,0));
    }
    static boolean SoNArray(int [] arr,int i){
        if(i==4){
            return true;
        }

        if(arr[i]<arr[i+1]){
            return SoNArray(arr,i+1);
        }
        else{
            return false;
        }
    }

    
}
