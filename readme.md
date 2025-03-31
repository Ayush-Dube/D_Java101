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