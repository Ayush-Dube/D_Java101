package foundation;
import java.util.ArrayList;

public class Student {
    // Non-static (instance) variables
    String name;
    int age;
    String branch;

    // Static (class-level) variables
    static String schoolName = "HighClass School";
    static String principal = "Mr. Xavier";

    // ✅ Static list of shared teachers
    static ArrayList<Teacher> teacherList = new ArrayList<>();

    // Constructor
    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Instance method to display student details
    void displayStudent() {
        System.out.println("---- Student Info ----");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Branch   : " + branch);
        System.out.println("School   : " + schoolName);
        System.out.println("Principal: " + principal);
    }

    // ✅ Static Nested Class (Teacher)
    public static class Teacher {
        String name;
        String subject;
        int experience;

        // Constructor
        Teacher(String name, String subject, int experience) {
            this.name = name;
            this.subject = subject;
            this.experience = experience;
        }

        // Method to display teacher details
        void displayTeacher() {
            System.out.println("---- Teacher Info ----");
            System.out.println("Name      : " + name);
            System.out.println("Subject   : " + subject);
            System.out.println("Experience: " + experience + " years");
        }
    }

    // ✅ Non-static Inner Class (Mentor)
    public class Mentor {
        String name;
        int experience;

        // Constructor
        Mentor(String name, int experience) {
            this.name = name;
            this.experience = experience;
        }

        // Method to display mentor info
        void showMentor() {
            System.out.println("---- Mentor Info ----");
            System.out.println("Name        : " + name);
            System.out.println("Experience  : " + experience + " years");
            System.out.println("Assigned to : " + Student.this.name);
            }
        
    
}
}





/*
 *  Level 1
 *  
 *  class Student {
 *  
    // Instance variables (per student)
    String name;
    int age;
    String branch;

    // Static variables (shared by all students)
    static String principal = "Mr. Xavier";
    static String schoolName = "HighClass School";

    // Constructor
    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("Principal: " + principal);
        System.out.println("School: " + schoolName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 16, "Science");
        Student s2 = new Student("Priya", 15, "Commerce");

        s1.display();
        System.out.println("-------------");
        s2.display();
    }
}

 */
/*
  Level 2a
  - Static Nested Class (Independent of Student instance)
  
  class Student {
    String name;
    int age;
    String branch;

    static String principal = "Mr. Xavier";
    static String schoolName = "HighClass School";

    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }

    // ✅ Static Nested Class
    static class Teacher {
        String name;
        String branch;
        int experience;

        Teacher(String name, String branch, int experience) {
            this.name = name;
            this.branch = branch;
            this.experience = experience;
        }

        void showTeacher() {
            System.out.println("Teacher Name: " + name);
            System.out.println("Branch: " + branch);
            System.out.println("Experience: " + experience + " years");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 17, "Science");
        s1.display();

        System.out.println("--- Teacher Info ---");
        Student.Teacher t1 = new Student.Teacher("Mrs. Sharma", "Science", 12);
        t1.showTeacher();
         //no need of s1 object ,directly target the nested Teacher class. 
    }
}

	Level2b
	Non-static Inner Class (Associated with a specific Student)
	
	class Student {
    String name;
    int age;
    String branch;

    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    class Teacher {
        String name;
        int experience;

        Teacher(String name, int experience) {
            this.name = name;
            this.experience = experience;
        }

        void showTeacher() {
            System.out.println("Mentor: " + name);
            System.out.println("Experience: " + experience + " years");
            System.out.println("Assigned to student: " + Student.this.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 16, "Arts");

        // Inner class needs outer class instance
        Student.Teacher mentor = s1.new Teacher("Mr. Rakesh", 10);
        mentor.showTeacher();
        //observe how the s1 object of Outer class is required
    }
} 
  
  
*/
 
/*
  	Level 3
  	
  	 Student with Static Teacher List + Inner Mentor Class
  	 
  	 
  	 
  	 import java.util.ArrayList;

class Student {
    String name;
    int age;
    String branch;

    // Static shared fields
    static String schoolName = "HighClass School";
    static String principal = "Mr. Xavier";

    // ✅ Static list of all teachers
    static ArrayList<Teacher> teacherList = new ArrayList<>();

    // Constructor
    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Method to display student info
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("School: " + schoolName);
        System.out.println("Principal: " + principal);
    }

    // ✅ Static Nested Teacher class (shared teachers)
    static class Teacher {
        String name;
        String subject;
        int experience;

        Teacher(String name, String subject, int experience) {
            this.name = name;
            this.subject = subject;
            this.experience = experience;
        }

        void displayTeacher() {
            System.out.println("Teacher Name: " + name);
            System.out.println("Subject: " + subject);
            System.out.println("Experience: " + experience + " years");
        }
    }

    // ✅ Non-static Inner class (specific mentor)
    class Mentor {
        String name;
        int experience;

        Mentor(String name, int experience) {public class Main {
    public static void main(String[] args) {
        // Add shared school teachers (static)
        Student.teacherList.add(new Student.Teacher("Mrs. Sharma", "Maths", 10));
        Student.teacherList.add(new Student.Teacher("Mr. Verma", "Physics", 12));

        // Create a student
        Student s1 = new Student("Riya", 17, "Science");
        s1.display();

        // Show all shared teachers
        System.out.println("\n--- School Teachers ---");
        for (Student.Teacher t : Student.teacherList) {
            t.displayTeacher();
            System.out.println();
        }

        // Assign a personal mentor to the student
        Student.Mentor mentor = s1.new Mentor("Ms. Meena", 8);
        System.out.println("--- Personal Mentor ---");
        mentor.showMentor();
    }
}

            this.name = name;
            this.experience = experience;
        }

        void showMentor() {
            System.out.println("Mentor Name: " + name);
            System.out.println("Experience: " + experience + " years");
            System.out.println("Assigned to: " + Student.this.name);
        }
    }
}


 
 */
 