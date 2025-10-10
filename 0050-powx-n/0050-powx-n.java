class Solution {
    public double myPow(double x, int n) {
       
      // double ans = 1.0;

       long nn = n;
       if(n<0){
        nn = nn * -1;
       }
       if(n<0){
        return 1 / helper(x,nn);
       }
       return helper(x,nn);

    }
    static double helper(double x, long n){

      if(n == 0) return 1.0;
    double half = helper(x, n/2);
    if(n % 2 == 0) return half * half;
    return half * half * x;
    }
}