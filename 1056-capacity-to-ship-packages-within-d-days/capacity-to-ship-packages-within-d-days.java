class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low= max(weights);
        int high=sum(weights);
        int ans=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            int requiredDays= calculate(weights,mid);
            if(requiredDays<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int max(int[] weights){
        
        int max= Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            
            max= Math.max(max,weights[i]);
        }
        return max;

    }
    public static int sum(int[] weights){
        int ans=0;
        for(int i:weights){
            ans+=i;
        }
        return ans;
    }

    public static int calculate(int[] weights, int capacity){
        int currWeight=0;
        int daysUsed=1;
        for(int i=0;i<weights.length;i++){
            if(currWeight+weights[i]<=capacity){
                currWeight+=weights[i];
            }
            else{
                daysUsed++;
                currWeight=weights[i];
            }
        }
        return daysUsed;

    }
}