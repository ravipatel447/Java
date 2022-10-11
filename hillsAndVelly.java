/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
public class hillsAndVelly
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
		        FastReader sc = new FastReader();
		        int t = sc.nextInt();
		        while(t--!=0){
                    int hills = sc.nextInt();
                    int vellys = sc.nextInt();
                    String ans = str(hills, vellys);
                    System.out.println(ans.length());
                    System.out.println(ans);
		        }
	    } catch(Exception e) {
	        return;
	    }
	}
    public static String str(int x,int y){
        int a = (x>y)? 1:0;
        int b = (x>y)? 0:1;
        int min = Math.min(x, y);
        int diff = Math.abs(x-y);
        String s = ""+b;
        for(int i=0;i<min;i++){
            s+= a+""+b;
        }
        for(int i=1;i<diff;i++){
            s+=a+""+b+""+b;
        }
        if(x!=y){
            s+=a+""+b;
        }
        else{
            s+= a;
        }
        return s;
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