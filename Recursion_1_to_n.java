
import java.util.Scanner;
public class Recursion_1_to_n{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the upper limit=");
        n = sc.nextInt();

        System.out.print("First " + n + " natural numbers are : ");
        func(n);
    }
    public static void func(int n) {
        if (n > 1)
            func(n - 1);
        System.out.print(" " + n);
    }
}

//Time Complexity =O(n)
