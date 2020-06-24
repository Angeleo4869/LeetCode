package longestCommonPrefix;

//最长公共前缀
//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0) {//排除strs为空的情况
    		return "";
    	}
    	Arrays.sort(strs,0,strs.length);//将最短字串放在前面，方便找出最短前缀
    	StringBuffer str = new StringBuffer(strs[0]);//StringBuffer可修改，节约空间
    	for(int i=0;i<strs.length;i++) {//从第0个开始
    		if("".equals(strs[i]))//如果字符串为“”直接返回
    			return "";
//    		boolean startsWith(String prefix)测试此字符串是否以指定的前缀开始
    		while(!strs[i].startsWith(str.toString())){
    			str.deleteCharAt(str.length()-1);//如果不是以str为前缀，则将str最后一个字符删除
    		}
    	}
    	return str.toString();//返回前compare个字符字串
    }
}
