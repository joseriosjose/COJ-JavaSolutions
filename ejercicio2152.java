import java.util.Scanner;
public class ejercicio2152
{
      public static void main(String[] args){ 
    Scanner lee=new Scanner(System.in);
    int a =lee.nextInt();
    if(1<=a && a<=1000){
    for(int i=0;i<a;i++){
        
       String num=String.valueOf(lee.nextInt());
       int suma=0;
      for(int j=0;j<num.length();j++){
       int c=Integer.parseInt(Character.toString(num.charAt(j)));
      
       suma+=c;
      }
      System.out.println(suma);
    }
   }
}
}
