
import java.util.Scanner;
public class Recursion_n_to_1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number");
        n = sc.nextInt();
        func(n);
    }
    static void func(int n)
    {
        if (n <= 0)
        {
            return;
        }
        else
        {
            System.out.print(n + " ");
            func(n - 1);
        }
    }
}
     

//Time Complexity =O(n)
