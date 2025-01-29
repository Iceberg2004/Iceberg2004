public class triangle {
    public static void main(String[] args) {
        tri(5, 0);
        tri2(5, 0);
    }
    //      reverse pyramid
    static void tri(int r,int c){
        if(r==0){
            return;

        }
        if(c<r){
            System.out.print("* ");
            tri(r, c+1);
        }
        else{
            System.out.println();
            tri(r-1, 0);
        }
// in recurson,if u call function beforre the print statements it will print first statements first and if u call it after function calling then it will print first statement at last and last statement at first.
    }
                //pyramid
    static void tri2(int r,int c){
        if(r==0){
            return;

        }
        if(c<r){
            tri2(r, c+1);
            System.out.print("* ");

        }
        else{
            tri2(r-1, 0);
            System.out.println();

        }
    }
    
}
