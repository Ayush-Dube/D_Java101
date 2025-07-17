package methodChaining;

public class PizzaMain {

	public static void main(String[] args) {
		
//		new Pizza().addCheese().addMushroom().bake();
//		new Pizza2().addCheese().addToppings().bake();
		
		//💥observe here, that the above opearation does not have a instance/object , 
		//therfore we can not use it again/elsewhere
		
		Pizza2 pz = new Pizza2();
		
		pz.addCheese().addSauce().addToppings().addCheese().bake();
		
		//imagine if method chaining was not present or the retrun statement is not provided
		
		//this is not method Chaining...
		Pizza2 ins = new Pizza2();
		ins.addCheese();
		ins.addSauce();
		ins.addToppings();
		ins.bake();
		
//		Pizza2 ins2 = new Pizza2().addToppings().addCheese().bake();
		//error bcoz bake() is retrun a void type.
		
		

	}

}
