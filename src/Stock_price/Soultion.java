package Stock_price;

class Solution {
    // prices : 초 단위로 기록된 주식가격
    // answer : 가격이 떨어지지 않은 기간을 담을 배열
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;

        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length-1;j++){
                if(prices[i] <= prices[j+1]){
                    count++;
                    if(j == prices.length-2){
                        answer[i] = count;
                        count=0;
                        break;
                    }
                }else{
                    count++;
                    answer[i] = count;
                    count=0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int[] test = {1,2,3,2,3};
        s.solution(test);

    }
}