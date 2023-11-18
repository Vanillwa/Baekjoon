class Solution {
    public double solution(int[] numbers) {
        double sum=0;
        for(int i : numbers){
            sum += i;
        }
        double avg = sum/numbers.length;
        return avg;
    }
}