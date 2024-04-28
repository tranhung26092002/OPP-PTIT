import java.util.Scanner;

public class BASIC007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = Integer.parseInt(sc.nextLine());

        while (testcase-- > 0) {
            int k = 0;
            int year = sc.nextInt();

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    k = 1;
                }
            } else if (year % 4 == 0) {
                k = 1;
            }
            if (k == 1) {
                System.out.println(year + " : Leap-year");
            } else {
                System.out.println(year + " : Non Leap-year");
            }
        }
        sc.close();
    }
}
