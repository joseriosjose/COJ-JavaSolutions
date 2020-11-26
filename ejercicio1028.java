import java.util.Scanner;
public class ejercicio1028
{
    public static void main(String []arg){
    Scanner lee=new Scanner(System.in);
    String pala1,pala2;
    
    for (int k=0;k<=20;k++) {
    int j=0;
    boolean band=false;
    String aux [] = new String [30];
    
    String aux2 [] = new String [30];
    pala1=lee.next(); pala2=lee.next();
    aux =pala1.split("");
    aux2=pala2.split(""); 
    
         for(int i =0;i<pala2.length();i++){
            if(aux[j]==aux2[i]){
                j++;
                
            }
            
            if(j==pala1.length()){
            band =true;
            }
       }
       
     System.out.println(band?"Yes":"No");
   }
 }
}