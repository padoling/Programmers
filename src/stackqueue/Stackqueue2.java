/**
 * 프린터
 */

package stackqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Stackqueue2 {
    public int solution(int[] priorities, int location) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority : priorities) {
            priorityQueue.offer(priority);
        }

        int index = 0;
        int count = 1;
        while(!priorityQueue.isEmpty()) {
            if(index == priorities.length) {
                index = 0;
            }
            if(priorityQueue.peek() == priorities[index]) {
                if(index == location) {
                    return count;
                }
                priorityQueue.poll();
                priorities[index] = 0;
                count++;
            }
            index++;
        }
        return count;
    }
}

