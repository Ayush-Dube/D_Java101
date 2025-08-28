package polymorphism;

public class Ypoly {
	// Inner classes bnane ki vjh se problem occured.

	public static class Animal {

		void animalMethod() {
			System.out.println("Hi! from Animal class...");
		}

		void makeSound() {
			System.out.println("Grr...Grr...");
		}
	}

	public static class Dog extends Animal {

		void dogMethod() {
			System.out.println("Hi! from Dog class...");
		}

		void makeSound() {
			System.out.println("Woof...Woof...");
		}

	}

	public static class Cat extends Animal {

		void catMethod() {
			System.out.println("Hi! from Cat class...");
		}

		void makeSound() {
			System.out.println("Meow...Meow...");
		}
	}

	// more classes in future that will inherit from animal class...

	public static void main(String[] args) {

//		Ypoly yp = new Ypoly();

		Animal a = new Animal();
		Dog b = new Dog();
		Cat c = new Cat();

		// Inheritance
		a.animalMethod();
		b.animalMethod();
		c.animalMethod();

		System.out.println("---------");

		// Polymorphism
		a.makeSound();
		b.makeSound();
		c.makeSound();
		// same method name is behaving differently , depending on the object type.

		System.out.println("---------");
		// Polymorphic Variable
		Animal x; // <--polymorphic variable

		// use x as a Dog
		x = new Dog();
//		x.dogMethod();//The method dogMethod() is undefined for the type Ypoly.Animal
		x.makeSound();

		// now use x as Cat
		x = new Cat();
		x.makeSound();

		// so the use of x ,some time as a dog and some time as a Cat is acheived by
		// polymorphic variable.

		System.out.println("---------");

		// Runtime-polymorphism, based on method override.
		Animal q = new Dog();
		// even though it may seem like x can run methods of Dog class ,but it can not.
//		x.dogMethod();

		q.makeSound();
		// Why can't it run dogMethod,is because, at compile time ,compiler will look
		// for dogMethod in Animal class
		// and since it is not there , error occurs.

		// So if u had to run "Woof Woof" , why did u even write Animal x = new Dog();
		// just directly write Dog x = new Dog();
		//because u never know what kind of object u may get in return.
		//so u put a Super class -->Animal ,which is parent to all future child class.
		//and can handle any child as Return type.

	}

}
