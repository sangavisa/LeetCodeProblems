class Solution {
    public int mySqrt(int x) {
        if(  x ==0||x==1){
            return x;
        }
    for(int i=0;i<=x/2+1;i++){
        long square = (long)i*i;
        if (square ==x){
            return i; 
        }
        else if(square >x){
            return i-1;
        }       


    }
    return 0;
}
    }
