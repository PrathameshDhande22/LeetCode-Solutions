class Solution283:
    @staticmethod
    def moveZeroes(nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in nums:
            if(i==0):
                nums.remove(i)
                nums.append(0)
                
        print(nums)
        
        
        
if __name__=='__main__':
    # Solution283.moveZeroes([0,1,0,3,12])
    Solution283.moveZeroes([0])