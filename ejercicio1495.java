import java.util.Scanner;
import java.util.Arrays;
public class ejercicio1495
{
    public static void main(String []args){
     Scanner lee=new Scanner(System.in);
     int a=lee.nextInt();
     
    int[] aux = new int[a];
    for(int i=0;i<a;i++){
        int b=lee.nextInt();
    aux[i]=b;
    }
    Arrays.sort(aux);
    for(int j=0;j<a;j++){
    System.out.println(aux[j]);
    
    }
   
    }
   
}
