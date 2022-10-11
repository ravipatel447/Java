import java.util.*;
import java.lang.*;
import java.io.*;

public class vrund {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
		        FastReader sc = new FastReader();
		        int t = sc.nextInt();
		        while(t--!=0){
		            int a = sc.nextInt();
		            int b = sc.nextInt();
		            int ar[][] = new int [8][8];
		            ar[a-1][b-1] = 1;
		            if((a==1 && b==1) || (a==1 && b==8) || (a==8 && b==1) || (a==8&&b==8)){
		                if((a==1 && b==1)){
		                   ar[1][2] = 2;
		                   printarray(ar);
		                }
		                else if((a==1 && b==8)){
		                    ar[2][6] = 2;
		                    printarray(ar);
		                }
		                else if((a==8 && b==1)){
		                    ar[6][2] = 2;
		                    printarray(ar);
		                }
		                else{
		                    ar[5][6] = 2;
		                    printarray(ar);
		                }
		            }
		            else if(a==1 || b==1 || a==8 || b==8){
		                if(a==1){
		                    ar[a+1][b] = 2;
		                    ar[a+1][b-2] = 2;
		                    printarray(ar);
		                }
		                else if(b==1){
		                    ar[a][b+1] = 2;
		                    ar[a-2][b+1] = 2;
		                    printarray(ar);
		                }
		                else if(a==8){
		                    ar[a-3][b] = 2;
		                    ar[a-3][b-2] =2;
		                    printarray(ar);
		                }
		                else if(b==8){
		                    ar[a][b-3] = 2;
		                    ar[a-2][b-3] = 2;
		                    printarray(ar);
		                }
		            }
		            else if((a==2 && b==2)||(a==2 && b==7)||(a==7 && b==2)||(a==7 && b==7)){
		                if((a==2 && b==2)){
		                    ar[3][0]=2;
		                    ar[0][4]=2;
		                    printarray(ar);
		                }
		                else if((a==2 && b==7)){
		                    ar[3][7]=2;
		                    ar[0][3]=2;
		                    printarray(ar);
		                }
		                else if(a==7 && b==2){
		                    ar[4][0]=2;
		                    ar[7][4]=2;
		                    printarray(ar);
		                }
		                else if(a==7 && b==7){
		                    ar[7][3]=2;
		                    ar[4][7]=2;
		                    printarray(ar);
		                }
		            }
		            else{
		                int ca = a-1;
		                int cb = b-1;
		                if((ca-2)>=0 && (ca+2)<=7 && (cb-1)>=0  && (cb+1)<=7){
		                    ar[ca-2][cb-1] = 2;
		                    ar[ca+2][cb+1] = 2;
		                    printarray(ar);
		                }
		                else{
		                    ar[ca-1][cb+2] = 2;
		                    ar[ca+1][cb-2] = 2;
		                    printarray(ar);
		                }
		            }
		            System.out.println();
		        }
	    } catch(Exception e) {
	        return;
	    }
	}
	public static void printarray(int ar[][]){
	    for(int i=0;i<8;i++){
	        for(int j=0;j<8;j++){
	            System.out.print(ar[i][j]+" ");
	        }
	        System.out.println();
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
