#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        vector<int> a(n);

        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }

        vector<int> result(n, -1); // Initialize the result array with -1
        vector<int> sorted_a = a; // Make a copy of the original sequence to sort

        sort(sorted_a.begin(), sorted_a.end());

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = sorted_a[left++];
            } else {
                result[i] = sorted_a[right--];
            }
        }

        // Check if the rearranged sequence satisfies the conditions
        bool valid = true;
        for (int i = 1; i < n - 1; i++) {
            if (!((result[i - 1] < result[i] && result[i] > result[i + 1]) ||
                  (result[i - 1] > result[i] && result[i] < result[i + 1]))) {
                valid = false;
                break;
            }
        }

        if (valid) {
            for (int i = 0; i < n; i++) {
                cout << result[i] << " ";
            }
            cout << endl;
        } else {
            cout << "-1" << endl;
        }
    }

    return 0;
}
