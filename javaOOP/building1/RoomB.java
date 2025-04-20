package building1;

public class RoomB extends RoomA{



    public static void main(String[] args){
        RoomA rm = new RoomA();


        rm.resultDefault();
        // rm.resultPrivate();
        rm.resultProtected();

        // so private are only usefull within the class they are present ,not oustside,not even outside the pacakge 
        // private-->class only        
    }
}