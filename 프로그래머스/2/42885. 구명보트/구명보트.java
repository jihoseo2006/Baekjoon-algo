import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        // 몸무게가 작은 사람부터 차례로 정렬
        Arrays.sort(people);
       int answer = 0;
        //왼쪽 끝, 오른쪽 끝 선언
       int left = 0;
       int right = people.length - 1;
        
        //왼쪽 끝의 배열값 + 오른쪽 끝의 배열값 <= limit일때가 최적의 경우다
        //남은 사람이 한명(하나만 남았을때, 그 사람은 혼자 태워 보내면 돤다!)이 될때까지 
        //아래 과정을 반복한다.
       while (left <= right) {
           if (left == right) { // (남은 사람이 한 명일 때)
               answer++;
               break; //반복문 탈출(계산 종료)
           }
           //왼쪽 끝의 배열값 + 오른쪽 끝의 배열값 > limit일때 right의 몸무계 값은 
        //어느 left와도 조합이 불가능하기에 right의 사람 한명만 혼자 구명보트에 태워 보낸다.
           if (people[left] + people[right] > limit) {
               answer++;
               right--;
           } else {
               //최적의 경우, 둘다 태워 보낸 다음 왼쪽, 오른쪽 사람을 불러온다.
               answer++;
               left++;
               right--;
           }
       }
        return answer;
    }
}

