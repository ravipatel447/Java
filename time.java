import java.util.*;
import java.io.*;
public class time {
    static HashMap<Integer,Character> link = new HashMap<>();
    public static void main(String[] args)throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while(t--!=0){
                int n = sc.nextInt();
                String str = sc.nextLine();
                int ar[] = new int [n];
                Arrays.fill(ar,0);
                int mark = 1;
                ar = ar(str, n,ar,0,mark);
                String ans = "";
                for(int i=0;i<n;i++){
                    if(ar[i]==-1){
                        mark++;
                        ar = ar(str, n, ar, i, mark);
                    }
                    int nmark = ar[i];
                    ans+= ""+link.get(nmark);
                }
                System.out.println(ans);
            }
        } catch(Exception e) {
            return;
        }
    }
    static int[] ar(String str,int n,int ar[],int j,int mark){
        char curr = str.charAt(j);
        for(int i=j;i<n;i++){
            char ct = str.charAt(i);
            if(ar[i]!=-1 && ar[i]!=0 && winner(ct, curr)){
                char an = link.get(ar[i]);
                link.put(mark, an);
                return ar;
            }
            if(ct=='P' && curr=='R'){
                curr = 'P';
                ar[i] = mark;
                if(i==n-1){
                    link.put(mark, ct);
                }
            }
            else if(ct=='S' && curr=='P'){
                curr = 'S';
                ar[i] = mark;
                if(i==n-1){
                    link.put(mark, ct);
                }
            }
            else if(ct=='R'  && curr=='S'){
                curr = 'R';
                ar[i] = mark;
                if(i==n-1){
                    link.put(mark, ct);
                }
            }
            else if(ct==curr){
                ar[i] = mark;
                if(i==n-1){
                    link.put(mark, ct);
                }
            }
            else if(curr=='P' && ct=='R'){
                if(ar[i]==-1 || ar[i]==0){
                    ar[i] = -1;
                }
                if(i==n-1){
                    link.put(mark, curr);
                }
            }
            else if(curr=='S' && ct=='P'){
                if(ar[i]==-1 || ar[i]==0){
                    ar[i] = -1;
                }
                if(i==n-1){
                    link.put(mark, curr);
                }
            }
            else if(curr=='R'  && ct=='S'){
                if(ar[i]==-1 || ar[i]==0){
                    ar[i] = -1;
                }
                if(i==n-1){
                    link.put(mark, curr);
                }
            }
            else{
                if(ar[i]==-1 || ar[i]==0){
                    ar[i] = -1;
                }
                if(i==n-1){
                    link.put(mark, curr);
                }
            }
        }
        return ar;
    }
    static boolean winner(char a,char b){
        if(a=='P' && b=='R'){
            return true;
        }
        else if(a=='S' && b=='P'){
            return true;
        }
        else if(a=='R'  && b=='S'){
            return true;
        }
        return false;
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
