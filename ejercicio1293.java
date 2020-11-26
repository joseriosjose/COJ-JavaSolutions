import java.math.BigInteger;
import java.util.Scanner;
 
public class ejercicio1293
{
     public static void main(String[] args) {
        Scanner Lee = new Scanner(System.in);
         
        BigInteger big = new BigInteger("2");
        int a;
        a=Lee.nextInt();
        if(0<=a && a<=265){
        big= big.pow(a);
        System.out.println(big);
    }
    }
}
