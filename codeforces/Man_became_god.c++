
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n, k;
        cin >> n >> k;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        vector<int> ar(n - 1);
        for (int i = 1; i < n; i++) {
            ar[i - 1] = abs(arr[i] - arr[i - 1]);
        }
        sort(ar.begin(), ar.end());
        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            sum += ar[i];
        }
        cout << sum << endl;
    }
    return 0;
}