package LeetCode_Questions;

public class TwoSum_1
{
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;

//        TO MAKE IT EFFICIENT
    }

    public void mainTwoSum(){
        int[] x = {11, 7, 2, 15};
        x=twoSum(x, 9);
        for(int i:x){
            System.out.println(i);
        }
    }
}