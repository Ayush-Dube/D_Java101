package methodChaining;

//code1

public class Pizza {
	
	// lets see how and why method chaining is done 
	
	/*	  
	 Rules
	 - datatype/retruntype same as Top class.
	 - return this	
	 
	 - `return this` -> instance/object ka reference(address in memory) return karta hai 
	 
	 
	*/ 
	
	boolean hasCheese;
	boolean hasTomato;
	boolean hasMushroom;
	
	Pizza addCheese() {
		this.hasCheese =true;
		System.out.println("🧀 cheesw added");
		return this;
	}
	
	Pizza addTomato() {
		this.hasTomato = true;
		System.out.println("🍅 tomato added");
		return this;
	}
	
	Pizza addMushroom() {
		this.hasMushroom = true;
		System.out.println("🍄 mushrooms added");
		return this;
	}
	
	void bake() {
		System.out.println("🔥 Baking pizza with:");
		if(hasCheese)System.out.println("🧀");
		if(hasTomato)System.out.println("🍅");
		if(hasMushroom)System.out.println("🍄");
		System.out.println("Yay! Your Pizza is ready!");
		
		
	}
	
	/*
	 Pizza p = new Pizza();  p -> 0xA1B2
	 p.addCheese();
	 return this   returns 0xA1B2
	 Pizza q = p.addCheese()  q->also points to 0xA1B2
	 
	 
	 It is like geting a parcel ,do the operation on the content of parcel and 
	 then again pass it to next entity
	 
	 👉bina return this vala method agr beechmei lekh deya tou chain tut jaygi
	 new Pizza().addCheese().bake().addMushroom(); ❌❌
	 
	 
	 */	   

}
