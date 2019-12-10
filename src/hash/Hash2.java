/**
 * 전화번호 목록
 */

package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
    public static void main(String[] args) {
        String[] phone_book = {"123", "456", "789"};
        boolean answer = new Solution().solution(phone_book);
        System.out.println(answer);
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> hashMap = new HashMap<>();

        for(String number : phone_book) {
            if(hashMap.containsKey(number)) {
                answer = false;
                return answer;
                }
            hashMap.put(number, 1);
        }

        int len = 0;
        for(String number : phone_book) {
            len = number.length();
            for(int i=1; i<len; i++) {
                if(hashMap.containsKey(number.substring(0,i))) {
                    answer = false;
                    return answer;
                }
            }
        }

        return answer;
    }
}
