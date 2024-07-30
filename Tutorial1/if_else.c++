#include<iostream>
using namespace std;

string odd_even(int n)
{
    if(n%2==0)
    {
        return "even";
    }
    else{
        return "odd";
    }
   

}
int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    string k=odd_even(a);
    cout<<k<<endl;

    

    return 0;

}