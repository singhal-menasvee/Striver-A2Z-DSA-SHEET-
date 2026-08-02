class Solution {
    public boolean checkOnesSegment(String s) {
        
        boolean flag= false;
        for(char c:s.toCharArray()){
            if(c=='0'){
                flag=true;
            }
            else if(flag){
                return false;
            }

        }
        return true;
       
       
    }
}