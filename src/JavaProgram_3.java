/**Write a Java programme using the following steps.
 *  3.1 Declare one instance and one static variable.
 *  3.2 Declare one instance method.
 *  3.3 Declare one static method.
 *  3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 *  3.5 Declare the Main method.
 *  3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class JavaProgram_3 {

    int x = 25;

    static int y = 5;

    public static void main(String[] args) {
        JavaProgram_3 obj = new JavaProgram_3();
        obj.instance();
        declare();

    }

    public void instance(){
        JavaProgram_3 obj1 = new JavaProgram_3();
        System.out.println(obj1.y);
        System.out.println(x);

    }
    public static void declare(){
        System.out.println(y);
        JavaProgram_3 obj2 = new JavaProgram_3();
        System.out.println(obj2.x);
    }

}
