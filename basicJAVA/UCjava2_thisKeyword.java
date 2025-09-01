public class UCjava2_thisKeyword{

    static String name = "Adam";// why only double quotes;
   

    public void showMsg(String name){
        System.out.println("function fed same name variable: " +name);
        System.out.println("outside main same name variable: " +this.name);

    }


     // MAIN FUNCTION
    public static void main(String[] args){
        System.out.println("testing");
        System.out.println(name);

        //now to call the showMsg function , I have to make a instance of it inside the main function 
        UCjava2_thisKeyword obj1 = new UCjava2_thisKeyword();

        obj1.showMsg("Birla");// again double quotes error
    }



}

