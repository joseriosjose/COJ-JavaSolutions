import java.util.*;
import java.math.*;

public class ejercico1600 {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		BigInteger N = new BigInteger("0");
		BigInteger M = new BigInteger("0");
		
		while(true)
		{
			N = in.nextBigInteger();
			M = in.nextBigInteger();
			
			if(N.equals(BigInteger.ZERO) && M.equals(BigInteger.ZERO)) 
			{
			    break;
			}			
			N = N.modPow(M, BigInteger.TEN);
			System.out.println(N);
		}				
	}
}