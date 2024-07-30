#include<bits/stdc++.h>
using namespace std;
void sort(int n,int a[])
{
    int te,k=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                te=a[j];
                a[j]=a[j+1];
                a[j+1]=te;
                k=1;
            }
        }
        if(k==0)
        {
            break;
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}
void insertion_sort(int n,int a[])
{
    for(int i=1;i<n;i++)
    {
        int j=i-1;
        int curr=a[i];
        while (a[j]>curr && j>=0)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=curr;
        
    }
    for ( int k = 0; k < n; k++)
    {
        
        cout<<a[k]<<" ";
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
    cout<<" "<<endl;
    insertion_sort(n,a);
}