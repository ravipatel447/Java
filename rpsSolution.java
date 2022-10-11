import java.util.*;
import java.io.*;
public class rpsSolution {
    public static void main(String[] args)throws java.lang.Exception {
        HashMap<Character,Character> who_beats = new HashMap<Character, Character>() {{
            put('S', 'R');
            put('P', 'S');
            put('R', 'P');
        }};
        try {
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while(t--!=0){
                int n = sc.nextInt();
                String str = sc.nextLine();
                char a[] = str.toCharArray();
                HashMap<Character,Integer> ind = new HashMap<Character,Integer>(){{
                    put('S',-1);
                    put('R',-1);
                    put('P',-1);
                }};
                for(int i=n-1;i>=0;i--){
                    int idx = ind.get(who_beats.get(str.charAt(i)));
                    if(idx==-1){
                        a[i] = str.charAt(i);
                    }
                    else{
                        a[i] = a[idx];
                    }
                    ind.put(str.charAt(i), i);
                }
                for(int i=0;i<n;i++){
                    System.out.print(a[i]);
                }
                System.out.println();
            }
        } catch(Exception e) {
            return;
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
