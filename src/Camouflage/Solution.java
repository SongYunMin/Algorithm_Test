package Camouflage;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> clothesMap = new HashMap<>(); // 종류 : 갯수

        for (int i = 0; i < clothes.length; i++) {
            // 종류 여부 판단. 같은 종류 일 경우 Value + 1
            // getOrDefault : 찾는 키가 존재 한다면 찾는키의 값을 반환, 없으면 디폴트 값
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }

        // 경우의 수 체크 answer *= (옷 가지수 + 안 입을 경우)
        for (int val : clothesMap.values()){
            answer *= (val+1);
        }

        // 모두 다 안입는 경우는 존재하지 않으므로 -1
        return answer-1;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        String[][] str = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        s.solution(str);
    }
}


