package convert;
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
    		return s;
    	/*
    	 * args[i]  =  args[i]+ 2*(numRow-i)+ 2*(i-1)+ 2*(numRow-i)+ ~~ 
    	 */
    	StringBuffer args = new StringBuffer();//ʹ��StringBuffer��ʡ�ڴ��GCʱ��
    	for(int i=1;i<=numRows;i++) {//��ÿһ�н��в���    		
    		int iseven = 0;//�ж��Ƿ�Ϊż��    		
    		int k = i-1;
    		while(k < s.length() ) {
    			args.append(s.charAt(k));
    			iseven++;
    			if( i==numRows || (i-1)> 0 && iseven%2 == 0){
    				k += 2*(i-1);
    			}
    			else { 
    				k += 2*(numRows - i);
    			}				
    		}    		    		
    	}
        return args.toString();
    }
}