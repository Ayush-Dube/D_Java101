 package underTheHood;

public class FlowDemoMain {

	public static void main(String[] args) {

		Circle.staticInfo4();
		System.out.println(Circle.pi);

		Circle c1 = new Circle(1);
		
		System.out.println(c1);//this will out put a memory address , which means c1 has memory value.
		//but the actual object is at this coordinate(1aX45GT) in the heap.

		c1.perimeter1();
		c1.volume3();
		c1.surfaceArea2();
		
		Circle c2 = new Circle(3);
		
		c2.volume3();
		c2.perimeter1();
		c2.surfaceArea2();
//		System.out.println(Circle.myArr[1]);
		// so the above line gives error ,bcoz the array is inside the object and non-
		// static as well .
		// so u either make it static or write it outside the object or in the main
		// method or call it by c1.myArr[1]
		System.out.println(c1.myArr1[1]);

		System.out.println(Circle.myArr2[2]);
		

		Circle.c3.perimeter1();

	}

}
