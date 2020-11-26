import java.util.Scanner;
public class ejercicio1493
{
     public static void main(String []args)
    {
        Scanner lee =new Scanner(System.in);
        double a,b;
      String op=lee.nextLine();
      String [] aux =op.split(" ");
       if(aux[0].equalsIgnoreCase("circle")){
        a=Double.parseDouble(aux[1]);
        a=(a*a)*3.14;
        System.out.println(String.format("%.2f",a));
        
        }
      if(aux[0].equalsIgnoreCase("triangle")){
        a=Double.parseDouble(aux[1]);
        b=Double.parseDouble(aux[2]);
        a=(a*b)/2;
        System.out.println(String.format("%.2f",a));
        
        }
        if(aux[0].equalsIgnoreCase("rhombus")){
        a=Double.parseDouble(aux[1]);
        b=Double.parseDouble(aux[2]);
        a=(a*b)/2;
        System.out.println(String.format("%.2f",a));
        
        }
      
      
    }
      
    
}
