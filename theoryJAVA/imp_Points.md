### mar30 
- `shift + right` click to open menu to select terminal  
- environmental variables , from bin folder 
- in eclipse `ctrl+alt+T` opens a terminal


### apr13
-  Why can’t you declare a method inside main() in Java?
    - Java is a statically-typed, block-structured, class-based language.
    - Methods are members of a class — not of other methods.
    - A method definition must exist at the class level, not nested inside another method. 

            void sayHello() {
                System.out.println("Hello!");
            }

    - defining a method.👆
    - But in Java:   
      You can call methods inside methods.  
     ` You cannot declare methods inside methods — because Java's syntax and memory model are not designed to handle nested method scopes.`

     - if you try it, u would get `error: illegal start of expression`
- Why?  
    - Because the Java compiler only expects statements (like int x = 5;, sayHello();, if(...) {...} etc.) inside a method.  
    - A method definition is not a statement — it belongs to the class body, not inside a method body.

    -correct apporoach  
     
        public class Main {
            public static void main(String[] args) {
                sayHello();
            }

            static void sayHello() {
                System.out.println("Hello!");
            }
        }

- 
    What you wanted	Java equivalent   
    Method inside main--------------------- ❌ Not allowed  
    Anonymous class inside main------------ ✅ Yes  
    Lambda inside main (Java 8+)----------- ✅ Yes
---
- ⚙️ But other languages allow this…  
    Yes!  
    Languages like Python and JavaScript allow function definitions inside functions because:  

    Their runtime environments are more dynamic.  

    Functions are first-class citizens (they can be created, passed, and returned like any other value).

    Their scoping and memory models are built to support this.
    
    📝  

        def main():
            def say_hello():
                print("Hello!")
            say_hello()
        
        main()
---


### ⚡apr14

✅ What is Method Overloading?  
Method Overloading ek aisa feature hai jisme ek hi naam ke multiple methods banaye jaate hain, lekin:  

- Unke parameters ka number alag hota hai

- Ya parameters ka type alag hota hai

- Ya dono alag hote hain  

   → Same method name, different method signatures.  
---

✅ Rules of Method Overloading
Method ka naam same hoga

- Parameters alag honge

- Number of parameters alag

- Ya type alag

- Ya dono alag

- Return type ka koi lena dena nahi hota    

📌 Return type change karne se method overloading nahi hoti
Agar sirf return type badla, to error aayega  

- Java compile time pe decide karta hai ki kaunsa method call hoga — isliye isse Compile-time Polymorphism bhi bolte hain.

---

✅ Practical Real-World Use Cases  
Situation -----------------------------Method Overloading Example  
Calculator app----------------------- add(int, int), add(double, double), add(int, int, int)  
Logging or Message formatting-----log(String msg), log(String msg, int errorCode)    
Banking application------------------(withdraw)	withdraw(int amount), withdraw(double amount)  
Drawing shapes----------------------draw(int radius), draw(int length, int breadth)  
File saving ---------------------------save(String path), save(String path, boolean overwrite)  

---


### ⚡apr20

#### I encounter some issue in running the access modifier code, have a proper folder structure for packages and make sure to complie eveything using wildcard.  
- ` javac building1\*.java building2\*.java`
    - declare package building1;
    - declare package building2;
    - then complie eveything , in order to work properly



---
![alt text](image.png)

---
![alt text](image-1.png)

---
![alt text](image-2.png)

---
![alt text](image-3.png)