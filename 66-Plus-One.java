class Solution {
    public int[] plusOne(int[] digits) {
     for(int i = digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        else{
            digits[i]=0;
        }  
     } 
     int new_num[]=new int[digits.length+1];
     new_num[0]=1;
     return new_num;
    }
}