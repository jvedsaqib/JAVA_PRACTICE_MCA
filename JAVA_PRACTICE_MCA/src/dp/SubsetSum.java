package dp;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    static List<Integer> findSubset(int[] set, int n, int sum) {
        boolean[][] subset = new boolean[sum + 1][n + 1];

        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
            }
        }

        List<Integer> subsetValues = new ArrayList<>();
        if (subset[sum][n]) {
            int j = n;
            int remainingSum = sum;
            while (j > 0 && remainingSum > 0) {
                if (subset[remainingSum][j - 1]) {
                    j--;
                } else {
                    subsetValues.add(set[j - 1]);
                    remainingSum -= set[j - 1];
                    j--;
                }
            }
        }
        return subsetValues;
    }

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        List<Integer> subset = findSubset(set, n, sum);
        if (!subset.isEmpty()) {
            System.out.println("Subset with sum " + sum + " found:");
            System.out.println(subset);
        } else {
            System.out.println("No subset with sum " + sum + " found");
        }
    }
}

