#include <stdio.h>

int main() {
	int arr[6] = { 1,1,2,2,2,8 };
	int curarr[6] = { 0 };
	for (int i = 0; i < 6; i++) {
		scanf("%d", &curarr[i]);
	}
	for (int i = 0; i < 6; i++) {
		if (arr[i] != curarr[i]) {
			printf("%d ", arr[i] - curarr[i]);
		}
		else {
			printf("0 ");
		}
	}
}