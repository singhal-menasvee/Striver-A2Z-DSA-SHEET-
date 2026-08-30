class Solution {
    public String[] largestString(int[] nums) {

        String[] ans= new String[nums.length];

        for(int i=0;i<nums.length;i++){
            int x= nums[i];
            StringBuilder sb= new StringBuilder();

            while(x>=(1<<25)){
                sb.append('z');
                x-=(1<<25);
            }

            for(int p=24;p>=0;p--){
                int value=1<<p;

                if(x>=value){
                    sb.append((char)('a'+p));
                    x-=value;
                }
            }
            ans[i]=sb.toString();
        }
        return ans;
    }
}