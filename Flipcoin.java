import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {

        double random_coin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of times to flipcoin");
        int n = scanner.nextInt();
        float head=0;
        float tail=0;

        for (int i=1;i<=n;i++) {
            random_coin = Math.random();
            if (random_coin < 0.5) {
                System.out.println("Tails");
                tail=tail+1;
            } else {
                System.out.println("Head");
                head=head+1;
            }
        }

        System.out.println("No. of tails in " +tail);
        System.out.println("No. of heads in " +head);

        float head_percent = head/n*100;
        System.out.println("Percentage of head " +head_percent);

        float tail_percent = tail/n*100;
        System.out.println("Percentage of tail " +tail_percent);

    }

}
