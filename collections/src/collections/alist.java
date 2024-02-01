/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    
	int n, v;
	scanf("%d" &n);
	int arr[n];
	for (int i = 0; i < n; i++) {
	scanf("%d",arr[i]);
	}
	int split;
	scanf("%d",&split);
	int out1 = 0, out2 = 0;
	for (int i = 0; i <= split; i++) {
		out1 = out1 * 10 + arr[i];
	}
	for (int i = split + 1; i < num; i++) {
		out2 = out2 * 10 + arr[i];
	}
	int res = out1 + out2;
printf("%d",res);
    return 0;
}
