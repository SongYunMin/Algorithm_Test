package PhoneNumber;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        for(int i=0;i<phone_book.length;i++){
            for(int j=0;j<phone_book.length;j++){
                if(i!=j && !phone_book[i].equals(phone_book[j])){
                    if(phone_book[i].indexOf(phone_book[i])
                            <= phone_book[j].indexOf(phone_book[i])){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        String[] str1={"119","97674223","1195524421"};
        String[] str2={"123","456","789"};
        String[] str3={"12","123","1235","567","88"};

        s.solution(str2);
    }
}