import java.util.Scanner;
public class ejercicio2746
{
     public static void main(String[] args) {
  Scanner lee = new Scanner(System.in);
  String palabra;
  int m=0,b=0;
  
 
   palabra= lee.nextLine();
   if(palabra.length()<=1000){
   for (int i = 0; i < palabra.length(); i++) {
       
    switch (palabra.charAt(i)) {
    case 'A':
     m=m+1;
     break;
    case 'E':
     m=m+1;
     break;
    case 'I':
     m=m+1;
     break;
    case 'O':
      m=m+1;
     break;
    case 'U':
     m=m+1;
     break;
     
    case 'B':
      b=b+1;
     break;
    case 'C':
      b=b+1;
     break;
    case 'D':
      b=b+1;
     break;
    case 'F':
      b=b+1;
     break;
    case 'G':
     b=b+1;
     break;
    case 'H':
      b=b+1;
     break;
    case 'J':
      b=b+1;
     break;
    case 'K':
      b=b+1;
     break;
    case 'L':
      b=b+1;
     break;
    case 'M':
      b=b+1;
     break;
    case 'N':
     b=b+1;
     break;
    case 'P':
      b=b+1;
     break;
    case 'Q':
      b=b+1;
     break;
    case 'R':
     b=b+1;
     break;
    case 'S':
    b=b+1;
     break;
    case 'T':
      b=b+1;
     break;
    case 'V':
     b=b+1;
     break;
    case 'W':
      b=b+1;
     break;
    case 'X':
      b=b+1;
     break;
    case 'Y':
      b=b+1;
     break;
    case 'Z':
     b=b+1;
     break;
    
    }
   }
   System.out.println(m+" "+b);
  }
 }
}
