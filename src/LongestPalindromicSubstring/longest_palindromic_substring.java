package LongestPalindromicSubstring;

import java.util.*;

class longest_palindromic_substring
{
	public static void main(String[] args)
	{
		System.out.print("Enter String : ");
		String s = new Scanner(System.in).next() ;
		//2nd Most Efficient
		// Solution obj = new Solution();
		//1st Most Efficient
		Solution2 obj2 = new Solution2();
		// System.out.println(obj.longestPalindrome(s));
		System.out.println(obj2.longestPalindrome(s));
	}
}
