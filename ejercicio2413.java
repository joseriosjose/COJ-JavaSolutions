import java.math.BigInteger;
import java.util.Scanner;
 
public class ejercicio2413{
    public static void main(String[] args) {
        Scanner Lee = new Scanner(System.in);
         
        BigInteger big = new BigInteger("5");
         int rep;
         rep=Lee.nextInt();
         if(1<=rep && rep<=100){
        for (int i=0;i<rep;i++) {
            
           BigInteger n = new BigInteger(Lee.next());
            if (n.mod(big)==BigInteger.ZERO) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    }
}
