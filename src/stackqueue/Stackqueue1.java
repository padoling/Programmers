package stackqueue;

import java.util.Stack;

public class Stackqueue1 {
    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};
        int[] answer = new Solution().solution(heights);
        for(int a : answer) {
            System.out.println(a);
        }
    }
}

class Solution {
    public int[] solution(int[] heights) {
        int len = heights.length;
        int[] answer = new int[len];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        answer[0] = 0;
        for(int i=1; i<len; i++) {
            while(!stack.empty()) {
                if(heights[stack.peek()] <= heights[i]) {
                    stack.pop();
                } else {
                    answer[i] = stack.peek()+1;
                    break;
                }
            }
            stack.push(i);
        }
        return answer;
    }
}