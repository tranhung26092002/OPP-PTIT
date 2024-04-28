import java.util.Scanner;

public class BASIC011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String[] input = sc.nextLine().split(" ");
            int l = input.length;
            int[] arr = new int[l];

            for (int i = 0; i < l; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(longestSortedSequence(arr));
        }

        sc.close();
    }

    public static int longestSortedSequence(int[] arr) {
        int l = arr.length;
        if (l < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int tmp;
        for (int i = 1; i < l; i++) {
            tmp = arr[i] - arr[i - 1];
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }
}
