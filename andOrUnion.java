import java.util.Scanner;

public class andOrUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long andOperation = 0;
        int n = sc.nextInt();
        long ar[] = new long [n];
        for(int i=0;i<n;i++){
            long temp = sc.nextLong();
            long t = temp;
            if(i==0){
                andOperation = temp;
            }
            else{
                temp = temp&andOperation;
                andOperation = andOperation|t;
            }
            ar[i] = temp;
        }
        long ans = 0;

        for(int i=1;i<n;i++){
            ans = ans | ar[i];
        }
        System.out.println(ans);
    }
    
}
