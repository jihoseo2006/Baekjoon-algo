#include <stdio.h>

int main() {
	int n, a, b = 0;
	scanf("%d %d %d", &n, &a, &b);
	if (b > a) {
		printf("Bus");
	}
	else if (a > b) {
		printf("Subway");
	}
	else if (a == b) {
		printf("Anything");
	}
	return 0;
}