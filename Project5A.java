/* Jasvant Singh Dosanjh
    An application for the School Lunch Program Monthly Report
    A report that surveys the costs of luncheon main dishes at various public schools within the country.*/
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Project5A
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);
    
      //variable declarations
         String name = "";
         int numItems = 0;
         double avgCost = 0.0;
         double total = 0.0;
         double amount;
       
      name = JOptionPane.showInputDialog( "Enter lunch name: Burger, Hotdog, Pizza, Grilled Cheese");
       
         System.out.println(
             "Please enter all costs for the luncheon " + name + 
             " separated by white space, terminated with a -1");
         amount  = keyboard.nextDouble();
       
      while (amount >=0)
      {
         total += amount;
         numItems++;
         amount = keyboard.nextDouble();
      }
              
      avgCost = total / numItems;
       
         System.out.printf(
              "%-8s : Total Surveyed: %d   Total Collected: $%5.2f   Average Cost: $%5.2f",
               name, numItems, total, avgCost);
       
         JOptionPane.showMessageDialog(null,
                name + ": Total Surveyed: " + numItems + " lunches\n" +
               "The final total amount collected is: " + dollar.format(total) +
               "\nThe final average lunch cost is: " + dollar.format(avgCost));
 }   
}     