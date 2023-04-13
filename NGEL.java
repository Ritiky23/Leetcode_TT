import java.util.Stack;

public class ngel{
    public static int[] ngel(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<arr.length; i++){
            while( ! stack.isEmpty() && arr[stack.peek()] <= arr[i] )
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= {2,5,3,6,7,1,8,9};
        int res[] = ngel(arr);
        for(int i: res){
                System.out.println(i + " ");
        }
    }
    
}