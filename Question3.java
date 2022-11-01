import java.util.Scanner;
public class Question3 {
    public static void main(String args[])
        {
            System.out.println("Enter two numbers");
            Scanner numbers = new Scanner(System.in);
            int first = numbers.nextInt();
            int second = numbers.nextInt();
            System.out.println("Numbers you entered: "+first +" "+ second);

            first = first + second;
            second = first - second;
            first = first - second;
            System.out.println("Your numbers swapped: "+first +"  " + second);
        }
    }

