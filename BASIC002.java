import java.util.Scanner;

public class BASIC002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase > 0) {
            String st = sc.next();

            System.out.println(st);

            testcase--;
        }

        sc.close(); // Đóng Scanner sau khi sử dụng để tránh rò rỉ bộ nhớ
    }
}
