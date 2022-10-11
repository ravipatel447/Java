import java.util.*;
public class stringl {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        int currfirst = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.size()==0){
                set.add(c);
                currfirst = i;
            }
            if(set.contains(c)){
                
            }
            if(set.size()>ans){
                ans = set.size();
            }
        }
    }
    
}
