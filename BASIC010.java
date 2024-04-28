import java.util.Scanner;

public class BASIC010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int num = sc.nextInt();
            System.out.println(swapDigitPairs(num));
        }
        sc.close();
    }

    public static int swapDigitPairs(int num) {
        int mul = 1;
        int res = 0;
        while (num > 10) {
            int target = num % 100;
            res = res + (10 * (target % 10) + (target / 10)) * mul;
            mul = mul * 100;
            num = num / 100;
        }
        if (num > 0)
            res = res + num * mul;
        return res;
    }
}
