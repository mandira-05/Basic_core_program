import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        int temp = year;
        int count = 0;
        while (temp > 0 ) {
            temp=temp/10;
            count++;
        }

        if (count == 4) {
            if ( year%4 == 0 || year % 100 != 0 && year % 400 == 0) {
                System.out.println("Its leap yr");

            } else {
                System.out.println("not a leap yr");
            }

        }
        else {
            System.out.println("Invalid,Enter a 4 digit yr only");
        }

    }
}
