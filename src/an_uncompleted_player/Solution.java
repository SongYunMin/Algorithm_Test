package an_uncompleted_player;

import java.util.*;

// participant = 전체 선수, completion = 완주한 선수
// completion 은 participant 보다 길이가 1 작음
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i=0;
        for(i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}


// 다른 사람의 풀이

//class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//
//        for(int i =0; i<phone_book.length; i++){
//            for(int j =0; j<phone_book.length; j++){
//                if(i == j) continue;
//                if(phone_book[j].indexOf(phone_book[i])==0){//접두어라면
//                    return false;
//                }
//            }
//        }
//
//        return answer;
//    }
//}
