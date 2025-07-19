package foundation;

public class FoundationMain {

	public static void main(String[] args) {
		
		 // ✅ Step 1: Add shared teachers to the static teacher list
        Student.teacherList.add(new Student.Teacher("Mrs. Sharma", "Maths", 10));
        Student.teacherList.add(new Student.Teacher("Mr. Verma", "Physics", 12));

        // ✅ Step 2: Create a student
        Student s1 = new Student("Riya", 17, "Science");

        // ✅ Step 3: Display student info
        s1.displayStudent();

        // ✅ Step 4: Display all school teachers
        System.out.println("\n--- All School Teachers ---");
        for (Student.Teacher t : Student.teacherList) {
            t.displayTeacher();
            System.out.println();
        }

        // ✅ Step 5: Assign and display mentor for the student
        Student.Mentor mentor = s1.new Mentor("Ms. Meena", 8);
        System.out.println("--- Personal Mentor ---");
        mentor.showMentor();
		

	}

}
