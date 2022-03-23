public class Main
{
    public static boolean isPrime(int n)
    {
        if(n==2)
        return true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
// 		int n=5;
		int c=0,i=2;
		while(c!=5)
		{
		    if(isPrime(i))
		    c++;
		   if(c!=5)
		   i++;
		}
		System.out.println(i);
	}
}
