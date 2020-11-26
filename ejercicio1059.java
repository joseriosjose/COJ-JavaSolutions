import java.util.Scanner;
public class ejercicio1059
{
    public static void main (String [] args){
    Scanner lee=new Scanner (System.in);
    int numero;
    do{
     numero=lee.nextInt();
    if(numero!=0){
        String binario=Integer.toBinaryString(numero);
        int unos=0;
        for (int i=0;i<binario.length();i++){
          if(binario.charAt(i)=='1'){
           
              unos++;
            
            }
        }
      System.out.println("The parity of "+binario+" is "+unos+" (mod 2).");
    }
     }while(numero!=0);
    }
}
