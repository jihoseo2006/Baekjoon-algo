import java.util.*;  
  
class Solution {  
  
    public int solution(int[] numbers, int target) {  
        int answer = 0;  //정답을 저장할 변수 초기화
        Queue<Integer> queue = new LinkedList<>(); //BFS 탐색용 큐 생성 
        queue.add(0);  //초기값 0을 큐에 삽입
        //numbers 배열의 각 요소를 순회
        for (int i = 0; i < numbers.length; i++) {  
            int size = queue.size();  //현제 큐의 크기 저장
            //큐에 있는 모든 요소를 꺼내서 처리하기
            for (int j = 0; j < size; j++) {  
                int sum = queue.poll();   //큐에서 요소 꺼내기
                //꺼낸 요소에 현제 숫자를 더한 값과 뺀 을 추가
                queue.add(sum + numbers[i]);  
                queue.add(sum - numbers[i]);  
            }  
        }  
        
        while (!queue.isEmpty()) {  
            //큐에서 꺼낸 값이 목표 값(target)과 같으면 answer 증가
            if (queue.poll() == target) {  
                answer++;  
            }  
        }  
        return answer;  
    }  
}