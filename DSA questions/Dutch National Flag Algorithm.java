//Dutch National Flag Algorithm
public class Solution 
{
    public static void sort012(int[] A)
    {
        int low=0,mid=0,high=A.length-1;
        while(mid<=high)
        {
            if(A[mid]==0)
            {
                swap(A,low++,mid++);
            }
           else if(A[mid]==1)
                mid++;
            else
            {
                swap(A,mid,high--);
            }
        }
    }
    public static void swap(int A[],int B,int C)
    {
        int temp=A[B];
        A[B]=A[C];
        A[C]=temp;
    }
}
