
public class Powerof2 {
    public static void main(String[] args) {

        int n = 8;
        int result = 0;
        if ( n < 31 ) {
            for (int i = 1; i <= n; i++) {
                result = (int) Math.pow(2, n);
            }
            System.out.println("Power of 2 is : " + result);

        } else {
            System.out.println("Value is too high");
        }
    }
}
