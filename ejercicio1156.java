import java.util.Scanner;
public class ejercicio1156
{
     public static void main (String [] args) {
        Scanner lee=new Scanner(System.in);
        int a;
        do{
            a=0;
          a=lee.nextInt();
           if (a==42){
         break;
        } 
        else{
        System.out.println(a);
          }
        
        }while(a!=42);
        
        }
   
}
