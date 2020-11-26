import java.util.Scanner;
public class ejercicio2620
{
   public static void main (String [] args){
     Scanner lee= new Scanner(System.in);
      int radio;
      radio=lee.nextInt();
      radio=radio*4;
      String salida="";
     for(int i=0;i<radio;i++){
        salida +="a";
        }
        System.out.println("A"+salida+"h");
    }
}
