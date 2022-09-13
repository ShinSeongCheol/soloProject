package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class chap03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int count = 0;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] + A[j] == M) {
                count++;
                i++;
                j--;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}
