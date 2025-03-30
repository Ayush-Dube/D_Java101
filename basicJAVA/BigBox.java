public class BigBox{

    public void smallBox1(){
        System.out.println("samllBox1");
    }

    public void smallBox2(){
        System.out.println("samllBox2");
    }

    public static void smallBox3(){
        System.out.println("samllBox3");
    }





    public static void main(String [] args){
        System.out.println("This is main method");

        // smallBox1();
        // smallBox2();
        // smallBox3();

        // as u may notice u can not use a non static method inside a main (ie static method) method.
        // to do so u have to do instant-sia- tion on the non- static methods 

        BigBox obj1 = new BigBox();
        
        // smallBox1(); 
        // calling smallBox1(); will still give error even if have done instant sia tion , to make it work u have to call it 
        // like -- obj1.smallBox1();
        //then it will worl properly

        obj1.smallBox1();
        obj1.smallBox2();
        smallBox3();


    }
}