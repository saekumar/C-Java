package Tutorial1.Greedy;
import java.util.*;

public class JobSequencingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            Job job = new Job(id, deadline, profit);
            arr[i] = job;
        }
        int totalProfit = JobSequencing(arr, n);
        for (int i = 0; i < arr.length; i++) {
            Job job = arr[i];
            System.out.print(job.id + " " + job.deadline + " " + job.profit);
            System.out.println();
        }
        System.out.println(totalProfit);
        sc.close();
    }

    public static int JobSequencing(Job[] arr, int n) {
        Arrays.sort(arr); // Sort jobs by profit in descending order
        int maxDeadline = 0;

        for (Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] brr = new int[maxDeadline + 1]; // Slot array
        Arrays.fill(brr, -1); // Initialize all slots to -1
        int sum = 0;

        for (Job job : arr) {
            for (int j = job.deadline; j > 0; j--) {
                if (brr[j] == -1) { // If slot is free
                    brr[j] = job.id; // Assign job to slot
                    sum += job.profit; // Add profit
                    break; // Job scheduled, exit loop
                }
            }
        }
        return sum;
    }
}

class Job implements Comparable<Job> {
    int id;
    int deadline;
    int profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Job other) {
        return other.profit - this.profit; // Descending order
    }
}
