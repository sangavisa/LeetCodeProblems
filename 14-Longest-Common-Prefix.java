class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans = \\;
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans+=first.charAt(i);

            }
            else{
                break;
            }
        }
        return ans;
        
    }
}