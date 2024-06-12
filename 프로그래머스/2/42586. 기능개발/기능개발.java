import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 작업의 남은 진도를 저장할 큐
        Queue<Integer> proQueue = new LinkedList<>(); 
        
        // 각 작업의 남은 진도를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                days++;
            }
            proQueue.add(days);
        }
        
        // 각 배포마다 몇 개의 기능이 배포되는지를 저장할 리스트
        List<Integer> answerList = new ArrayList<>(); 
        
        while (!proQueue.isEmpty()) {
            int currentDay = proQueue.poll();
            int count = 1;
            
            // 큐에서 현재 작업보다 빨리 끝나는 작업들을 함께 배포
            while (!proQueue.isEmpty() && proQueue.peek() <= currentDay) {
                proQueue.poll();
                count++;
            }
            
            answerList.add(count); // 배포된 작업의 수를 리스트에 추가
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}