package abc;

import java.util.Scanner;

public class BinarySearchtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        int l = 0;
        int h = n;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid < n) {
                ans = mid;     
                l = mid + 1;   
            } else {
                h = mid - 1;   
            }
        }

        System.out.println("Square root : " + ans);
    }
}
