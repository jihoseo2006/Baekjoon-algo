#include<stdio.h>

//전역변수 - 재귀 반복 회수 
int N;


//재귀함수 진행하면서 _를 출력하기 위한 부분
void func(int cnt){
    for(int i = 0 ; i < cnt*4;i++){
    printf("_");
    }
}

//재귀 함수 부분
void solve(int cnt){
    
    //종료 부분
    if(cnt == N ){
        func(cnt);
        printf("\"재귀함수가 뭔가요?\"\n");
        func(cnt);
        printf("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
        func(cnt);
        printf("라고 답변하였지.\n");
        return;
    }

    //계속해서 반복회수에 따른 _및 반복 부분을 출력한다.
    func(cnt);
    printf("\"재귀함수가 뭔가요?\"\n");
    func(cnt);
    printf("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
    func(cnt);
    printf("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
    func(cnt);
    printf("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
    
    //***** 반복 부분이후 재귀함수로 다시 반복부분을 호출한다 ****//
    solve(cnt+1);
    func(cnt);
    printf("라고 답변하였지.\n");
}


// main함수
int main(){
    //재귀 회수 입력
    scanf("%d",&N);
    
    
    //초기문 출력
    printf("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
    
    //재귀 함수 시작
    solve(0);
    
    return 0;
}