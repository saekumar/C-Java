#include<bits/stdc++.h>
using namespace std;


int main()
{
    int n;
    cin>>n;
    int a[n+1];
    a[n+1]=-1;
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }
    int mx=-1,c=0;
    for(int i=0;i<n+1;i++)
    {
        if(a[i]>mx && a[i]>a[i+1])
        {
           c++;
        }
        mx=max(mx,a[i]);

    }
    cout<<c<<endl;
    
}
