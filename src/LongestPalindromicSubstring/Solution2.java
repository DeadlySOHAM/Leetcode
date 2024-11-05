package LongestPalindromicSubstring;

/*
	Most Time Efficient Technique to check for
	longest palindromic Substring
*/
class Solution2
{
	public String longestPalindrome(String s)
	{
		short length=(short)(s.length());
		if(length<2)
			return s ;
		short i , max = -99 , l ;
		String x , y ="" ;
		for(i=0;i<(short)(length-1);i++)
		{
			x = palin(s,length,i,i);
			l = (short)x.length() ;
			if(l>max)
			{
				max = l ;
				y = x ;
			}
			x = palin(s,length,i,(short)(i+1));
			l = (short)x.length() ;
			if(l>max)
			{
				max = l ;
				y = x ;
			}
		}
		return y;
	}
	public String palin(String a,short length,short start,short end)
	{
		while(start>-1 && end < length)
		{
			if(a.charAt(start)!=a.charAt(end))
				return a.substring(start+1,end);
			else
			{
				start--;
				end++;
			}
		}
		return a.substring(start+1,end);
	}
}
