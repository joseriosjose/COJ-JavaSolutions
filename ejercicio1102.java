import java.math.BigInteger;
import java.util.Scanner;
 
public class ejercicio1102 {
    public static void main(String[] args) {
        Scanner Lee = new Scanner(System.in);
         
        BigInteger big = new BigInteger("11");
 
        BigInteger n = new BigInteger(Lee.next());
        while (!n.equals(BigInteger.ZERO)) {
            if (n.mod(big)==BigInteger.ZERO) {
                System.out.println(n + " is a multiple of 11.");
            } else {
                System.out.println(n + " is not a multiple of 11.");
            }
            n = new BigInteger(Lee.next());
        }
        
    } 
}