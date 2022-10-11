import java.io.*;
import java.util.*;

public class sim {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int b[] = new int [n];
            int a[] = new int [n];
            Stack<Integer> stac = new Stack<>();
            Stack<Integer> stac1 = new Stack<>();
            boolean check = false;
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
                if(b[i]>(i+1)){
                    check = true;
                    break;
                }
                if(b[i]==-1){
                    continue;
                }
                else{
                    stac.push(i);
                    stac1.push(b[i]);
                }
            }
            if(check){
                System.out.println(-1);
            }
            else{
                for(int i=n-1;i>=0;i--){
                    
                }
            }
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
        
}
