import java.util.*;

class Problem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		ArrayList<Integer> al=new ArrayList<>();
		int[] res=new int[nums1.length];
		int j=nums2.length-1;
		for(int n:nums2) {
			al.add(n);
		}
		for(int i=0; i<nums1.length; i++) {
			int x=al.indexOf(nums1[i]);
			if(x<al.size()-1) {
				for(int k=x+1; k<al.size(); k++) {
					if(al.get(k)>nums1[i]) {
						res[i]=al.get(k);
						break;
					} else {
						res[i]=-1;
					}
				}
			}else{
			    res[i]=-1;
			}
		}
			return res;
    }
}