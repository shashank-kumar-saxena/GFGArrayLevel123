//Its have logical part that requied in website


/*
* Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.
* Input:
N = 5
vector = {1, 1, 1, 1, 1}
X = 1
Output:
5
Explanation: Frequency of 1 is 5.
*/

class Solution{
    int findFrequency(int A[], int x){
        int count=0;
        for(int i:A)
        {
            if(i==x)
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        else
        {
            return 0;
        }
    }
}
