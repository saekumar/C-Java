#include<iostream>
using namespace std;

int fact(int n)
{
    int k=1;
    for(int i=2;i<=n;i++)
    {
        k*=i;
    }
    return k;
}


int main()
{
    int n,r;
    cin>>n>>r;
    int a=fact(n);
    int b=fact(n-r);
    int c=fact(r);
    int ncr=a/(b*c);
    cout<<ncr<<endl;
}