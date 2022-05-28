import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseBQueueElement {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        int[] ans = new int[n];

        int i=0;
        while(B!=i)
        {
            st.add(A[i]);
            i++;
        }
        while(!st.empty()) q.add(st.pop());

        while(i<n)
        {
            q.add(A[i]);
            i++;
        } 

        int j=0;
        while(!q.isEmpty())
        {
            ans[j] = q.remove();
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] A = {43, 35, 25, 5, 34, 5, 8, 7};
        int B = 6;
        //5 34 5 25 35 43 8 7 

        System.out.println(Arrays.toString(new ReverseBQueueElement().solve(A, B)));
    }
}
