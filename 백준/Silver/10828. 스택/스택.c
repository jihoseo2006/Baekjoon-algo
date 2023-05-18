#include <stdio.h>
 
int stack[100001];
int cnt = 0;
 
void push(int n){
    stack[cnt] = n;
    cnt++;
}
 
void pop(){
    if(cnt!=0){
        cnt--;
        printf("%d\n", stack[cnt]);
        stack[cnt] = 0;
    }else{
        printf("%d\n", -1);
    }
}
 
void top(){
    if(cnt!=0){
        printf("%d\n", stack[cnt-1]);
    }else{
        printf("%d\n", -1);
    }
}
 
void empty(){
    if(cnt!=0){
        printf("0\n");
    }else{
        printf("1\n");
    }
}
 
void size(){
    printf("%d\n", cnt);
}
 
int main(){
    int stackSize;
    char order[10];
    scanf("%d", &stackSize); // stack 크기 저장.
    int stack[stackSize]; // 입력한 숫자의 stack배열 생성
    
    for(int i=0; i<stackSize; i++){
        scanf("%s", &order);
        if(!strcmp(order, "push")){
            int n;
            scanf("%d", &n);
            push(n);
        }else if(!strcmp(order, "top")){
            top();
        }else if(!strcmp(order, "size")){
            size();
        }else if(!strcmp(order, "empty")){
            empty();
        }else{
            pop();
        }
    }
    
}
