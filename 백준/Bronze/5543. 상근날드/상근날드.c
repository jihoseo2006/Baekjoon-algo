#include <stdio.h>

int main() {
	int ham[3] = { 0 };
	int dri[2] = { 0 };
	int hamtemp = 0;
	int drinktemp = 0;
	for (int i = 0; i < 3; i++) {
		scanf("%d", &ham[i]);
	}
	for (int j = 0; j < 2; j++) {
		scanf("%d", &dri[j]);
	}
	hamtemp = ham[0];
	for (int i = 1; i < 3; i++) {
		if (hamtemp > ham[i]) {
			hamtemp = ham[i];
		}
	}
	drinktemp = dri[0];
	if (drinktemp >= dri[1]) {
		drinktemp = dri[1];
	}

	printf("%d", (hamtemp + drinktemp) - 50);
	return 0;
}