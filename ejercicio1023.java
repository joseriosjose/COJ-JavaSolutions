import java.util.Scanner;
public class ejercicio1023
{
    public static void main (String[] args) {
    Scanner lee= new Scanner (System.in); 
    double sum,prom;
    prom=0;
    sum=0;
    for(int i=1;i<= 12;i++){
    sum=sum+ Double.valueOf(lee.next());
     prom=sum/12;
    }
    
     System.out.println(String.format("$%.2f", prom).replace(',', '.'));
    }
}