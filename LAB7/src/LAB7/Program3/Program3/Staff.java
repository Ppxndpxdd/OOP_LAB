package LAB7.Program3.Program3;

public class Staff extends Employee{
    // Attributes
    public String title;

    // Constructors
    public Staff() {
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + "Staff{title=" + this.title + "} ";
    }
}
