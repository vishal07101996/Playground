#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  printf("%d", ((a/100)+(a%10)));
  return 0;
}