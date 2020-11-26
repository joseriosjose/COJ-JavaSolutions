import java.util.Scanner;
public class ejercicico2785
{
   
    public static void main(String []args)
    {
      int a,b;
      double c=0;
     Scanner lee=new Scanner (System.in);
     a=lee.nextInt();
     for(int i =0;i<a;i++){
        b=lee.nextInt();
        c=c+b;
        }
        c=c/a;
        
        System.out.println(String.format("%.2f", c).replace(',', '.'));
    }
}
