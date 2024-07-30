#include<bits/stdc++.h>
using namespace std;
int f1(int n)
{
    vector<int> dp(n+1,-1);
    if(n<=1)
    {
        return n;
    }
    return dp[n]=f1(n-1)+f1(n-2);
}
int f2(int n)
{
    vector<int> dp(n+1); 
    dp[0] = 0;
    dp[1] = 1;
    for(int i=2;i<n+1;i++)
    {
        dp[i] = dp[i-1]+dp[i-2];
    }
    return dp[n];
}
int main()
{
    int n;
    cin>>n;
    vector<int> dp(n+1,-1);
    cout<<f1(n);
    return 0;
}