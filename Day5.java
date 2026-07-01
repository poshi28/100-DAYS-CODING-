/*Problem: A system receives two separate logs of user arrival times from two different servers. Each log is already sorted in ascending order. Your task is to create a single chronological log that preserves the correct order of arrivals.

Input:
- First line: integer p (number of entries in server log 1)
- Second line: p sorted integers representing arrival times from server 1
- Third line: integer q (number of entries in server log 2)
- Fourth line: q sorted integers representing arrival times from server 2)

Output:
- Print a single line containing all arrival times in chronological order, separated by spaces

Example:
Input:
5
10 20 30 50 70
4
15 25 40 60

Output:
10 15 20 25 30 40 50 60 70

Explanation: Compare the next unprocessed arrival time from both logs and append the earlier one to the final log until all entries are processed*/


import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in first log: ");
        int p = sc.nextInt();
        int[] log1 = new int[p];
        System.out.println("Enter " + p + " sorted arrival times:");
        for (int i = 0; i < p; i++) {
            log1[i] = sc.nextInt();
        }
        System.out.print("Enter number of elements in second log: ");
        int q = sc.nextInt();
        int[] log2 = new int[q];
        System.out.println("Enter " + q + " sorted arrival times:");
        for (int i = 0; i < q; i++) {
            log2[i] = sc.nextInt();
        }
        int[] merged = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (log1[i] <= log2[j]) {
                merged[k++] = log1[i++];
            } else {
                merged[k++] = log2[j++];
            }
        }
        while (i < p) {
            merged[k++] = log1[i++];
        }
        while (j < q) {
            merged[k++] = log2[j++];
        }
        System.out.println("Merged chronological log:");
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }
        sc.close();
    }
}
