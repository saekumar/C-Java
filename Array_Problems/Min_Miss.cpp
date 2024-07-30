#include<bits/stdc++.h>
using namespace std;

int Min(int ar[],int n)
{
    int a[100];
    for(int i=0;i<100;i++)
    {
        a[i]=0;
    }
    for(int i=0;i<n;i++)
    {
        if(ar[i]>=0)
        {
            a[ar[i]]=1;

        }
    }
    for(int i=0;i<100;i++)
    {
        if(a[i]==0)
        {
            return i;
            break;
        }
    }
    return -1;
}

int main()
{
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
    {
        cin>>ar[i];
    }
   int k= Min(ar,n);
   cout<<k<<endl;
}