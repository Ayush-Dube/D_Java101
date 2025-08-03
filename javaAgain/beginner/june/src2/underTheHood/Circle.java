package underTheHood;

public class Circle {
	
	//instance variable
	int radius;
	String color;
	
	//static variable
	static float pi = 3.14f;

	Circle(int radius) {
		this.radius = radius;
	}

	// what if i dont passany paramemter , what is rememdy in that case
	// construcutor for different scenarios

	void perimeter1() {
		float res = 2 * this.radius * pi;

		System.out.printf("Circumference for the given radius is :- %.2f %n",res);
	}
	
	void surfaceArea2() {
		float res = pi*radius*radius;
		System.out.printf("Total surface Area for the given radius is :- %.2f %n",res);
	}
	
	void volume3() {
		float res = pi*radius*radius*radius*4/3;
		System.out.printf("Volume for the given radius is :- %.2f%n",res);
	}
	
	//difference between putting a /n at the starting and end.
	
	

}
