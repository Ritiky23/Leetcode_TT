import java.util.*;
class  nsel{
    public static int[] nsel(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>(); 
        for(int i=0 ; i<arr.length; i++){
                while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
                {
                    stack.pop();
                    stack.push(i);
                }
                if (stack.isEmpty())
                {
                    res[i]=-1;
                    stack.push(i);
                }
                else
                {
                    res[i] = stack.peek(); 
                    stack.push(i);                   
                }
                
            }
        return res;}
    public static void main(String[] args) {
        int nums[] = {3,4,5,2,3,4,5,6,9,9,7};
        int res[] = nsel(nums);
        for(int i:res){
            System.out.print(i + " ");
        }
    }
    
}