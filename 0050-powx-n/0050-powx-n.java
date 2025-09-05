class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        if(exp>0)
        return pow(x, exp);
        else
        return 1/pow(x, exp*-1);
    }

    private double pow(double x, long n) {
        double result=1;
        while(n!=0){
            if(n%2!=0){
                result*=x;
                n--;
            }
            else{
                x*=x;
                n/=2;
            }
        }
        return result;
    }
}