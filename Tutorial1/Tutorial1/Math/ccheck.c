#include<stdio.h>
int main()
{
    int n = 100012;
    int arr[10];
    for(int i=0;i<10;i++)
    {
        // arr[i] = 0;
    }
    while(n>0)
    {
        int rem = n%10;
        arr[rem] +=1; 
        n/=10;
    }
    for(int i=0;i<10;i++)
    {
        printf("%d %d\n",i,arr[i]);
    }
}