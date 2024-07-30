#include<bits/stdc++.h>
using namespace std;
void max_till_i(int n,int a[])
{
    int mx=-99999;
    for(int i=0;i<n;i++)
    {
        mx=max(a[i],mx);
        cout<<mx<<" ";
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
    max_till_i(n,a);
}