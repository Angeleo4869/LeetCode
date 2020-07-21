package main;

//import isPalindrome.*;

//import myAtoi.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Long.MAX_VALUE);
//		long l = 9223372036854775808;
//		String str = "9223372036854775808";
//    	System.out.println(str.matches("\\s*\\-?\\+?[0-9]+.*"));//表示匹配以“ ”/字母开始的任意字符串
//		System.out.println(new Solution().myAtoi("-256123 hello")); 
		
//		System.out.println(new Solution().isPalindrome(-121));
//		System.out.println(String.valueOf(-2));
		char[][] letters = {{},{},{'a','b','c'},{'d','e','f'},//0 1,2,3
				{'g','h','i'},{ 'j','k','l'},{'m','n','o'},//4,5,6
				{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};//7,8,9
		for(int i=0;i<letters.length;i++) {
			for(int j=0;j<letters[i].length;j++) {
				if(j>0)
					System.out.print(" ");
				System.out.print(letters[i][j]);
			}
			System.out.println();
		}
		
	}

}
