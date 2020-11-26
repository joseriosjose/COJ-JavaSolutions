import java.util.Scanner;
import java.util.Arrays;
public class ejercicio3140
{
    public static void main(String []args)
    {
      int a;
     Scanner lee=new Scanner (System.in);
     a=lee.nextInt();
     int [] numeros =new int [a];
     for(int i=0;i<a;i++){
        numeros [i]=lee.nextInt();
        }
     Arrays.sort(numeros);
     for(int j=0;j<a;j++){
        System.out.println(numeros [j]);
        }
    }
}
