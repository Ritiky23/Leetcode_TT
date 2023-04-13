import java.util.*;
class nger{
    public static int[] nger1(int arr[]) {
        int i=0;
        int res[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(i=arr.length-1; i>=0;i--){
            while(!stack.empty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.empty())
            {
                res[i] = -1;
            }else
            {
                res[i]= stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= {5,8,2,4,9,6};
        int res[] = nger1(arr);
        for(int i : res){
                System.out.print(i + " ");
        }
    }
}