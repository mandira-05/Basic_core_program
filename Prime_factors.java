import java.util.Scanner;

public class Prime_factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int n = scanner.nextInt();

        for (long i=2; i*i<=n;i++) {

            while (n%i==0) {

                System.out.println(i);
                n= (int) (n/i);
            }
        }
        if (n>1) {
            System.out.println(n);
        } else {
            System.out.println();
        }

    }
}
