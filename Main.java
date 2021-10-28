
package pkg24jdburks_chapter3_challenge;
  import javax.swing.JOptionPane;
/**
 *
 * @author maconrm180
 */
public class Main {

    
    public static void main(String[] args) {
        
                
                String input1 = (String)JOptionPane.showInputDialog(null,
                "What is your first name?",
                "Name",
                1,
                null,
                null,
                "Name");
                System.out.println("Please enter your first name:");
                System.out.println(input1);
                
                
                
                
                 String input2 = (String)JOptionPane.showInputDialog(null,
                "What is your last name?",
                "Name",
                1,
                null,
                null,
                "Name");
                System.out.println("Please enter your last name:");
                System.out.println(input2);
                
                
                
                String input3 = (String)JOptionPane.showInputDialog(null,
                "What is your age?",
                "Age",
                1,
                null,
                null,
                "Age");
                System.out.println("Please enter your age:");
                System.out.println(input3);
                
                int age = Integer.parseInt(input3);
                
               int input4 = (2021 - age);
               
               System.out.println(input1 + input2 + " your birth year is: " + input4);
               
                String input5 = (String)JOptionPane.showInputDialog(null,
                "Birth year?",
                "year",
                1,
                null,
                null,
                input1 + input2 + " your birth year is: " + input4);
                System.out.println(input1 + input2 + " your birth year is: " + input4);
                System.out.println(input5);
               
               
    }
    
}
