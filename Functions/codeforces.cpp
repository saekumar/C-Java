#include<bits/stdc++.h>
using namespace  std;
int main()
{

    int t;
    cin>>t;
    while(t--)
    {
        int a,b,c,sa,yz;
        cin>>a>>b>>c>>sa>>yz;
        int es=0;
        for(int i=0;i<c;i++)
        {
            int ix,iy;
            cin>>ix>>iy;
            int da=abs(sa-ix);
            int db=abs(yz-iy);
            if((da+db)%2==0)
            {
                es=1;
            }

        }
        if(es==1)
        {
            cout<<" yes\n";
        }
        else{
            cout<<"NO\n";
        }
        return 0;
    }
} 
