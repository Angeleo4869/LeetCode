package myAtoi;
class Solution {
    public int myAtoi(String str) {
    	if(!str.matches("\\s*\\-?\\+?[0-9]+.*")) {
    		return 0;
    	}
        char[] arrays = str.trim().toCharArray();
        long sum = 0;
        for(int i=0;i<arrays.length;i++) {
        	if(arrays[i] >='0' && arrays[i] <='9') {
        		sum *=10;
        		if(str.matches("\\s*\\-.*")) {
        			sum -= arrays[i] - '0';
        		}
        		else {
        			sum += arrays[i] - '0';
        		}
        		if(sum>=Integer.MAX_VALUE) {
        			return Integer.MAX_VALUE;
        		}
        		if(sum<=Integer.MIN_VALUE) {
        			return Integer.MIN_VALUE;
        		}
        		
        	}else if(i>0){
        		break;
        	}
        }
        return (int)sum;
    }
}