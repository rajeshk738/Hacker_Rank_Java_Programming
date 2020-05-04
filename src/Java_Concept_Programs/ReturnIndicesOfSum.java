
package Java_Concept_Programs;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        
         int size_of_array = nums.length;
        int j = size_of_array-1;
      //  int j=3;
       
        
        for(int i =0; i<j;i++)
        {
        	for(int m=i+1; m<=j;m++)
        	{
        		if(nums[i]+nums[m]==target)
        		{
        			ans[0] = i;
        			ans[1] = m;
        			}
        	}
        	
        }
        
      /*  int i=0;
        
        
        while(i<j)
        {
            if(nums[i]+nums[j]==target)
            {
                ans[0]=i;
                ans[1]=j;
                break;
            }
            else if (nums[i]+nums[j]<target)
                i++;
            else
                j--;
        }
        
       */
        
       
        return ans;
    }
}


public class ReturnIndicesOfSum extends Solution{

	public static void main(String[] args) {
		int a[] = {3,2,4};
		int t = 5;
		int temp;
		
		Solution s = new Solution();
		int b[] = s.twoSum(a, t);
		
		System.out.println(b[0]+" "+b[1]);
	}
}
