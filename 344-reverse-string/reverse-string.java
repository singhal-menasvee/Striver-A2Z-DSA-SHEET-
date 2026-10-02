class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stc= new Stack<>();
        for(int i=0;i<s.length;i++){
            stc.push(s[i]);
        }
        for(int i=0;i<s.length;i++){
            s[i]=stc.pop();
        }

        
    }
}