import java.util.Scanner;
 
public class ejercicio3024 {
 public static void main(String[] args) {
  Scanner lee = new Scanner(System.in);
  String a, b;
  
 
  while (lee.hasNextLine()) {
   a = lee.nextLine();
   if(a.length()<=100){
   b ="";
   for (int i = 0; i < a.length(); i++) {
    switch (a.charAt(i)) {
    case 'W':
     b =b+ 'Q';
     break;
    case 'S':
     b =b+ 'A';
     break;
    case 'X':
     b =b+ 'Z';
     break;
    case 'E':
     b =b+ 'W';
     break;
    case 'D':
     b =b+ 'S';
     break;
    case 'C':
     b=b+ 'X';
     break;
    case 'R':
     b=b+ 'E';
     break;
    case 'F':
     b=b+ 'D';
     break;
    case 'V':
     b=b+ 'C';
     break;
    case 'T':
     b=b+ 'R';
     break;
    case 'G':
     b=b+ 'F';
     break;
    case 'B':
     b=b+ 'V';
     break;
    case 'Y':
     b=b+ 'T';
     break;
    case 'H':
     b=b+ 'G';
     break;
    case 'N':
     b=b+ 'B';
     break;
    case 'U':
     b=b+ 'Y';
     break;
    case 'J':
     b=b+ 'H';
     break;
    case 'M':
     b=b+ 'N';
     break;
    case 'I':
     b=b+ 'U';
     break;
    case 'K':
     b=b+ 'J';
     break;
    case ',':
     b=b+ 'M';
     break;
    case 'O':
     b=b+ 'I';
     break;
    case 'L':
     b=b+ 'K';
     break;
    case '.':
     b=b+ ',';
     break;
    case 'P':
     b=b+ 'O';
     break;
    case ';':
     b=b+ 'L';
     break;
    case '/':
     b=b+ '.';
     break;
    case '2':
     b=b+ '1';
     break;
    case '3':
     b=b+ '2';
     break;
    case '4':
     b=b+ '3';
     break;
    case '5':
     b=b+ '4';
     break;
    case '6':
     b=b+ '5';
     break;
    case '7':
     b=b+ '8';
     break;
    case '8':
     b=b+ '7';
     break;
    case '9':
     b=b+ '8';
     break;
    case '0':
     b=b+ '9';
     break;
    case '-':
     b=b+ '0';
     break;
    case '=':
     b=b+ '-';
     break;
    case '[':
     b=b+ 'P';
     break;
    case ']':
     b=b+ '[';
     break;
    case '\\':
     b=b+ ']';
     break;
    case '\'':
     b=b+ ';';
     break;
    case ' ':
     b=b+ ' ';
     break;
    }
   }
   System.out.println(b);}
  }
 }
}