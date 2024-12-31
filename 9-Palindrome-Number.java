class Solution {
    public boolean isPalindrome(int x) {
         if (x<0){
            return false;
         }
        String original=Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        if(original.equals(reversed) ){
            return true;
        } 
        else{
            return false;
        }


    }
}