import java.util.*;
public class Main
{
	public static void main(String[] args) {
         int a[][] = { { 0, 0, 1, 0 },
                              { 0, 0, 1, 0 },
                              { 0, 0, 0, 0 },
                              { 0, 0, 1, 0 } };
                              System.out.println(solve(a));
	}
	public static int solve(int a[][])
	{
	    Stack<Integer> s=new Stack<>();
	    for(int i=0;i<a.length;i++)
	    s.push(i);
	    
	    while(s.size()>=2)
	    {
	        int x=s.pop();
	        int y=s.pop();
	        if(a[x][y]==1)
	        s.push(y);
	        else
	        s.push(x);
	    }
	    int ans=s.pop();
	    for(int i=0;i<a.length;i++)
	    {
	        if(i!=ans)
	        {
	            if(a[i][ans]==0 || a[ans][i]==1)
	            return -1;
	        }
	    }
	    return ans;
	}
}
