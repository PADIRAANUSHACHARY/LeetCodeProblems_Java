class Solution {
    public static int[] d = new int[31];
    static{
            Arrays.fill(d,-1);
    }
    public int fib(int n) {
        // if(n==0|| n==1){
        // return n;
        // }
        // else
        // return fib(n-1)+fib(n-2);

        // dynamic programming
        if (n <= 1) {
            return n;
        } else if (d[n] != -1) {
            return d[n];
        } else {
            return d[n] = fib(n - 1) + fib(n - 2);
        }
    }
}
