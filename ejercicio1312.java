import java.util.Scanner;
 
public class ejercicio1312 {
    public static void main(String[] args) {
        Scanner Lee; 
        int r1, r2, s;
 
        
        Lee = new Scanner(System.in);
        r1 = Lee.nextInt();
        s = Lee.nextInt();
        r2 = (s << 1) - r1;
        System.out.println(r2);
    }
}