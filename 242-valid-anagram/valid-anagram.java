class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map= new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char chr:t.toCharArray()){
            if(!map.containsKey(chr) || map.get(chr)==0){
                return false;
            }
            map.put(chr,map.get(chr)-1);
        }
        return true;
        
       
        

        
        
        
    }
}