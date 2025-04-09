public class Assignment1{

    static void tables(int a){

        for(int i=1;i<=10;i++){
            System.out.println(a +" * "+i+" = "+(a*i));
        }

    }

    static void areEven(){

        for(int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println(i+" is a even number.");
            }
            else{
                continue;                
            }              
        }
    }

    static void sumUpto(int a){

        int x =0;
        int sum = 0;
        while(x<=a){
            sum+=x;
            x++;
        }
        System.out.println("The sum upto first "+a+" is "+sum+".");
    }

    static void allNine(){

        int sum =0;

        for(int i=100;i<=200;i++){
            if(i%9==0){
                System.out.println(i+" is divisible by 9.");
                sum+=i;
            }
            else{
                continue;
            }
        }

        System.out.println("Sum is "+sum);
    } 


    public static void main(String[] args){

        // tables(2);
        // tables(935);
        // areEven();
        // sumUpto(10);
        allNine();
        
    }
}