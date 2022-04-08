import java.util.Scanner;

public class Pro1_64010965 {
    public static void main(String[] args) {
        String[] dayOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner inputDay = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        int currentDay = inputDay.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int numOfDay = inputDay.nextInt();
        
        if (numOfDay > 7) {
            numOfDay = numOfDay % 7;
        }
        int futureDay = currentDay + numOfDay;
        
        System.out.printf("Today is %s and the future day is %s",dayOfWeek[currentDay],dayOfWeek[futureDay]);
        inputDay.close();
        
    }
}
