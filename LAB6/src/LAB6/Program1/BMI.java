package LAB6.Program1;

public class BMI {
    protected String name;
    protected int age;
    protected double weight;
    protected double feet;
    protected double inches;
    
    public BMI(String name, int age, double weight, double feet, double inches) 
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;   
    }
    
    public double getBMI() 
    {
        return (weight * 0.45359237) / (((12 * feet + inches) * 0.0254) * ((12 * feet + inches) * 0.0254));
    }
    public String getInterpretation() 
    {
        if (this.getBMI() < 18.5) 
        {
            return "Underweight";
        }
        else if (this.getBMI() < 25.0) 
        {
            return "Normal";
        } 
        else if (this.getBMI() < 30.0) 
        {
            return "Overweight";
        } 
        else 
        {
            return "Obese";
        }
    }
}
