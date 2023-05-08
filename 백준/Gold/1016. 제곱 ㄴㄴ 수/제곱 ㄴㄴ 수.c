#include<stdio.h>
#include<math.h>

int vec[1000001] ={0};
int main(){
    long long min,max;
    long long tax,ze,j,c=0;
    scanf("%lld %lld",&min,&max);
    
    tax = sqrt(max);
    
    for(long long i =2; i<=tax; i++){
        ze = i*i;
        j = ceil((double)min/ze) * ze;
        for(; j<=max; j+=ze){
            vec[j-min] = 1;
        }
    }
    for(long long i =min; i<=max; i++){
        if(vec[i-min]) c++;
    }
    printf("%lld",max - min + 1 - c);
    return 0;
}