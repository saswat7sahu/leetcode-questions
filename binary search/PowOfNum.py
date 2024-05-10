class Solution(object):
    def myPow(self, x, n):
        if(n<0):
            n=-n;
            x=1/x;
        if (n==0):
            return 1;
        if (n%2==0):
            value=self.myPow(x, n/2);
            return value*value;
        else:
            value=self.myPow(x, n/2);
            return value*value*x;