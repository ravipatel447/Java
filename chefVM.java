import java.util.*;

public class chefVM {
    public static void main(String[] args) {
        int n =31623;
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        ArrayList<Long> pri = new ArrayList<>();
        for (int p = 2; p * p <= n; p++)
        {
            if (prime[p] == true)
            {
                pri.add((long)p);
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        long increment = 0;
        long ans = 0;
        for(Long var:pri){
            if(M%var!=0 || var>=N){
                break;
            }
            else{
                increment++;
                if(N%increment==0){
                    ans = increment;
                }
            }
        }
        System.out.println(ans);

    }
    
}
