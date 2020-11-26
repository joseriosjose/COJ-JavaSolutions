import java.util.Scanner;

public class ejercicio1244
{
    public static void main(String []args)
    {
      Scanner lee=new Scanner (System.in);
     String frase;
     char w=' ';
      while(lee.hasNextLine()){
       frase=lee.nextLine();
       char auxi;
       auxi=frase.charAt(0);
       if(auxi=='*'){break;}
       else{
       String [] aux =frase.split(" ");
       
        for(int i = 0; i < aux.length; i++){
            w= aux[i].charAt(0);
            
        }
           
          if (w==w)
          {System.out.println("y");} 
          else 
          {System.out.println("n");}
    }
    }
 }
}
