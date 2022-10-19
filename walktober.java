import java.util.*;
import java.lang.*;
import java.io.*;

class walktober {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            PrintWriter pw = new PrintWriter(System.out);
            int t = sc.nextInt();
            int tc = t;
            while (t-- != 0) {
                int n = sc.nextInt();
                int days = sc.nextInt();
                int id = sc.nextInt();
                int scoor[] = new int [days];
                int jhon[] = new int [days];
                for(int i=0;i<n;i++){
                    for(int j=0;j<days;j++){
                        int a = sc.nextInt();
                        if(a>scoor[j]){
                            scoor[j] = a;
                        }
                        if((i+1)==id){
                            jhon[j] = a;
                        }
                    }
                }
                int count = 0;
                for(int i=0;i<days;i++){
                    if(scoor[i]>jhon[i]){
                        count += (scoor[i]-jhon[i]);
                    }
                }
                pw.print("Case #"+(tc-t)+": "+count);
                pw.println();
            }
            pw.flush();
        } catch (Exception e) {
            return;
        }
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