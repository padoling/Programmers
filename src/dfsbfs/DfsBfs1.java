/**
 * 네트워크
 */
package dfsbfs;

public class DfsBfs1 {
    public static void main(String[] args) {
        int [][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        int n = 3;

        int answer = new Solution().solution(n, computers);
        System.out.println(answer);
    }
}

class Solution {

    static boolean link[];

    public int solution(int n, int[][] computers) {
        int answer = 0;
        link = new boolean[n];
        for(int index=0; index<n; index++) {
            if(link[index] == false) {
                answer++;
                dfs(computers, n, index);
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, int n, int index) {
        link[index] = true;
        for(int i=0; i<n; i++) {
            if(computers[index][i] == 1 && link[i] == false) {
                dfs(computers, n, i);
            }
        }
    }
}