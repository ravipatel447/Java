import java.util.*;
import java.lang.*;
import java.io.*;
public class lol {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
		        FastReader sc = new FastReader();
		        int t = sc.nextInt();
		        while(t--!=0){
		            int n = sc.nextInt();
		            int ar[] = new int [n];
		            for(int i=0;i<n;i++){
		                ar[i] = sc.nextInt();
		            }
                    int max = 0;
		            HashMap<Integer,Integer> map = new HashMap<>();
                    for(int i=0;i<n;i++){
                        int a = ar[i];
                        if(map.containsKey(a)){
                            map.put(a,map.get(a)+1);
                            if(max<map.get(a)){
                                max = map.get(a);
                            }
                        }
                        else{
                            map.put(a,1);
                            if(max<1){
                                max = 1; 
                            }
                        }
                    }
                    
                    if(max<2){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(n-max+1);
                    }
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
