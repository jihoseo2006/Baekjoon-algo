#include <stdio.h>

int main() {
	int num;
	scanf("%d", &num);
	for (int i = 1; i <= num; i++) {
		for (int j = num-i; j > 0; j--) printf(" ");
		for (int k = i * 2 - 1;k > 0; k--) printf("*");
		printf("\n");
	}
	for (int i = num -1; i>0; i--) {
		for (int j = num - i; j > 0; j--) printf(" ");
		for (int k = i * 2 - 1; k > 0; k--) printf("*");
		printf("\n");
	}
	return 0;
}