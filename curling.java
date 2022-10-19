import java.util.*;
import java.lang.*;
import java.io.*;

class curling {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            PrintWriter pw = new PrintWriter(System.out);
            int t = sc.nextInt();
            int tc = t;
            while (t-- != 0) {
                int rb = sc.nextInt();
                int rh = sc.nextInt();
                int r = sc.nextInt();
                double arr[] = new double [r];
                int cr = 0;
                for(int i=0;i<r;i++){
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    arr[i]= circle(0, 0, x1, y1, rh, rb); 
                }
                Arrays.sort(arr);
                int y = sc.nextInt();
                double ary[] = new double [y];
                int cy = 0;
                for(int i=0;i<y;i++){
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    ary[i]= circle(0, 0, x1, y1, rh, rb); 
                }
                Arrays.sort(ary);
                for(int i=0;i<r;i++){
                    if(y>0){
                        if( arr[i]<ary[0] && arr[i]!=Double.MAX_VALUE){
                            cr++;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        if(arr[i]!=Double.MAX_VALUE){
                            cr++;
                        }
                        else{
                            break;
                        }
                    }
                }
                for(int i=0;i<y;i++){
                    if(r>0){
                        if(ary[i]<arr[0] && ary[i]!=Double.MAX_VALUE){
                            cy++;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        if(ary[i]!=Double.MAX_VALUE){
                            cy++;
                        }
                        else{
                            break;
                        }

                    }
                }
                pw.print("Case #"+(tc-t)+": "+cr+" "+cy);
                // pw.print("Case #"+(tc-t)+": "+((cr<cy)?0:(cr-cy))+" "+((cr>cy)?0:(cy-cr)));
                pw.println();
            }
            pw.flush();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
    static double circle(int x1, int y1, int x2, int y2,
                       int r1, int r2)
    {
        double d = Math.sqrt((x1 - x2) * (x1 - x2)
                             + (y1 - y2) * (y1 - y2));
        if (d <= r1 + r2) {
            return d;
        }
        else {
            return Double.MAX_VALUE;
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