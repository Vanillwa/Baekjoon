class Solution {
    public int solution(int[] dot) {
        int res;
        if(dot[0]>0){
            if(dot[1]>0)
                res = 1;
            else
                res = 4;
        }else{
            if(dot[1]>0)
                res = 2;
            else
                res = 3;
        }
        return res;
    }
}