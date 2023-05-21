import java.util.Scanner;

public class recursion_reverse_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        func(arr, 0);
    
      }
    
      public static void func(int[] arr, int idx) {
        if (idx == arr.length) return;
        func(arr, idx + 1);
        System.out.println(arr[idx]);
      }
    
    }