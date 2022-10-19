import java.util.*;
import java.lang.*;
import java.io.*;

class Happy {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            PrintWriter pw = new PrintWriter(System.out);
            int t = sc.nextInt();
            int tc = t;
            while (t-- != 0) {
                int n = sc.nextInt();
                int ar[] = new int [n];
                for(int i=0;i<n;i++){
                    ar[i] = sc.nextInt();
                }
                int sum = 0;
                for(int i=0;i<n;){
                    int csum = 0;
                    for(int j=i;j<n;j++){
                        csum += ar[j];
                        if(csum<0 || j==n-1){
                            if(j==n-1 && csum>=0){
                                sum += getAns(ar, i, j);
                            }
                            else{
                                sum += getAns(ar, i, (j-1));
                            }
                            i = j+1;
                            break;
                        }
                    }
                }
                pw.print("Case #"+(tc-t)+": "+sum);
                pw.println();
            }
            pw.flush();
        } catch (Exception e) {
            return;
        }
    }
    static int getAns(int ar[],int start,int end){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum += ar[i]*((ar[i]>=0)?(i-start+1):(1))*(end-i+1);
        }
        return sum;
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}