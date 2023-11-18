class Solution {
    public int solution(int n) {
        int res;
        if(n%7==0)
            res = n/7;
        else
            res = n/7+1;
        return res;
    }
}