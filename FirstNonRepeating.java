import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating{
    public String solve(String A) {
        String ans = "";
        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        int n = A.length();
        
        for(int i=0; i<n; i++)
        {
            char val = A.charAt(i);
            q.add(val);
            if(!map.containsKey(val)) map.put(val, 1);
            else map.put(val, map.get(val)+1);

            if(map.get(q.peek())>1) q.remove();
            boolean flag = false;
            for(Character character: q)
            {
                if(map.get(character)<=1)
                {
                    ans += character;
                    flag = true;
                    break;
                }
            }
            if(!flag) ans+='#';
        }
       
        return ans;
    }
    public static void main(String[] args) {
        String A = "abcabc";
        System.out.println(new FirstNonRepeating().solve(A));
    }
}