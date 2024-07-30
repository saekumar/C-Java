// given an array and traget...we have to print ceil of given target in array.
#include<iostream>
using namespace std;
int ceill(int n,int a[],int tar)
{
    
    int st=0,end=n-1;
    int mid=0;
    while(st<=end)
    {
        mid=st+(end-st)/2;
        if(a[mid]==tar)
        {
            return mid;
        }
        else if(a[mid]<tar)
        {
            st=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return st;

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
    int tar;
    cin>>tar;
    int k=ceill(n,a,tar);
    cout<<k<<endl;
}