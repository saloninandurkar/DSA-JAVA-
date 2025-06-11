class Solution {
    public int reverseDigits(int n) {
        int rev = 0;
        while(n > 0){
            int id = n % 10;
            
            rev = (rev * 10) + id;
            
            n = n / 10;
        }
        
        return rev;
        
    }
}
