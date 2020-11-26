import java.util.Scanner;
public class ejercicio1805
{
  public static void main (String[] args){
     Scanner lee= new Scanner(System.in);
    long a=Long.valueOf(lee.next());
    long b=Long.valueOf(lee.next());
     long r= (a+b) + (a-b) + (b+a) + (b-a);
    System.out.println(r);
    }
}
