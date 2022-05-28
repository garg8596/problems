import java.util.HashMap;
import java.util.Stack;


//not able to solve that
public class InfinixToPostfix {
    public String solve(String A) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = A.length();
        String ans = "";

        hm.put('+', 1);
        hm.put('-', 1);
        hm.put('*', 2);
        hm.put('/', 2);
        hm.put('^', 3);
        hm.put('(', 0);

        //System.out.println(hm);

        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++)
        {
            char val = A.charAt(i);
            if(val=='(') //open_bracket++;
            if(val=='*' || val=='+' || val=='-' || val=='/' || val=='^' || val=='(' || val==')')
            {
                if(val=='(') st.push(val);
                else if(val==')')
                {
                    while(st.peek()!='(') ans+=st.pop();
                    st.pop();
                }
                else if(!st.empty() && hm.get(val)>hm.get(st.peek()) && val!='(') st.push(val);
                else if(!st.empty() && hm.get(val)<=hm.get(st.peek()) && val!='(')
                {
                    ans+=st.pop();
                    st.push(val);
                } 
                else st.push(val);
            }
            else
            {
                ans += val;
            } 
        }
        while(!st.empty()) ans+=st.pop();


        //System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String A = "q+(c*t)*o+(g*g)+q*(i-a)*p-(i*l)";
        System.out.println(new InfinixToPostfix().solve(A));
    }
    //qct*o*+gg*+qia-*p*+il*-
    //qct*o*gg*+qia-*p*il*-++
}
