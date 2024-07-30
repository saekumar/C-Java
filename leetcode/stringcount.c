#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    char ar[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",ar[i]);
    }
    int arr[26];
    for(int i=0;i<n;i++)
    {
        arr[ar[i]-'a']++;
    }
    for(int i=0;i<n;i++)
    {
        if(arr[ar[i]-'a']==1)
        {
            printf("%d",i);
            break;
        }
    }
}