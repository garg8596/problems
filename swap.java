import java.util.Arrays;

public class swap {
    public int[] solve(int[] A){

        int i=0; int j=A.length-1;

        while(i<j)
        {
            int swap = A[j];
            A[j] = A[i];
            A[i] = swap; 
            i++;
            j--;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(Arrays.toString(new swap().solve(A)));
        //4321
    }
}
