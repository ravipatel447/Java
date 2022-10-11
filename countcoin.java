import java.util.Scanner;

public class countcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public static long count(int coins[], int n, int sum) {
        long dp[][] = new long [n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j] = -1;
            }
        }
        return countdp(coins,n,sum,dp);
    }
    public static long countdp(int coins[], int n, int sum,long dp[][]) {
        if(sum==0){
            return dp[n][sum]=1;
        }
        if(sum<0){
            return 0;
        }
        if(n<=0){
            return 0;
        }
        if(dp[n][sum]==-1){
            dp[n][sum] = countdp(coins,n-1,sum,dp)+countdp(coins,n,(sum-coins[n-1]),dp);
            return dp[n][sum];
        }
        else{
            return dp[n][sum];
        }
    }
}
