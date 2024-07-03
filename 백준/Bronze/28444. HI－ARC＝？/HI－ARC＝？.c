# include <stdio.h>

int main() {
    int a,b,c,d,e = 0;
    scanf("%d %d %d %d %d", &a, &b,&c,&d,&e);
    printf("%d", (a*b) - (c*d*e));
    return 0;
}