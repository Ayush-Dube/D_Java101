public class MyConstructor {

    //in vsCode.
    // zen mode 
    //fullscreen f11
    //co pilot chat ctrl+atl+i
    //zoom in  ctrl = ,ctrl -
    //alt N to run code ,but if input is to be taken this does not work .
    //ls|findstr -i "My"

    //use java file.java for direct running of code 

    //public MyConstructor(){ // 1.always public,except for singletonClass  2. no return type
    
    /*
    when an object is created using the  keyword "new" ,the constructor is automatically called to set initial values for the object's attribute or perfform any setup required.

    Constructor Overloading

    Default Constructor 
    if no constructor is defined, Java provides a default constructor which initializes default values  
    0 for int;
    false for booleans
    null for objects

    */

    public MyConstructor() {
        // System.out.println("a object was created \n test1 \n test2 \n test3");
    }

    String gadget;
    String model;
    int price;

    //parameterized Constructor:
    public MyConstructor(String gadget,String model,int price) {//do declare Constructor parameters type as well.
        this.gadget = gadget;
        this.model = model;
        this.price = price;
        System.out.printf("this %s , %s is priced at %d rupees.\n",this.model,this.gadget,this.price);
    }

    //Copy Constructor
    /*
        A copy constructor is a constructor that creates a new object as a copy of an existing object. It takes an object of the same class as a parameter and copies its attributes.
        
    
     */  
    public MyConstructor(MyConstructor xyzObj) {//recall int x;
        this.gadget = xyzObj.gadget;
        this.model = xyzObj.model;
        this.price = xyzObj.price;
        //at this point the xyzObject was already createdd outside and its values were use by this constructor to set the global values again 
        //therefore u will see that instead of using variables directlty we use this.model,this.brand,this.price

        /*
            The difference lies in how the variables are accessed and the context in which they are used. Let me explain why the this keyword is used in the copy constructor but not in the parameterized constructor.
        */ 
        System.out.println("A copy of object waas created.");
        System.out.printf("Copied gadget: %s,brand: %s ,cost: %d %n", this.gadget, this.model, this.price);

    }


    public static void main(String[] args) {

        MyConstructor aobj = new MyConstructor();
        MyConstructor aobj1 = new MyConstructor("laptop","hp",68000);
        // MyConstructor copiedObj = new MyConstructor(MyConstructor aobj1);
        // pass the object reference aobj1 directly, not redeclare its type. 
        /*
            add(int x, int y){return x+y}
            but when u actually use methods u directly use add(2,3),
            not add(int 2, int 3)
        */
        MyConstructor copiedObj = new MyConstructor(aobj1);
        System.out.println(copiedObj.gadget);
        System.out.println(copiedObj.model);
        System.out.println(copiedObj.price);

        copiedObj.gadget = "camera";
        copiedObj.model = "nikon-D1200";
        copiedObj.price = 88000;

        System.out.printf("gadget: %s\nmodel: %s\nprice: %d \n", copiedObj.gadget, copiedObj.model , copiedObj.price);


    }    
}

/*
    Why Use Constructors?
    To ensure that objects are always initialized properly.
    To provide flexibility in object creation (via overloading).
    To encapsulate setup logic for objects.


    Constructor Overloading Ka Matlab:
    Constructor overloading ka matlab hai ek hi class mein multiple constructors define karna, lekin unka parameter list alag hona chahiye. Java runtime pe decide karta hai ki kaunsa constructor call karna hai, based on the arguments provided.
*/


/*
    Constructor Chaining
     Using constructor chaining, you can call multiple constructors in one go without explicitly creating separate objects for each constructor. This is achieved by calling one constructor from another using the this() keyword (for the same class) or super() (for the parent class).

    If constructor chaining is implemented incorrectly, it can lead to infinite recursion, causing a StackOverflowError. This happens when constructors keep calling each other in a circular manner without a proper termination point(base case).


    """
    
    """
    

*/