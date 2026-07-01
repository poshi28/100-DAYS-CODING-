/*Problem: Implement linear search to find key k in an array. Count and display the number of comparisons performed.

Input:
- First line: integer n (array size)
- Second line: n space-separated integers
- Third line: integer k (key to search)

Output:
- Line 1: "Found at index i" OR "Not Found"
Line 2: "Comparisons = c"

Example:
Input:
5
10 20 30 40 50
30

Output:
Found at index 2
Comparisons = 3

Explanation: Compared with 10, 20, 30 (found at index 2 with 3 comparisons)*/


import java.util.Scanner;
public class Day3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key to search: ");
        int k = sc.nextInt();
        int comparisons = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            comparisons++;
            if (arr[i] == k) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not Found");
        }
        System.out.println("Comparisons = " + comparisons);
        sc.close();
    }
}
