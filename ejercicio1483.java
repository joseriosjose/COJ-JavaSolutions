import java.util.Scanner;
public class ejercicio1483
{
   public static void main(String []args)
    {
        Scanner lee =new Scanner(System.in);
        int a;
      String op=lee.nextLine();
      String [] aux =op.split(" ");
       if(aux[0].equalsIgnoreCase("rectangle")){
        a=Integer.parseInt(aux[1])*Integer.parseInt(aux[2]);
        System.out.println(a);
        
        }
       else{
        a=Integer.parseInt(aux[1])*Integer.parseInt(aux[1]);
        System.out.println(a);
        
        }
      
      
    }
      
}
