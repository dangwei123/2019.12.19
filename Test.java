求出大于或等于 N 的最小回文素数。

回顾一下，如果一个数大于 1，且其因数只有 1 和它自身，那么这个数是素数。

例如，2，3，5，7，11 以及 13 是素数。

回顾一下，如果一个数从左往右读与从右往左读是一样的，那么这个数是回文数。

例如，12321 是回文数。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/prime-palindrome
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int primePalindrome(int N) {
        if(N==1){
            return 2;
        }
        for(;;N++){
            if(palid(N)&&isPrim(N)){
                return N;
            }
            if(N>=10000000&&N<=100000000){
                N=100000000;
            }
        }
    }
    private boolean palid(int N){
        int sum=0;
        int n=N;
        while(n!=0){
            sum=sum*10+n%10;
            n/=10;
        }
        return sum==N;
    }

    private boolean isPrim(int N){
        int m=(int)Math.sqrt(N);
        int i=0;
        for(i=2;i<=m;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}