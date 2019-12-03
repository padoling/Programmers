package skillcheck;

public class SkillCheck1_1 {
    boolean solution(String s) {
        boolean answer = true;
        int numP = 0;
        int numY = 0;
        
        int len = s.length();
        
        for(int i=0; i<len; i++) {
        	if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
        		numP++;
        	} else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
        		numY++;
        	}
        }
        
        if(numP != numY) {
        	answer = false;
        }

        System.out.println(answer);

        return answer;
    }
}