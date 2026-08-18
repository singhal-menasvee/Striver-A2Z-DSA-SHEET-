class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low= min(bloomDay);
        int high= max(bloomDay);
        int ans=-1;
        if(bloomDay.length<m*k){
            return -1;
        }
        while(low<=high){
            int mid= low+(high-low)/2;
            if(possible(bloomDay,k,mid)>=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static int possible(int[] arr, int k, int day){
        int bouquet=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                bouquet+=count/k;
                count=0;
            }
        }
        bouquet+=count/k;
        return bouquet;

    }
    public static int min(int[] arr){
        int minimum= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            minimum= Math.min(minimum,arr[i]);
        }
        return minimum;
    }
    public static int max(int[] arr){
        int maximum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maximum= Math.max(maximum,arr[i]);
        }
        return maximum;
    }

}