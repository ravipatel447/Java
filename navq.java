import java.util.*;
public class navq {
    public static void main(String[] args)  {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            ans  += n/2;
            n = n/2;
        }
        System.out.println(ans);
    }
}
