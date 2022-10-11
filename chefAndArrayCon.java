import java.util.*;
import java.lang.*;
import java.io.*;

class chefAndArrayCon {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            PrintWriter pw = new PrintWriter(System.out);
            int t = sc.nextInt();
            while (t-- != 0) {
                long n = sc.nextInt();
                long m = sc.nextInt();
                long s = 0L;
                for(Long i=0L;i<31L;++i){
                    s=(s+(Power(Count(m,i),n)<<i)%998244353)%998244353;
                    pw.println(s);
                }
                // TreeMap<String,Integer> map = new TreeMap<>();
                // int sum = 0;
                // for(int i=1;i<=m;i++){
                //     for(int j=1;j<=m;j++){
                //         for(int k=1;k<=m;k++){
                //             for(int l=1;l<=m;l++){
                //                 pw.println(i+" "+j+" "+k+" "+l+" and is "+(i&j&k&l));
                //                 sum += (i&j&k&l);
                //                 int ar[] = new int [4];
                //                 ar[0]= i;
                //                 ar[1] = j;
                //                 ar[2] = k;
                //                 ar[3] = l;
                //                 Arrays.sort(ar);
                //                 String now = ar[0]+" "+ar[1]+" "+ar[2]+" "+ar[3];
                //                 if(map.containsKey(now)){
                //                     map.put(now, map.get(now)+1);
                //                 }
                //                 else{
                //                     map.put(now, 1);
                //                 }
                //             }
                //         }
                //     }
                // }
                // pw.println(Count(5L, 0L));
                // for (Map.Entry<String,Integer> entry : map.entrySet()) {
                //     pw.println(entry.getKey()+"  ----> "+entry.getValue());
                // }
            }
            pw.flush();
        } catch (Exception e) {
            return;
        }
    }
    public static Long Count(Long i,Long j) {
        return ((i/(1L<<(j+1)))<<j)+(Math.max(0L,i%(1L<<(j+1))-(1L<<j)+1));
    }
    public static Long Power(Long b,Long n) {
        Long s=1L;
        while(n!=0) {
            if(n%2==1)s=s*b%998244353L;
            b=b*b%998244353L;
            n/=2L;
        }
        return s;
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