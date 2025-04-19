// not class of room A , lets see how private ,protected and default will behave
public class RoomC{



    public static void main(String[] args){

        RoomA obj = new RoomA();


        obj.resultDefault();
        // obj.resultPrivate();
        obj.resultProtected();

        //so even if no inheritance ,
        //the default and protected methods will be available in the same pacakage 




    }

}