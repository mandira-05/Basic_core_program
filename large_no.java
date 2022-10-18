import java.util.Scanner;

public class large_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 nos.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( a>b && a>c ) {
            System.out.println(+a+ " a is greater");
        }
        else if (b>a && b>c) {
            System.out.println(+b+ " b is greater");

        } else {
            System.out.println(+c+ " c is greatrer");
        }


    }
}
