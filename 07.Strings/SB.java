public class SB {
    public static void main(String[] args) {

        String series ="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series = series + ch +" ";      // string is immuatble,every time its create a new object to store the data 
        }
        System.out.println(series);

        System.out.println();

        StringBuilder string = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            string.append(ch+" ");                       //string builder creates a single object and alter the data in it,it is mutable
        }
        System.out.println(string.toString());

        // reversing a string

        string.reverse();
        System.out.println(string.toString());
    }
    
}
