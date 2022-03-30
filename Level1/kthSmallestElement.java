//Its have logical part that requied in website

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        int ele=r>0?arr[k-1]:arr[k];
        k=ele;
        return(k);
    } 
}
