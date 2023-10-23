import java.util.Scanner;
public class Geometry
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x1 double ");
        double integer_1 = scan.nextDouble();
        System.out.print("Enter the x2 double ");
        double integer_2 = scan.   nextDouble();
        System.out.print("Enter the y1 double ");
        double integer_3 = scan.nextDouble();
        System.out.print("Enter y2 double ");
        double integer_4 = scan.nextDouble();
        System.out.println(("The slope is  " + ((integer_4 - integer_3) / (integer_2 - integer_1))));
        System.out.print("The midpoint is " + (integer_1 + integer_2)/2.0);
        System.out.println(" " + (integer_3 + integer_4)/2.0);
        double length_before_sqrt_x = Math.pow((integer_1 - integer_2), 2.0);
        double length_before_sqrt_y = Math.pow((integer_3 - integer_4), 2.0);
        double length_before_sqrt = (length_before_sqrt_x + length_before_sqrt_y);
        double length = Math.sqrt(length_before_sqrt);
        System.out.println("Your length is " + length);




    }
}