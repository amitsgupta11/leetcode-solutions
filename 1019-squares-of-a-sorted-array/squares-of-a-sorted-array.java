class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int result[]=new int [n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int ls=nums[left]*nums[left]; // ls=leftsquare
            int rs=nums[right]*nums[right];// rs=rightsquare
            if(ls>rs){
                result[index]=ls;
                left++;
            }
            else{
                result[index]=rs;
                right--;
            }
            index--;
        }
        return result;
    }
}