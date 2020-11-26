import java.util.Scanner;
public class ejercicio2185
{
        
    public static void main(String []args)
    {
      int a,b,c;
     Scanner lee=new Scanner (System.in);
     a=lee.nextInt(); b=lee.nextInt();
     if( 1 <= a && b <= 50){
     c=a+b;
     System.out.println(c);
     c=a-b;
     System.out.println(c);
     c=a*b;
     System.out.println(c);
     c=a/b;
     System.out.println(c);
     c=a%b;
     System.out.println(c);
    }
  
  }
}
