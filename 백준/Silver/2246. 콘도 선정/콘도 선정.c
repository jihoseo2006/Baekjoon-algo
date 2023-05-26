#include<stdio.h>
int N, D[10001], C[10001], cnt;
int main()
{
    int i, j;
    scanf("%d", &N);
    for (i = 1; i <= N; i++)
    {
        scanf("%d%d", &D[i], &C[i]);
    }
    for (i = 1; i <= N; i++)
    {
        int flag = 0;
        for (j = 1; j <= N; j++)
        {
            if (i == j) continue;
            if (D[i]>D[j])
            {
                if (C[i] >= C[j])
                {
                    flag = 1;
                    break;
                }
            }
            else if (C[i]>C[j])
            {
                if (D[i] >= D[j])
                {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
        {
            cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}