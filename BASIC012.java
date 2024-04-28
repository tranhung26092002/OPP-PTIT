import java.util.Scanner;

public class BASIC012 {
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

    public static int longestSortedSequence(int[] a) {
        if (a.length == 0)
            return 0;
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else
                currentLength = 1;

        }
        return maxLength;
    }
}
