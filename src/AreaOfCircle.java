import java.util.Scanner;

/**6. Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class AreaOfCircle {

    public static void main(String[] args) {

        AreaOfCircle obj = new AreaOfCircle(); // object created to call Instance method
        obj.areaOfCircle();
    }

    public void areaOfCircle(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = s.nextDouble();
        double area = (22 * r * r)/7;
        System.out.println("Area of Circle is: " + area);
        Scanner close;
    }
}
