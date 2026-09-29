class Solution {
    public int mySqrt(int x) {
        int result;
        int low = 0;
        int high = x;
        while(low <= high){
            long mid = (high-low)/2 + low;
            if (mid*mid == x){
                return (int) mid;
            }
            else if (mid*mid > x){
                high = (int)mid - 1;
            }
            else{
                low = (int)mid + 1;
            }
        }
        return high;

    }
}