int main() {
	int arr[100] = { 0 };
	int count;
	int num;
	int pricount = 0;

	scanf("%d", &count);
	for (int i = 0; i < count; i++) {
		scanf("%d", &arr[i]);
	}

	scanf("%d", &num);
	for (int i = 0; i < count; i++) {
		if (arr[i] == num) {
			++pricount;
		}
	}
	printf("%d", pricount);
	return 0;
}