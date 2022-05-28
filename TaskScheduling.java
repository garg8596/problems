import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduling {
    public int solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int count = 0;

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<n; i++) q.add(A[i]);

        for(int i=0; i<m; i++)
        {
            int val = B[i];
            
            while(val!=q.peek())
            {
                q.add(q.remove());
                count++;
            }
            q.remove();
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] A = {1};
        int[] B = {1};

        System.out.println(new TaskScheduling().solve(A, B));
    }
}
