/** Write a Java Program to print as below.
 */

public class PrintReceipt {

    public static void main(String[] args) {
        PrintReceipt obj = new PrintReceipt();
        obj.printreceipt();

    }

    public void printreceipt(){

        System.out.println("\"+------------------------------+\"");
        System.out.println("\"+                              +\"");
        System.out.println("\"+       CORNOR STORE           +\"");
        System.out.println("\"+                              +\"");
        System.out.println("\"+     2015-03-29 04:38         +\"");
        System.out.println("\"+                              +\"");
        System.out.println("\"+     Gallons:   10.870        +\"");
        System.out.println("\"+     Price/gallon: $2.71      +\"");
        System.out.println("\"+                              +\"");
        System.out.println("\"+     Fuel  total: $22.71      +\"");
        System.out.println("\"+------------------------------+\"");
    }
}
