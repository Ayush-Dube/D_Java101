package building1;

public class RoomA{

    int x =1;
    String name = "asus";

    private void resultPrivate(){
        System.out.println(name+x+" is private method.");
    }

    void resultDefault(){
        System.out.println(name+x+" is default method.");
    }

    protected void resultProtected(){
        System.out.println(name+x+" is protected method.");
    }

    public void resultPublic(){
        System.out.println(name+x+" is public method.");

    }



    public static void main(String[] args){
       
        RoomA obj = new RoomA();

        obj.resultPrivate();
        obj.resultDefault();
        obj.resultProtected();
    }
}