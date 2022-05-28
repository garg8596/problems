import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {
    public int[] prevSmaller(int[] A) {
        int smallest = Integer.MAX_VALUE;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp_stack = new Stack<>();

        for(int val: A)
        {
            st.push(val);//34, 35, 27, 42, 5, 28
            if(st.peek()<smallest)
            {
                smallest = st.peek();
                temp_stack.push(-1);
            }
            else{
                temp_stack.push(st.peek());
            }
        }
        int[] ans = new int[st.size()];

        for(int i=0; i<st.size(); i++)
        {
            ans[i] = temp_stack.pop();
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] A = {34, 35, 27, 42, 5, 28, 39, 20, 28};
        System.out.println(Arrays.toString(new NearestSmallestElement().prevSmaller(A)));
        //-1 34 -1 27 -1 5 28 5 20 
    }
}
