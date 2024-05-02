package dp;

public class CoinMinWays {

    public int calc(int sum, int[] coinSet){
        int[][] a = new int[coinSet.length][sum+1];

        for(int i = 0; i < a.length; i++){
            a[i][0] = 0;
        }

        for(int i = 1; i < a[0].length; i++)
			a[0][i] = i;

        System.out.println(); 

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(); 
        }

        for(int i = 1; i < a.length; i++){
            for(int j = 1; j < a[i].length; j++){

                if(coinSet[i] > j)
                    a[i][j] = a[i-1][j];    // if coin value > sum, copy above value
                else if(coinSet[i] == j)
                    a[i][j] = 1;
                else
                    a[i][j] = Math.min(a[i-1][j], a[i][j - coinSet[i]] + 1);
                
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

        return a[coinSet.length-1][sum];
    }


}
