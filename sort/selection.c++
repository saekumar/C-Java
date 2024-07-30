#include<bits/stdc++.h>
using namespace  std;
void sort(int n,int a[])
{
    int te=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[i])
            {
                te=a[i];
                a[i]=a[j];
                a[j]=te;
                

            }
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<endl;
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
    sort(n,a);
}
