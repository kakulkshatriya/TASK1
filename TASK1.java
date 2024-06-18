import java.util.Scanner;
public class TASK1

{
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 1+ (int)(100 * Math.random());
        int c = 7; // c= choices
        int i , g;
        System.out.println(" choose the no. between 1 to 100");
        System.out.println("guess the no. in 7 trials");
        for (i=0; i<c; i++) 
        {
            System.out.println("guess the no.");
            g = sc.nextInt();
            if(num == g)
            {
                System.out.println("you guess the no. ");
                break;
            }
            else if(num > g && i !=c-1)
            {
                System.out.println("the no. is greater than " + g);

            }
            else if(num < g && i !=c-1)
            {
                System.out.println("the no. is smaller than " + g);

            }
        }
        if(i == c)
        {
            System.out.println("you have exausted " + c + "trials");
            System.out.println("the no. was " + num);
            System.out.println("play again\n better luck next time");
        }

    }
}