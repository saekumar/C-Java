#include<iostream>
#include<cmath>
using namespace std;

void check(int n, bool arr[])
{
    // Initialize all elements of the arr to true
    for (int i = 0; i <= n; i++)
    {
        arr[i] = true;
    }

    // Mark multiples of each number as non-prime
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (arr[i])
        {
            for (int j = i * i; j <= n; j += i)
            {
                arr[j] = false;
            }
        }
    }

    // Print prime numbers
    for (int i = 2; i <= n; i++)
    {
        if (arr[i])
        {
            cout << i << " ";
        }
    }
    cout << endl;
}

int main()
{
    int a;
    cin >> a;
    bool arr[a + 1];
    check(a, arr);

    return 0;
}
