import java.util.Scanner;
 

public class ejercicio1049 {
    public static void main(String[] args) {
        Scanner Lee; 
        int N;
 
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            N = Lee.nextShort();
            if (N > 0)
                System.out.println((N * (N + 1)) / 2);
            else {
                N = -N;
                N = ((N * (N + 1)) / 2);
                System.out.println(1 - N);
            }
        }
    }
}