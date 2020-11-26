import java.util.Scanner;
public class ejercicio1166
{
    public static void main(String []args)
    {
     int a,b,par=0,impar=0;
     String cad;
     Scanner lee=new Scanner (System.in);
    a=Integer.parseInt(lee.nextLine());
      for(int i=0;i<a;i++){
          
            b=Integer.parseInt(lee.nextLine());
           cad=lee.nextLine();
            String [] aux=cad.split(" ");
                for(int k=0;k<aux.length;k++){
                   
                    if(Integer.parseInt(aux[k])%2==0){
                    par++;
                   }else{
                    impar++;
                    }
            
                }
                System.out.println(par+" even and "+impar+" odd.");
             par=0;
             impar=0;
          }
    }

  }

