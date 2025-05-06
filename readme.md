### Static vs Non-Static

 <details>
    <summary>this key word</summary>     
         
         👉 public class Example {
            String name = "Instance Variable";

              public static void main(String[] args) {
              System.out.println(this.name); // ❌ Error: Cannot use 'this' in a static context
              }
            }


        🔻 public class Example {
                 String name = "Instance Variable";

                public static void main(String[] args) {
                    Example obj = new Example(); // Creating an instance
                    System.out.println(obj.name); // ✅ Accessing instance variable via object
                }
            }



        🔻Conclusion
                ✅ You can use this in instance methods.

                ❌ You cannot use this in main or any other static method.

                ✅ To access instance variables/methods in main, create an object.

     
     
-  When to use 


        👇
        public class Person {
            String name;  // Instance variable

            public void setName(String name) { // Local variable
                name = name;  // ❌ This does nothing (local variable takes precedence)
            }

            public void printName() {
                System.out.println(name);
            }

            public static void main(String[] args) {
                Person p = new Person();
                p.setName("Alice");
                p.printName();  // Output: null (instance variable was not set)
            }
        }


-  proper way 

            👇
            public class Person {
                    String name;  // Instance variable

                    public void setName(String name) { // Local variable
                        this.name = name;  // ✅ Assigns local variable to instance variable
                    }

                    public void printName() {
                        System.out.println(name);
                    }

                    public static void main(String[] args) {
                        Person p = new Person();
                        p.setName("Alice");
                        p.printName();  // Output: Alice
                    }
                }


- 
    
    
 </details>


 ### ⚡Constructor
 
- here  
   
         code
         public class MyConstructor {
            String gadget;
            String model;
            int price;

            // Default Constructor
            public MyConstructor() {
                this("Unknown Gadget", "Unknown Model", 0); // Calls the parameterized constructor
                System.out.println("Default constructor called.");
            }

            // Parameterized Constructor
            public MyConstructor(String gadget, String model, int price) {
                this.gadget = gadget;
                this.model = model;
                this.price = price;
                System.out.printf("Parameterized constructor called: %s, %s, %d\n", this.gadget, this.model, this.price);
            }

            // Copy Constructor
            public MyConstructor(MyConstructor xyzObj) {
                this(xyzObj.gadget, xyzObj.model, xyzObj.price); // Calls the parameterized constructor
                System.out.println("Copy constructor called.");
            }

            public static void main(String[] args) {
                // Default Constructor
                MyConstructor obj1 = new MyConstructor();

                // Parameterized Constructor
                MyConstructor obj2 = new MyConstructor("Laptop", "HP", 68000);

                // Copy Constructor
                MyConstructor obj3 = new MyConstructor(obj2);

                // Display copied object details
                System.out.printf("Copied gadget: %s, model: %s, price: %d\n", obj3.gadget, obj3.model, obj3.price);
            }
        }


#### Default Constructor:

  -  Calls the parameterized constructor using this("Unknown Gadget", "Unknown Model", 0).
    This ensures that the default constructor initializes the object with default values.
    Parameterized Constructor:

  - Initializes the object with the provided values for gadget, model, and price.
    Copy Constructor:

  -   Calls the parameterized constructor using this(xyzObj.gadget, xyzObj.model, xyzObj.price).
    This avoids duplicating the initialization logic and ensures consistency.   
       

---
    Parameterized constructor called: Unknown Gadget, Unknown Model, 0
    Default constructor called.
    Parameterized constructor called: Laptop, HP, 68000
    Copy constructor called.
    Copied gadget: Laptop, model: HP, price: 68000  

---
- If constructor chaining is implemented incorrectly, it can lead to infinite recursion, causing a `StackOverflowError`. This happens when constructors keep calling each other in a circular manner without a proper termination point.


### tryCatch    
    
    - package lab2;

    public class ExceptionHandling1 {

        public static void main(String[] args) {
            
            
            System.out.println("This is before division");
            
            
            
            
            try {
                int dividebyZero = 50/0;
                
                System.out.println(dividebyZero);
            }
            
            catch(Exception e){
                System.out.println("Airthmeticexception: "+e.getMessage());
            }
            
            finally {
                System.out.println("try and catch block ran succesfully");
            }

        }

    }


### may6

    - 
            interface MyInterface {
            int VALUE = 10;  // public static final by default
            void display();
        }

        class MyClass implements MyInterface {
            public void display() {
                System.out.println("Displaying...");
            }
        }

        public class Main {
            public static void main(String[] args) {
                // Accessing constant
                System.out.println(MyInterface.VALUE);  // ✅ no instantiation needed

                // Using implementing class
                MyInterface obj = new MyClass();  // ✅ polymorphic reference, no interface instantiation
                obj.display();

                // MyInterface obj2 = new MyInterface();  // ❌ ERROR: can't instantiate interface directly
            }
        }
