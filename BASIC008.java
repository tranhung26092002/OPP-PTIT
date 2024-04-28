import java.util.Scanner;

public class BASIC008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Numbers between 100 and 200, divisible by 9:");

        for (int i = 101; i < 200; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
