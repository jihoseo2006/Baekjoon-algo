#include <stdio.h>
int main() {
   int tc, a, b, tm;
   scanf("%d", &tc);
   for (int i = 0; i < tc; i++) {
      scanf(" %d %d", &a, &b);
      tm = 1;
      for (int j = 0; j < b; j++) {
         tm = (tm * a) % 10;
      }
      if (tm == 0) {
         tm += 10;
      }
      printf("%d\n", tm);
   }
   return 0;
}