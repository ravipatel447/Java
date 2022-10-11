/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class RockPaperSissor
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
		        FastReader sc = new FastReader();
		        int t = sc.nextInt();
		        while(t--!=0){
		            int n = sc.nextInt();
                    String str = sc.nextLine();
                    int ar[] = ar(str, n);
                    char a = baki(str, n, 0);
                    String ans = ""+a;
                    String ans2 = ans;
                    for(int i=1;i<n;i++){
                        ans2 += baki(str, n, i);
                        if(ar[i]>2){
                            ans+=""+a;
                        }
                        else{
                            if(winner(str.charAt(i), str.charAt(i-1))){
                                ans+=""+ans.charAt(i-1);
                            }
                            else{
                                ans+=baki(str, n, i);
                            }
                        }
                    }
                    System.out.println("code ans:"+ans);
                    System.out.println("real ans:"+ans2);
		        }
	    } catch(Exception e) {
	        return;
	    }
	}
    static int[] ar(String str,int n){

        char curr = str.charAt(0);
        int ar[] = new int [n];
        int fin[] = new int [n];
        for(int i=1;i<n;i++){
            char ct = str.charAt(i);
            if(ct=='P' && curr=='R'){
                curr = 'P';
                ar[i] = 1;
            }
            else if(ct=='S' && curr=='P'){
                curr = 'S';
                ar[i] = 1;
            }
            else if(ct=='R'  && curr=='S'){
                curr = 'R';
                ar[i] = 1;
            }
        }
        int sum = 0;
        for(int i=n-1;i>=0;i--){
            sum+=ar[i];
            fin[i] = sum;
        }
        return fin;
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
    static char baki(String s1,int n,int ith){
        char winner = s1.charAt(ith);
        for(int i=ith;i<(n-1);i++){
            char ct = s1.charAt(i+1);
            if(ct=='P' && winner=='R'){
                winner = 'P';
            }
            else if(ct=='S' && winner=='P'){
                winner = 'S';
            }
            else if(ct=='R'  && winner=='S'){
                winner = 'R';
            }
        }
        return winner;
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