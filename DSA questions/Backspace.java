public class Main
{
	public static void main(String[] args) {
// 		String s="ab#c";
// 		String r="";
// 		for(int i=0;i<s.length();i++)
// 		{
// 		    if(s.charAt(i)=='#')
// 		    r+=s.substring(0,i-1)+s.substring(i+1,s.length());
// 		}
// 		System.out.println(r);
        StringBuilder sb=new StringBuilder("ab#c");
// 		StringBuilder sb=new StringBuilder("acbc##");
		for(int i=0;i<sb.length();i++)
		{
		    if(sb.charAt(i)=='#')
		   { 
		       sb.deleteCharAt(i);
		    sb.deleteCharAt(i-1);
		       i=0;
		   }
		   
		}
		System.out.println(sb.toString());
	}
}
