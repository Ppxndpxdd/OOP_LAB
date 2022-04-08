package LAB7.Program3.Program3;
import java.time.LocalDate;
import java.time.Month;
public class Pro3_64010965 {
    public static void main(String[] args) {

        // Student
        System.out.println("Student");
        Student student = new Student();
        student.name = "Somsak";
        student.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        student.phoneNumber = "012-345-6789";
        student.emailAddress = "somsak@mymail.com";

        System.out.println("Name : " + student.name);
        System.out.println("Address : " + student.address);
        System.out.println("Phone : " + student.phoneNumber);
        System.out.println("Email : " + student.emailAddress);
        System.out.println(student.toString());
        System.out.println();

        // Employee
        System.out.println("Employee");
        Employee employee = new Employee();
        employee.name = "Somsak";
        employee.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        employee.phoneNumber = "012-345-6789";
        employee.emailAddress = "somsak@mymail.com";
        employee.office = "KMITL";
        employee.salary = 20000;
        employee.dateHired = LocalDate.of(1998, Month.FEBRUARY, 21);

        System.out.println("Name : " + employee.name);
        System.out.println("Address : " + employee.address);
        System.out.println("Phone : " + employee.phoneNumber);
        System.out.println("Email : " + employee.emailAddress);
        System.out.println(employee.toString());
        System.out.println();

        // Faculty
        System.out.println("Faculty");
        Faculty faculty = new Faculty();
        faculty.name = "Somsak";
        faculty.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        faculty.phoneNumber = "012-345-6789";
        faculty.emailAddress = "somsak@mymail.com";
        faculty.office = "KMITL";
        faculty.salary = 20000;
        faculty.dateHired = LocalDate.of(1998, Month.FEBRUARY, 21);
        faculty.officeHours = 8;
        faculty.rank = "officer";

        System.out.println("Name : " + faculty.name);
        System.out.println("Address : " + faculty.address);
        System.out.println("Phone : " + faculty.phoneNumber);
        System.out.println("Email : " + faculty.emailAddress);
        System.out.println(faculty.toString());
        System.out.println();

        //Staff
        System.out.println("Staff");
        Staff staff = new Staff();
        staff.name = "Somsak";
        staff.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        staff.phoneNumber = "012-345-6789";
        staff.emailAddress = "somsak@mymail.com";
        staff.office = "KMITL";
        staff.salary = 20000;
        staff.dateHired = LocalDate.of(1998, Month.FEBRUARY, 21);
        staff.title = "Title";

        System.out.println("Name : " + staff.name);
        System.out.println("Address : " + staff.address);
        System.out.println("Phone : " + staff.phoneNumber);
        System.out.println("Email : " + staff.emailAddress);
        System.out.println(staff.toString());
        System.out.println();
    }
}
