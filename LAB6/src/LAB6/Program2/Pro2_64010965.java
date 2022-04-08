package LAB6.Program2;

public class Pro2_64010965 {
    public static void main(String[] args) {
        Course course = new Course("OOP");
        course.addStudent("one");
        course.addStudent("two");
        course.addStudent("three");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
           System.out.println("Student " + (i + 1) + " is " + course.getStudents().get(i));
        }
        course.dropStudent("two");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
           System.out.println("Student " + (i + 1) + " is " + course.getStudents().get(i));
        }
        course.clear();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
           System.out.println("Student " + (i + 1) + " is " + course.getStudents().get(i));
        }
    }
}
