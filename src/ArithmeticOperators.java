public class ArithmeticOperators
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 6;

        // ADDITION +
        // If one of the operands is a String then String
        // concatenation is performed.
        // If both operands are numeric then addition is
        // performed.
        System.out.println(2 + 3);                // 5
        System.out.println(2.5 + 3);              // 5.5
        System.out.println(x + y);                // 11
        System.out.println(2 + 'A');              // 67
        System.out.println(2 + "hello");          // 2hello
        System.out.println("hello" + 1 + 2);      // hello12
        System.out.println(1 + 2 + "hello");      // 3hello
        System.out.println("hello" + (1 + 2));    // hello3

        // SUBTRACTION -
        System.out.println(3 - 5);                // -2
        System.out.println(3 - 'A');              // -62
        System.out.println('A' - 'B');            // -1

        // MULTIPLICATION *
        System.out.println(3 * 5);                // 15

        // DIVISION /  (BE CAREFUL)
        // If both operands are ints then the quotient
        // will be an int (the decimal part if cut off).
        // If one or both operands is a double then the
        // quotient will be a double.
        System.out.println(9 / 10);               // 0
        System.out.println(9.0 / 10);             // 0.9
        System.out.println(2 / 3.0);              // 0.666666666666666
        System.out.println(65 / 'A');             // 1

        // OTHER COMMANDS

        // MODULUS % (or the remainder operator)
        System.out.println(10 % 3);               // 1
        System.out.println(25 % 5);               // 0
        System.out.println(17 % 6);               // 5
        System.out.println(15340 % 2);            // 0
        System.out.println(15347 % 2);            // 1
        System.out.println(5 % 8);                // 5

        // SQUARE ROOT
        System.out.println(Math.sqrt(9));         // 3.0
        System.out.println(Math.sqrt(2));         // 1.414213562373095
        System.out.println(Math.sqrt(-9));        // NaN (Not a Number)

        // EXPONENTS
        System.out.println(Math.pow(2, 3));       // 8.0
        System.out.println(Math.pow(x, y));       // 15625.0

    }
}