
#include <iostream>
#include <vector>
#define MOD 1000000007


using namespace std;

long long p(long long x, unsigned int y, long long m) {
    long long res = 1;
    x = x % m;
    while (y > 0) {
        if (y & 1)
            res = (res * x) % m;
        y = y >> 1;
        x = (x * x) % m;
    }
    return res;
}


long long f(int n, int k, long long b, long long r) {
    vector<long long> dp(n + 1, 0);
    dp[0] = 1;
    
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= k; ++j) {
            if (i - j >= 0) {
                dp[i] = (dp[i] + dp[i - j] * b % MOD) % MOD;
            }
        }
    }

    long long ans = 0;
    for (int i = 0; i <= n; ++i) {
        ans = (ans + dp[i] * p(r, n - i, MOD)) % MOD;
    }


    return ans;
}

int main() {
    int n, k;
    long long b, r;
    
    cin >> n;
    cin >> k;
    cin >> b;
    cin >> r;

    cout << f(n, k, b, r) << endl;
    
    return 0;
}
