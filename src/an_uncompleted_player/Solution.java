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
