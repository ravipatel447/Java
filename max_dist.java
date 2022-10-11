import java.util.*;
public class max_dist {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                    int n = sc.nextInt();
                    int ar[] = new int [n];
                    int ar1[] = new int [n];
                    int ans[] = new int [n];
                    for(int i=0;i<n;i++){
                        ar[i] = sc.nextInt();
                        ar1[i] = ar[i];
                    }
                    Arrays.sort(ar1);
                    for(int i=n-1;i>=0;i--){
                        boolean hogaya = false;
                        
                        if(!hogaya){
                            ans[i] = 0;
                        }
                    }
                    for(int i=0;i<n;i++){
                        System.out.print(ans[i]+" ");
                    }
        sc.close();
    }
}
