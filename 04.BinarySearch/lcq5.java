public class lcq5 {
    public static void main(String[] args) {
        // que->https://leetcode.com/problems/find-in-mountain-array/description/
        //mountain array with repeating integers .Find the target present at smallest index
        //cannot submit to leetcode becoz oops knowledge required
        int [] arr = {1,2,3,4,5,6,7,8,6,4,3,2,1};
        int target = 6;
        System.out.println(BinaryS(arr, target));
    }

    static int BinaryS(int arr [], int target){
        int start=0;
        int end=mountainArray(arr);

        while(start<=end){
            int mid=(start+end)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;

            }
        }
        return -1;
    }

    static int mountainArray(int [] arr ){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } 
            else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one target is remaining, hence cuz of above line that is the best possible ans
        return end; // or return end as both are =
    } 
    

}