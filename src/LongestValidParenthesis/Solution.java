package LongestValidParenthesis;

class Solution
{
	public int longestValidParentheses(String s)
	{
		int length = s.length() ;
		if(length<2)
			return 0 ;
		s = s.substring(s.indexOf('('),s.lastIndexOf(')')+1);
		length = s.length();
		if(length<2)
			return 0 ;
		int i , x , max = -99 ;
		for(i=0;i<length-1;i++)
		{
			x = palin(s,length,i,i+1);
			if(x>max)
				max = x ;
		}
		return max ;
	}
	public static int palin(String a,int length,int start,int end)
	{
		while( start > -1 && end < length )
		{
			if(a.charAt(start) == a.charAt(end))
				return (end-(start+1));
			else
			{
				start-- ;
				end++ ;
			}
		}
		return (end-(start+1));
	}
}
