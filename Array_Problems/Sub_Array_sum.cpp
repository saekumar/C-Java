#include<bits/stdc++.h>
using namespace std;

void sub_array_sum(int n,int a[])
{
    int sum;
    for (int i = 0; i < n; i++)
    {
       sum=0;
        for (int j = i; j < n; j++)
        {
            sum+=a[j];
            cout<<sum<<" ";
        }
    
        
    }
    
}

int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    sub_array_sum(n,a);
}