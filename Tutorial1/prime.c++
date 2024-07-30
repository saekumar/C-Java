#include<iostream>
#include<cmath>
using namespace std;

int check(int n)
{
    int c=0;

    for(int i=2;i<n/2;i++)
    
    {
        if(n%i==0)
        {
            c++;

        }        

    }
    cout<<c<<endl;
    return c;
}
int main()
{
    int n;
    cin>>n;
    int h=check(n);
    if(h==0)
    {
        cout<<"prime"<<endl;
    }
    else{
        cout<<"composite"<<endl;
    }
}