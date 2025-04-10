public class Assignment2{
 
    static void patterns(int a){
        int  row = a;
        // System.out.println(row);
        for(int i = 1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }        
    } 
    public static void main(String[] args){
        System.out.println("t");
        patterns(7);
    }
}