import java.util.Scanner;
public class Line
{

    //  Ax + By + C = 0
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Ax double ");
        double integer_1 = scan.nextDouble();
        System.out.print("Enter the By double ");
        double integer_2 = scan.   nextDouble();
        System.out.print("Enter the C double ");
        double integer_3 = scan.nextDouble();
        System.out.println("The Slope is " + integer_1);
        System.out.println("The y-int is " + integer_3);
        System.out.println("The equation is " + integer_1 + "x " + " + " + integer_2 + "y " + integer_3);





    }
}