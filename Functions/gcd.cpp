#include<bits/stdc++.h>
using namespace std;
 int gcd(int x,int y)
 {
    int  i=min(x,y);
    int j=max(x,y);
    int k=0;
    while(k!=1)
    {
        k=j%i;
        if(k==0)
        {
            return i;
        }
        else{
            j=i;
            i=k;
            
        }
    }
    return 1;
 }
 int main()
 {
    int a,b;
    cin>>a>>b;
    cout<<gcd(a,b)<<endl;
 }
