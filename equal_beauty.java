import java.util.*;
public class equal_beauty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    long ar[] = new long [n];
                    for(int i=0;i<n;i++){
                        ar[i] = sc.nextLong();
                    }
                    Arrays.sort(ar);
                    long final_ans = Long.MAX_VALUE;
                    if(n==2){
                        final_ans = 0;
                    }
                    else if(n==3){
                        long a = Math.abs(ar[0]-ar[1]);
                        long b = Math.abs(ar[1]-ar[2]);
                        long c = Math.abs(ar[0]-ar[2]);
                        final_ans = Math.min(a,Math.min(b, c));
                    }
                    else{
                        {
                            for(int i=1;i<n-1;i++){
                                for(int j=1;j<n-1;j++){
                                    if(i!=j){
                                        long t_ans = Math.abs((ar[i]-ar[0])-(ar[n-1]-ar[j]));
                                        if(final_ans>t_ans){
                                            final_ans = t_ans;
                                        }
                                    }
                                }
                            }
                            
                        }


                        // case 2
                        for(int i=0;i<n-1;i++){
                            long t_ans = Math.abs(((ar[i])-(ar[0])) - ((ar[n-1])-ar[i+1]));
                            if(final_ans>t_ans){
                                final_ans = t_ans;
                            }
                        }

                    }
                    System.out.println(final_ans);















                    // long beauty = ar[n-1]-ar[0];
                    // long beauty_mode = Math.abs(beauty);
                    // long min = Long.MAX_VALUE;
                    // for(int i=1;i<n-2;i++){
                    //     for(int j=i+1;j<n-1;j++){
                    //         long current = Math.abs(ar[i]-ar[j]);
                    //         long diff = Math.abs(current-beauty_mode);
                    //         if(min>diff){
                    //             min = diff;
                    //         }
                    //     }
                    // }
                    // if(n-2<=1){
                    //     min = beauty_mode;
                    // }
                    // System.out.println(min);
        sc.close();
    }
    
}
