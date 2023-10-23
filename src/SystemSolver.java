import java.util.Scanner;
public class SystemSolver
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the A double ");
        double integer_1 = scan.nextDouble();
        System.out.print("Enter the B double ");
        double integer_2 = scan.nextDouble();
        System.out.print("Enter the C double ");
        double integer_3 = scan.nextDouble();
        System.out.print("Enter D double ");
        double integer_4 = scan.nextDouble();
        System.out.print("Enter the E double ");
        double integer_5 = scan.nextDouble();
        System.out.print("Enter the F double ");
        double integer_6 = scan.nextDouble();

        double value_x = (integer_6 * integer_2 - integer_3 * integer_5) / (integer_1 * integer_5 - integer_4 * integer_2);
        double value_y = (integer_1 * integer_6 - integer_3 * integer_4) / (integer_2 * integer_4 - integer_1 *integer_5);

        System.out.println("X is equal to " + value_x);
        System.out.println("Y is equal to " + value_y);



    }
}
