class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet <Character> s = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            s.add(ch);
        }
        return s.size()==26 ? true:false;
    }
}