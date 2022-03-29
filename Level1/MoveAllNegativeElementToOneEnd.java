//Its have logical part that requied in website
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        int num=0;
        Arrays.sort(new ArrayList[]{neg});
        for(int i:pos)
        {
            arr[num]=i;
            num++;
        }
        for(int i:neg)
        {
            arr[num]=i;
            num++;
        }
        
        // Your code goes here
    }
}