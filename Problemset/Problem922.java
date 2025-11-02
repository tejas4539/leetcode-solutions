public class Problem922 {
       public int[] sortArrayByParityII(int[] nums) {
     	int i=0;
		int j=1;
		while(i<nums.length && j<nums.length) {
			if(nums[i]%2==0) {
				i+=2;
			}
			if(nums[j]%2!=0) {
				j+=2;
			}
			else {
				int k=nums[i];
				nums[i]=nums[j];
				nums[j]=k;
			}
		}
		return nums;
    } 
}
