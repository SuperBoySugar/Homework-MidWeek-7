/** Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 *  1.4 Declare the Main method.
 *  1.5 Call the above instance method into the Main method and Run the program
 */

 public class JavaProgram_1 {

     int a = 10;

     int b = 20;

     public static void main(String[] args) {
         JavaProgram_1 obj1 = new JavaProgram_1();
         obj1.instance();

         }
         public void instance(){

             System.out.println(a);
             System.out.println(b);
     }


}
