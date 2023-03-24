import java.util.Scanner;

/** Write a Java program to add two binary numbers. Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */

public class BinaryNumbers {

    public static void main(String[] args) {
        binarynum();

    }

    public static void binarynum(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Binary number: ");
        int num1 = scan.nextInt(2);
        System.out.println("Enter 2nd Binary number: ");
        int num2 = scan.nextInt(2);

        System.out.println("Sum of two Binary numbers: " + Integer.toBinaryString(num1+num2));

        scan.close();
    }
}
