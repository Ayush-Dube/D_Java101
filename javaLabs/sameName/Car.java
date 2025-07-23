class Car{

    static final String defaultColor = "White"; //class level variable, can be accesed directly   
    //without making  further object.

    String color;

    Car(){//if object is created using Car constructor.
        this.color=defaultColor;
    }

    Car(String xyz){
        this.color=xyz;
    }

    void details(){
        System.out.println("Car color: "+this.color);
    }
}