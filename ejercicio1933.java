
import java.util.Scanner;
public class ejercicio1933
{ 
    public static void main(String[] args){ 
        
        Scanner lee=new Scanner(System.in);
        int a=1,b=1,c;
        while(a!=0&& b!=0){
            
        a=lee.nextInt(); b=lee.nextInt();
             if(a!=0&& b!=0){ 
                 c=a+b;
            System.out.println(c);
        } 
        else { 
          break;  
        } 
        } 
       
    }
}