package dp;


// a[i][j] = max( a[i-1][j], p[i] + a[i-1][j - w[i]] )

/*
 *  target = 8 Kg
 * 
 *   pft[i]    wt[i]
 * ---------------
 *   2       3
 *   3       4
 *   4       5
 *   1       6
 */


public class Knapsack01 {
    public int calc(int pftSet[], int[] wtSet, int target){
        int[][] a = new int[wtSet.length + 1][target + 1];

        for(int i = 0; i < a.length; i++){
            a[i][0] = 0;
        }

        System.out.println(); 

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(); 
        }

        for(int i = 1; i < a.length; i++){
            for(int j = 1; j < a[i].length; j++){

                if(wtSet[i-1] > j)
                    a[i][j] = a[i-1][j];
                else
                    a[i][j] = Math.max( a[i-1][j], pftSet[i-1] + a[i-1][j - wtSet[i-1]] );
                
            }
        }


        System.out.println("\n\n\n\n"); 

        for (int i = 0; i < a.length; i++) {
            // System.out.print(coinSet[i] + " => ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(); 
        }

        return a[wtSet.length-1][target];
    }

}
