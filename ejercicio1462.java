import java.math.BigInteger;
import java.util.Scanner;

public class ejercicio1462
{
     public static void main(String[] args) {
        Scanner Lee = new Scanner(System.in);
         
        BigInteger sum = new BigInteger("0");
         int rep;
         rep=Lee.nextInt();
         if(1<=rep && rep<=1000){
        for (int i=0;i<rep;i++) {
            
           BigInteger n = new BigInteger(Lee.next());
            sum=sum.add(n);
        }
        System.out.println(sum);
    }
}
}
