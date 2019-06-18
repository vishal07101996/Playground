#include <stdio.h>
#include<math.h>
int main() {
  int n,t;
  scanf("%d", &n);
  int dig=0;
  t=n;
  while(t!=0)
  {
    t/=10;
    dig++;
  }
  while(dig-- !=2)
    n/=10;
  printf("%d", n%10);
	return 0;
}