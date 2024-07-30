#include <iostream>
#include <vector>

using namespace std;

int findStartingDungeon(int n, const vector<int>& energies, const vector<int>& drinks) {
    int total_energy = 0; // Total energy obtained from all drinks
    int current_energy = 0; // Current energy level

    // Find the total energy available from all the drinks
    for (int i = 0; i < n; i++) {
        total_energy += drinks[i];
    }

    // Check for each starting dungeon
    for (int start = 0; start < n; start++) {
        current_energy = total_energy; // Start with full energy
        bool success = true;

        for (int i = 0; i < n; i++) {
            int dungeon = (start + i) % n;
            if (current_energy < energies[dungeon]) {
                success = false;
                break;
            }

            // Use the minimum energy required to defeat the dragon
            current_energy = max(current_energy - energies[dungeon], 0);
        }

        if (success) {
            return start + 1; // Return 1-based index of the starting dungeon
        }
    }

    return -1; // If no starting dungeon allows the prince to defeat all the dragons
}

int main() {
    int T;
    cin >> T;

    for (int t = 0; t < T; t++) {
        int N;
        cin >> N;

        vector<int> energies(N);
        vector<int> drinks(N);

        for (int i = 0; i < N; i++) {
            cin >> energies[i];
        }

        for (int i = 0; i < N; i++) {
            cin >> drinks[i];
        }

        int starting_dungeon = findStartingDungeon(N, energies, drinks);
        cout << starting_dungeon << endl;
    }

    return 0;
}
