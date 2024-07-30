#include<bits/stdc++.h>
using namespace std;
// Function 1: return 1 st repeated element.          Ex:-1 3 5 7 5 3 9 ----->output:-5
// Function 2:return 1 st element that was repeated.  Ex:-1 3 5 7 5 3 9------>output:-3
int function1(int n,int a[])
{
    int b[100];
    for(int i=0;i<100;i++)
    {
        b[i]=-1;
    }
    int minidx=INT_MAX;
    for(int i=0;i<n;i++)
    {
        if(b[a[i]]!=-1)
        {
            // minidx=min(minidx,b[a[i]]);
             return b[a[i]]+1;
          
        }
        else{
            b[a[i]]=i;
        }
    }
    return -1;

}
int function2(int n,int a[])
{
    int b[100];
    for(int i=0;i<100;i++)
    {
        b[i]=-1;
    }
    int minidx=INT_MAX;
    for(int i=0;i<n;i++)
    {
        if(b[a[i]]!=-1)
        {
             minidx=min(minidx,b[a[i]]);
             //return b[a[i]]+1;
          
        }
        else{
            b[a[i]]=i;
        }
    }
    return minidx+1;

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
    cout<<function1(n,ar)<<endl<<function2(n,ar)<<endl;
}