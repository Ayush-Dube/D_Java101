package underTheHood;

public class Circle {

	// instance variable
	int radius;
	String color;

	// static variable
	static float pi = 3.14f;

	// construcutor's
	Circle(int radius) {
		this.radius = radius;
	}

	// what if i dont passany paramemter , what is rememdy in that case
	// construcutor for different scenarios

	void perimeter1() {
		float res = 2 * this.radius * Circle.pi;

		System.out.printf("Circumference for the given radius is :- %.2f %n", res);
	}

	void surfaceArea2() {
		float res = 4 * pi * radius * this.radius;
		System.out.printf("Total surface Area for the given radius is :- %.2f %n", res);
	}

	void volume3() {
		float res = pi * radius * radius * radius * 4 / 3;
		System.out.printf("Volume for the given radius is :- %.2f%n", res);
	}

	// here in some case i used this.radius ,radius,pi,Circle.pi ,what is the
	// correct way

	// difference between putting a /n at the starting and end.

	// static method
	static void staticInfo4() {
		int x = 360;
		System.out.printf("A cicrcle has %d degree's in it. %n", x);
	}

	int[] myArr1 = { 1, 3, 7 };
	static int[] myArr2 = { 1, 2, 5, 11 };

}
