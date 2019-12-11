/**
 * k번째수
 */

package sort;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] answer = new Solution().solution(array, commands);
        for(int a : answer) {
            System.out.println(a);
        }
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIndex = 0;

        for(int[] command : commands) {

            int[] tempArray = new int[command[1]-command[0]+1];
            int arrayIndex = command[0]-1;
            for(int index=0; index<tempArray.length; index++) {
                tempArray[index] = array[arrayIndex];
                arrayIndex++;
            }

            Arrays.sort(tempArray);
            answer[answerIndex] = tempArray[command[2]-1];
            answerIndex++;
        }

        return answer;
    }
}