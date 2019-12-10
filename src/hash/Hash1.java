/**
 * 완주하지 못한 선수
 */

package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        for(String key : participant) {
        	if(hashMap.containsKey(key)) {
				// 동명이인일 경우
        		hashMap.put(key, hashMap.get(key)+1);
        	} else {
        		hashMap.put(key, 1);
        	}
        }

        for(String key : completion) {
        	if(hashMap.containsKey(key)) {
        		hashMap.put(key, hashMap.get(key)-1);
        	}
        }
        
        for(String key : hashMap.keySet()) {
        	if(hashMap.get(key) != 0) {
				answer = key;
			}
        }
        
        return answer;
	}
}
