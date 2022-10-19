import java.util.*;
import java.lang.*;
import java.io.*;

class chefRemoval {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            PrintWriter pw = new PrintWriter(System.out);
            int t = sc.nextInt();
            while (t-- != 0) {
                int n = sc.nextInt();
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int i=0;i<n;i++){
                    int a = sc.nextInt();
                    if(map.containsKey(a)){
                        map.put(a, map.get(a)+1);
                    }
                    else{
                        map.put(a, 1);
                    }
                }
                int max = -1;
                for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
                    if(entry.getValue()>max){
                        max = entry.getValue();
                    }
                }
                pw.println(n-max);
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