#include<bits/stdc++.h>
using namespace std;
int sum(int n,int a[],int tar)
{
    int st=0,end=0,sum=0;
    while(st<end)
    {
        while(sum<tar)
        {
            sum+=a[end];
            end++;

        }

    }
}
int main()
{
    int n,tar;
    cin>>n>>tar;
    int ar[n];
    for (int i = 0; i < n; i++)
    {
      cin>>ar[i];
    }
    sum(n,ar,tar);
    
}
