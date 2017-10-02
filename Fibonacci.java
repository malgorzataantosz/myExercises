import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int n = Integer.parseInt(s1);

        int[] tab = new int[n];
        for(int i = 0; i<n; i++) {
            if (i < 2) {
                tab[i] = i;
            } else {
                tab[i] = tab[i - 1] + tab[i - 2];
            }
        }
        for(int i =0; i<n; i++){
            System.out.println(tab[i]);
        }
    }
}
