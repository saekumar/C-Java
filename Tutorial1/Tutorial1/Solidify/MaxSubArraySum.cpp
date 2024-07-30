#include<bits/stdc++.h>
using namespace std;
int check(int n,int arr[],int tar)
{
    int st =0,end =0,currSum =0,ans =0;
    while(end<n)
    {
        currSum+=arr[end];
        while(currSum>tar)
        {
            currSum-=arr[st++];
        }
        ans = max(ans,(end-st+1));
      end++;
    }
    return ans;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int tar ;
    cin>>tar;
    cout<<check(n,arr,tar)<<endl;
}