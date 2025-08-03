package oops;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();// no constructor yet.
		car1.brand = "Mahindra";
		car1.model = "XUV700";
		car1.color = "Black";
		car1.year = 2025;
		car1.speed = 110;

		System.out.println(car1.speed);
		car1.accelerate(10);

	}

}
