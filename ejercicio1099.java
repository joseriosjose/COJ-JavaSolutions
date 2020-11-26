import java.util.Scanner;
import java.util.Arrays;
public class ejercicio1099
{
    public static void main (String [] args) {
        Scanner lee=new Scanner(System.in);
     int[] aux = new int[3];
     do {
     aux[0]=lee.nextInt();
     if (aux[0]==0){
         break;
        }
     aux[1]=lee.nextInt();
     aux[2]=lee.nextInt();
    Arrays.sort(aux);
    if(((aux[0]*aux[0])+(aux[1]*aux[1]))==(aux[2]*aux[2])){
     System.out.println("right");
    
    } 
    else{
    System.out.println("wrong");
    } 
    }while(aux[0]!=0);
}
   
}
