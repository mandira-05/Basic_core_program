import java.util.Scanner;

public class Harmonic_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int n = scanner.nextInt();

        float sum=0;

        for (float i = 1; i <= n ; i++) {
            sum = sum + 1/i;
        }

        System.out.println("Sum of up to nth harmonic value is " +sum);

    }
}
