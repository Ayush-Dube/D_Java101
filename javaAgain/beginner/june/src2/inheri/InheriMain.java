package inheri;

public class InheriMain {

	public static void main(String[] args) {

		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Cat();

		a.makeNoise();
		b.makeNoise();
		c.makeNoise();

		// but observer
		// b is made using Dog(),but u can not use method of Dog class.
		// it is bcoz, the Return DataType is Animal.

//		b.dogMethod();

		// but if u had used Dog return DataType and also 'extends' Animal class in Dog
		// class,
		// then u can use method of both the classes.

		Dog b1 = new Dog();
		System.out.println(b1.name);
		b1.makeNoise();
		b1.attack();
		b1.dogMethod();

	}

}
