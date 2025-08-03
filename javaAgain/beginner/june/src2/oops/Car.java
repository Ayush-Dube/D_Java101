package oops;

public class Car {
	String color;
	String brand;
	String model;
	int year;
	int speed;
	// all above variables are non-static ,therfore will be stored in heap.

	public void accelerate(int inc) {// non-static,instance method
		this.speed = this.speed + inc;
		System.out.printf("Now the speed of %s %s is ...%d kmph", this.brand, this.model, this.speed);
	}
	//this keyword instance level ke members ke leye lagta hai.
	//if u wish u can skip using this keyword if static members are absent ,but using "this" is market practice. 

}
