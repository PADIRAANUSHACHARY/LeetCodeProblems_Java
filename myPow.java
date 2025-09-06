class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        else if(n == 1) {
            return x;
        }
        else if(n < 0){
            int N = -(n);
            double result = x * myPow(x, N - 1);
            return (1 / result);
        }
        if(n % 2 == 1){
            return x * myPow(x * x, (n - 1) / 2);
        }
        else{
            return myPow(x * x, n/2);
        }
        
    }
}
