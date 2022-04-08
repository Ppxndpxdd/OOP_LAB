import java.util.Scanner; 
public class Pro4_64010965 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String cityName1 = input.nextLine(); //input string
        char first = cityName1.charAt(0);

        System.out.print("Enter the second city: ");
        String cityName2 = input.nextLine();
        char second = cityName2.charAt(0);

        System.out.print("Enter the third city: ");
        String cityName3 = input.nextLine();
        char third = cityName3.charAt(0);

        System.out.print("The three cities in alphabetical order are ");
        if((first<second)&&(first<third))
        {
            if(second<third)
            {
                System.out.printf("%s %s %s",cityName1,cityName2,cityName3);
            }
            else
            {
                System.out.printf("%s %s %s",cityName1,cityName3,cityName2);
            }
        }
        else if((second<first)&&(second<third))
        {
            if(first<third)
            {
                System.out.printf("%s %s %s",cityName2,cityName1,cityName3);
            }
            else
            {
                System.out.printf("%s %s %s",cityName2,cityName3,cityName1);
            }
        }
        else
        {
            if(first<second)
            {
                System.out.printf("%s %s %s",cityName3,cityName1,cityName2);
            }
            else
            {
                System.out.printf("%s %s %s",cityName3,cityName2,cityName1);
            }
        }
        input.close();
    }
}

