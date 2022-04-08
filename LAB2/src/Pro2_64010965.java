import java.util.Random;
import java.util.Scanner;

public class Pro2_64010965 {
    public static void main(String[] args) {
        String[] item = { "scissor", "rock", "paper" };

        Random rand = new Random();
        int randNum = rand.nextInt(2)+1;

        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner playerInput = new Scanner(System.in);
        int playerSRP = playerInput.nextInt();
        
        if(((playerSRP==0)&&(randNum==2))||(playerSRP==1)&&(randNum==0)||((playerSRP==2)&&(randNum==1)))
        {
            System.out.printf("The computer is %s. You are %s. You won",item[randNum],item[playerSRP]);
        }
        else if(((playerSRP==0)&&(randNum==0))||((playerSRP==1)&&(randNum==1))||((playerSRP==2)&&(randNum==2)))
        {
            System.out.printf("The computer is %s. You are %s too. It is a draw",item[randNum],item[playerSRP]);
        }
        else
        {
            System.out.printf("The computer is %s. You are %s too.  ",item[randNum],item[playerSRP]);
        }
        playerInput.close();
    }
}
