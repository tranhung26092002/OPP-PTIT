import java.util.Scanner;

public class BASIC009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                System.out.println(0);
            } else if (x < 0) {
                if (y < 0) {
                    System.out.println(3);
                } else {
                    System.out.println(2);
                }
            } else {
                if (y < 0) {
                    System.out.println(4);
                } else {
                    System.out.println(1);
                }
            }
        }
        sc.close();
    }
}
