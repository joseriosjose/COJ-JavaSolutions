
import java.util.Scanner;
public class ejercicio2799 {
  
   public static void main(String[] args) {
      
       Scanner lector = new Scanner(System.in);
       int l1,l2,l3;
       l1 = lector.nextInt();
       l2 = lector.nextInt();
       l3 = lector.nextInt();
       if (l1==l2 && l2==l3)
               System.out.println("Equilateral");
               else
               {
                       if (l1==l2 || l1==l3 || l2==l3)
                               System.out.println("Isosceles");
                               else
                               {
                                       if (l1!=l2 || l1!=l3 || l3!=l2)
                                               System.out.println("Scalene");
                                               else {
                                                
                                               System.out.println("Error");
                                                }
                               }
               }
   }
  
}