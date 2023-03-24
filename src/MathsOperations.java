import java.util.Scanner;

/** Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data: Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */


public class MathsOperations {

    public void operation(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = scan.nextInt();
        System.out.println("");

        scan.close();

        // just for practice Variable defined for *,/,%
        int x = num1 * num2;
        int y = num1 / num2;
        int z = num1 % num2;

        System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction of " + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + x);
        System.out.println("Division of " + num1 + " / " + num2 + " = " + y);
        System.out.println("Remainder of " + num1 + " % " + num2 + " = " + z);
    }

    public static void main(String[] args) {
        MathsOperations obj = new MathsOperations(); // object to call instance method
        obj.operation();
    }

}
