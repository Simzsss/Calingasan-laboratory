public class SchoolTest {
    public static void main(String[] args) {
        
        
        Student student = new Student("Sir Carlo", 1, "12th Grade");
        Teacher teacher = new Teacher("Ms. Kalaw", 2, "Mathematics");
        Staff staff = new Staff("Sir Archie", 3, "OOP");

        
        System.out.println("Student Info:");
        student.displayInfo();
        System.out.println("\nTeacher Info:");
        teacher.displayInfo();
        System.out.println("\nStaff Info:");
        staff.displayInfo();
    }
}
