package building2;

import building1.*;



public class RoomE extends RoomA{

    public static void main(String[] args){
        System.out.println("RoomE");

        // RoomA rmA =new RoomA(); 

        // rmA.resultDefault();❌
        // rmA.resultPrivate();❌

        // rmA.resultProtected();❌
        // rmA.resultPublic();  //will work

        // you can not make a object of other pacakage's class.
        //since u already have done inheritance , make a object od your own and then use those building1 ,roomA methods 

        RoomE rmE = new RoomE();

        // rmE.resultDefault();
        // rmE.resultPrivate();
        rmE.resultProtected();
        rmE.resultPublic();

        // this is subClass and protected method of other package can be used here. using extend & instantiation.
        // but remember you have to make object of your own class(which has already inherited eveything ) and then call methods .


    }
}