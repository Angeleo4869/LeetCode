package lengthoflongestsubstring;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {
    	Set<Character> set = new HashSet<Character>();
    	int count = 0,k =0 ;
    	for(int i=k;i< s.length();i++) {
    		if(set.contains(s.charAt(i))) {
    			i = ++k;
    			set.clear();
    		}
    		set.add(s.charAt(i));
    		count = Math.max(count,set.size());
    	}
    	return count;
    }
}