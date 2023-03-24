import java.util.Scanner;

/**9. Write a program to convert the upper case to lower case.
 */

public class UppercaseToLowercase {

    public static void main(String[] args) {

        uppercasetolowercase();

    }
    public static void uppercasetolowercase(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string to be converted to lowercase: ");
        String str = s.nextLine();

        str = str.toLowerCase(); // conver string to lowercase
        System.out.println("String convert to Lowercase: " + str);

        s.close();
    }
}
