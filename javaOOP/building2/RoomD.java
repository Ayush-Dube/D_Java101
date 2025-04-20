package building2;

import building1.*;
//Non-Class Other package;

public class RoomD{

    public static void main(String[] args){
        System.out.println("RoomD");


         RoomA obj1 = new RoomA();

        obj1.resultPublic();
        // obj1.resultDefault(); // will not work
        // obj.resultPrivate();
        // obj1.resultProtected(); // will not work

        //this is a NON Class in a other package..

        // therfore nothing will work except the public method
        //public✅
        //private❌
        // protected❌
        //default❌
    }
}