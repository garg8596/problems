import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> hm1 = new HashMap<>();
        // Map<Integer, Integer> hm2 = new HashMap<>();

        for(int i=0; i<A.size(); i++)
        {
            int val = A.get(i);
            if(!hm1.containsKey(val)) hm1.put(val, 1);
            else hm1.put(val, hm1.get(val)+1);
        }

        for(int i=0; i<B.size(); i++)
        {
            int val = B.get(i);
            if(hm1.containsKey(val))
            {
                ans.add(val);
                hm1.put(val, hm1.get(val)-1);
                if(hm1.get(val) < 1) hm1.remove(val);
            } 
        }
        Collections.sort(ans);
        
        return ans;

    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3, 1, 2));

        System.out.println(new CommonElements().solve(A, B));
    }
}
