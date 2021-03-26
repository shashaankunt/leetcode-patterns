Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array

class Solution {
    public int majorityElement(int[] nums) {
        
    
        int prev=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            int curr=nums[i];
            if(curr!=prev) 
            {
                if(count==0)
                    
            {
                prev=curr;
                count++;
            }
            
                else
                {
                    count--;
                }
            
            }
            else
            {
                count++;
            }
            
        }
        
        
        return prev;
        
    
    }
}
