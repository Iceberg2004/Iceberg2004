public class pyramids{
    public static void main(String[] args) {

        /*  print this pattern
                * 
                **
                ***
                ****
                        */
        
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}