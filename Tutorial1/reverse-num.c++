#include<iostream>
#include<cmath>
using namespace std;

int no_of_digits(int n)
{
    int c=0;
    while(n>0)
    {
        n/=10;
        c++;
    }
    return c;
}
int check(int n)
{
    int k=no_of_digits(n);
    int sum=0;
    int rem=0;
    while(n>0)
    {
        rem=n%10;
        sum+=rem*pow(10,k-1);
        k--;
        n/=10;
    }
    return sum;
}
int main()
{
    int n;
    cin>>n;
    int reverse=check(n);
    cout<<reverse<<endl;
}