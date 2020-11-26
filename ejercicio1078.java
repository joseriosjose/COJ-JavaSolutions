import java.util.Scanner;
public class ejercicio1078
{
    public static void main(String []args)
    {
     int casos,ninos,suma=0;
     
     Scanner lee=new Scanner (System.in);
    casos=Integer.parseInt(lee.nextLine());
    System.out.println();
      for(int i=0;i<casos;i++){
            
            ninos=lee.nextInt();
            
             int [] caramelos =new int[ninos];
            for(int j=0;j<ninos;j++){
                int c=lee.nextInt();
                caramelos[j]=c;
                suma=suma+caramelos[j];
                
                
            }
             if (suma%ninos==0){
            System.out.println("YES");
                } else {
                
            System.out.println("NO");
                }
                
            
          }
    }

}