import java.util.Scanner;
import java.math.BigInteger;

public class ejercicio2904 {
	
	public static void main(String args[]){

		Scanner lee = new Scanner(System.in);
		int a;		
		BigInteger suma = new BigInteger("0");		
		BigInteger aux = new BigInteger("0");		

		a = lee.nextInt();
		for(int i = 0; i < a; i++){
			aux = lee.nextBigInteger();
			suma = suma.add(aux);
		}
		System.out.println(suma);
	}
}
