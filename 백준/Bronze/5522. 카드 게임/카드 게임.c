#include <stdio.h>

int main() {
	int arr[5] = { 0 };
	int temp = 0;
	for (int i = 0; i < 5; i++) {
		scanf("%d", &arr[i]);
	}
	for (int i = 0; i < 5; i++) {
		temp += arr[i];
	}
	printf("%d", temp);

	return 0;
}