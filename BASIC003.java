import java.util.Scanner;

public class BASIC003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        sc.nextLine();

        while (testcase-- > 0) {
            String name = sc.nextLine();
            System.out.println("Hi " + name);

        }
        sc.close();
    }
}
