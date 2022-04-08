package LAB6.Program2;
import java.util.ArrayList;
import java.util.List;

public class Course {
    protected String courseName;
    protected List<String> listStudent = new ArrayList<>();
    protected int numberOfStudents;

    public Course(String courseName) 
    {
        this.courseName = courseName;
    }

    public void addStudent(String student) 
    {
        listStudent.add(student);
    }

    public List<String> getStudents() 
    {
        return listStudent;
    }

    public int getNumberOfStudents() 
    {
        return listStudent.size();
    }

    public String getCourseName() 
    {    
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).equals(student)) {
                listStudent.remove(i);
                return;
            }
        }
        System.out.println("Error::Cannot found this student.");
        return;
    }

    public void clear() {
        listStudent.clear();
    }
}
