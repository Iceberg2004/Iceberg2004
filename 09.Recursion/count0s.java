public class count0s {
    public static void main(String[] args) {
        System.out.println(countTheZeros(380480474));
    }
    static int countTheZeros(int n){
     return helper(n,0);
    }
private static int helper(int n,int count){
  if(n==0){
    return count;
  }
  if(n%10==0){
    return helper(n/10, count+1);
  }
  if(n%10!=0){
    return helper(n/10, count);
  }
  return count;
}
}
