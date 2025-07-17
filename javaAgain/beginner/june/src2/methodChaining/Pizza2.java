package methodChaining;


/*
 *  - observe that this class doesnot have a constructor
 *  - because the construcutor is made by java byDefault
 *  - imagine there is line hidden code written 
 *  	Pizza2(){}  
 *  
 *  
 *  
 *  */


class Pizza2 {
    public Pizza2 addCheese() {
        System.out.println("Cheese added.");
        return this;
    }

    public Pizza2 addSauce() {
        System.out.println("Sauce added.");
        return this;
    }

    public Pizza2 addToppings() {
        System.out.println("Toppings added.");
        return this;
    }

    public void bake() {
        System.out.println("Pizza is baked!");
    }
}