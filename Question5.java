import java.util.Scanner;
public class Question5
{
    public static void main(String[] args)
    {
        double radius;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle to get the area: ");
        radius = sc.nextDouble();
        area = pi * radius * radius;
        System.out.println("Area of the circle is: "+area);
    }
}
