#include <stdio.h>
int main() {
  int n;
  scanf("%d", &n);
  int t=n,sum=n%10;
  while(!(t<10))
    t/=10;
  printf("%d",sum+t);
	return 0;
}