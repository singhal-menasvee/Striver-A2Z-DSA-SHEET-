class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=max(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalHours= calculateTotal(piles,mid);
            if(totalHours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }


        }
        return low;
        
    }
    public int max(int[] arr){
       int max= Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        max= Math.max(max,arr[i]);
       }
       return max;
    }

    public int calculateTotal(int[] arr, int hour){
        int totalH=0;
        for(int i:arr){
            totalH+= Math.ceil((double) i/(double) hour);
        }
        return totalH;
    }
} 