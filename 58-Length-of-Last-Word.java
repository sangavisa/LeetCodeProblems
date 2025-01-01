class Solution {
    public int lengthOfLastWord(String s) {
       s=s.stripTrailing();
       int length =0;
       for (int i= s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
            return length;
        }
        length++;
       } 
       return length;
    }
}