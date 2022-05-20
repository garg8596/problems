import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortArray {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
            
        Map<Integer, Integer> appearElements = new HashMap<>(); 
        ArrayList<Integer> ans = new ArrayList<>();  
        ArrayList<Integer> temp = new ArrayList<>();
        
        

        for(Integer val: A)
        {
            if(!appearElements.containsKey(val)) appearElements.put(val, 1);
            else appearElements.put(val, appearElements.get(val)+1);
        }

        for(Integer val: B)
        {
            if(appearElements.containsKey(val))
            {
                int times = appearElements.get(val);
                for(int i=0; i<times; i++)
                {
                    ans.add(val);
                }
                appearElements.remove(val);
            }
        }

        for(Entry<Integer, Integer> entry: appearElements.entrySet())
        {
            for(int i=0; i<entry.getValue(); i++) temp.add(entry.getKey());
        }


        Collections.sort(temp);

        for(int i=0; i<temp.size(); i++)
        {
            ans.add(temp.get(i));
        }

        return ans;  
             
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 2, 18, 16, 16, 16));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 13, 2, 16, 4, 19));

        System.out.println(new SortArray().solve(A, B));

        //2 16 16 16 10 18
        //2 16 10 16 16 18 


    }
}
