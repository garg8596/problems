import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixMedian {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(A.toString());

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                list.add(A.get(i).get(j));
            }
        }

        System.out.println(list);

        Collections.sort(list);

        int size = m*n;

        if(size==0) return list.get(size);

        return list.get(size/2);
    
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1));

        ArrayList<ArrayList<Integer>>list = new ArrayList<>();


        list.add(A);

        System.out.println(new MatrixMedian().findMedian(list));
    }
}
