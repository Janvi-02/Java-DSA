class Solution {
    public int max(int[] piles){
            int max = Integer.MIN_VALUE;
            for(int i =0;i<piles.length;i++){
                if(max<piles[i]){
                    max = piles[i];
                }
            }
            return max;
        }
    public int totalH(int[] piles, int mid){
        int totalh = 0;
        for(int i =0;i<piles.length;i++){
            totalh+=Math.ceil((double)piles[i]/mid);
        }
        return totalh;
        }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = max(piles);
        while(start<=end){
            int mid = start+(end-start)/2;
            int totalh = totalH(piles,mid);
            if(totalh<=h){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}