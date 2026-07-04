class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int oneStep=0;
        int twoStep=0;
        for(int i=cost.length-1;i>=0;i--){
            int current=cost[i]+Math.min(oneStep,twoStep);
            twoStep=oneStep;
            oneStep=current;
        }
        return Math.min(oneStep,twoStep);
    }
}