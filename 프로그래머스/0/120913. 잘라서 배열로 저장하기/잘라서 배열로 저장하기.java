import java.util.*;

class Solution {
    public List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<my_str.length();i++) {
            sb.append(my_str.charAt(i));
            if(sb.length() == n) {
                answer.add(sb.toString());
                sb.setLength(0);
            }
        }
        
        if(sb.length() > 0) {
            answer.add(sb.toString());
        }
        
        return answer;
    }
}