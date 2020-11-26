import java.util.Scanner;
public class ejercicio1441
{
    public static void main(String[] args){ 
    
    Scanner lee=new Scanner(System.in);
    String [] linea =new String[3];
    String a;
    do{
         a=lee.nextLine();
      if(a!="0 0 0"){
       linea=a.split(" ");
       
       int ar=Integer.parseInt(linea[0]);
       int at=Integer.parseInt(linea[1]);
       int ac=Integer.parseInt(linea[2]);
       if(ar%3==0&&at%4==0&&ac%5==0){
           System.out.println("right");
        }else {
        System.out.println("wrong");
        }
     }else {
        break;
        }
   }while(a!="0 0 0");
  }
}