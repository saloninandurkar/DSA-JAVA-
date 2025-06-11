class Solution {
    static boolean armstrongNumber(int n) {
        int k=3;
        
        int sum = 0;
        int num = n;
        
        while(n>0){
             int ld = n % 10;
            sum += Math.pow(ld, k); 
            n = n / 10;
        }
        return sum == num ? true : false;      
    }
}
