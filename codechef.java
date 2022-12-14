
/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            PrintWriter pw = new PrintWriter(System.out);
            int t = sc.nextInt();
            while (t-- != 0) {
                long n = sc.nextInt();
                long k = sc.nextInt();
                ArrayList<Long> list = new ArrayList<>();
                for(int i=0;i<n;i++){
                    list.add(sc.nextLong());
                }
                Collections.sort(list);
                long t1 = tech1(list,n,k);
                long t2 = tech2(list,n,k);
                pw.println(Math.max(t1,t2));
            }
            pw.flush();
        } catch (Exception e) {
            return;
        }
    }
    static long tech1(ArrayList<Long> list,long n,long k){
        if(list.get((int)n-1)==(2*n) || k==1){
            return tech2(list,n,k);
        }
        else{
            list.add(2*n);
            n++;
            k--;
            return tech2(list,n,k);
        }
    }
    static long tech2(ArrayList<Long> list,long n,long k){
        long count = 0;
        for(int i=0;(i<n && k>0);i++){
            if(list.get(i)!=(i+1)){
                count += list.get((int)n-1)-(i+1);
                list.add(i,(long)(i+1));
                n++;
                k--;
            }
            else{
                continue;
            }
            if(k<=0){
                return count;
            }
        }
        return count;
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