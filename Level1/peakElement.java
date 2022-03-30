//Its have logical part that requied in website

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        int count=0;
       for(int i=0;i<n-1;i++)
       {
           if(arr[i+1]>arr[i])
           count=i+1;
       }
       return(count);
    }
}