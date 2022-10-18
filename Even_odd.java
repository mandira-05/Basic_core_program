import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("Even no.");
        }
        else {
            System.out.println("odd no.");
        }
    }
}
