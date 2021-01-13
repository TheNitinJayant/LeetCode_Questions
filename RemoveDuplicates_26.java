package LeetCode_Questions;

public class RemoveDuplicates_26 {

    public int removeDuplicates(int[] nums) {
        int res = 1;
        int lastNonDuplicateIndex = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[++lastNonDuplicateIndex]=nums[i];
                res++;
            }
        }
        return res;
    }

    public void mainRemoveDuplicates(){
        int[] x = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(x));

        for(int i:x){
            System.out.print(i+" ");
        }
    }

}
