import java.util.*;
public class  nser{
    public static int[] nser(int arr[]) {
        int res[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0;i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                res[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
        
    }
    public static void main(String[] args) {
        int arr[]= {4,3,1,6,8,4,5,8};
        int res[] = nser(arr);
        for(int i: res){
                System.out.println(i + " ");
        }
    }
}