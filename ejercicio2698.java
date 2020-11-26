
import java.util.Scanner;
public class ejercicio2698
{
    public static void main(String[] args) {
  Scanner lee = new Scanner(System.in);
  String a;
  int r=0,ac=0;
  
 
   a = lee.nextLine();
   for (int i = 0; i < a.length(); i++) {
       
    switch (a.charAt(i)) {
    case 'A':
     r=1;
     ac+=r;
     break;
    case 'B':
     r=2;
     ac+=r;
     break;
    case 'C':
     r=3;
     ac+=r;
     break;
    case 'D':
      r=4;
     ac+=r;
     break;
    case 'E':
     r=5;
     ac+=r;
     break;
    case 'F':
      r=6;
     ac+=r;
     break;
    case 'G':
      r=7;
     ac+=r;
     break;
    case 'H':
      r=8;
     ac+=r;
     break;
    case 'I':
      r=9;
     ac+=r;
     break;
    case 'J':
     r=10;
     ac+=r;
     break;
    case 'K':
      r=11;
     ac+=r;
     break;
    case 'L':
      r=12;
     ac+=r;
     break;
    case 'M':
      r=13;
     ac+=r;
     break;
    case 'N':
      r=14;
     ac+=r;
     break;
    case 'O':
      r=15;
     ac+=r;
     break;
    case 'P':
     r=16;
     ac+=r;
     break;
    case 'Q':
      r=17;
     ac+=r;
     break;
    case 'R':
      r=18;
     ac+=r;
     break;
    case 'S':
      r=19;
     ac+=r;
     break;
    case 'T':
     r=20;
     ac+=r;
     break;
    case 'U':
      r=21;
     ac+=r;
     break;
    case 'V':
     r=22;
     ac+=r;
     break;
    case 'W':
      r=23;
     ac+=r;
     break;
    case 'X':
      r=24;
     ac+=r;
     break;
    case 'Y':
      r=25;
     ac+=r;
     break;
    case 'Z':
      r=26;
     ac+=r;
     break;
    
    }
   }
   System.out.println(ac);
  }
 }

