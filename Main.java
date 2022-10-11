import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static boolean checkPossibility(String inputString,int index){
    if(inputString.length()==index){
        // System.out.println(inputString+" is input string");
        for(int i=0;i<inputString.length()-4;i++){
            for(int j=i+5;j<=inputString.length();j++){
                StringBuilder s1 = new StringBuilder(inputString.substring(i, j));
                StringBuilder s2 = new StringBuilder(inputString.substring(i, j));
                s2.reverse();
                if(s1.toString().equals(s2.toString())){
                    return false;
                }
            }
        }
        return true;
    }
    if(inputString.charAt(index)=='?' && (index+1)<inputString.length()){
        boolean r1= checkPossibility(inputString.substring(0,index)+"1"+inputString.substring(index+1),index+1);
        boolean r2= checkPossibility(inputString.substring(0,index)+"0"+inputString.substring(index+1),index+1);
        return r1|r2;
    }else if (inputString.charAt(index)=='?'){
        boolean r1= checkPossibility(inputString.substring(0,index)+"1",index+1);
        boolean r2= checkPossibility(inputString.substring(0,index)+"0",index+1);
        return r1|r2;
    }else {
        return checkPossibility(inputString,index+1);
    }
}

public static void main(String[] args) {
    FastReader sc = new FastReader();
    int t = sc.nextInt();
    int tc = t;
    while(t-- !=0){
        int length=sc.nextInt();
        String inputString = sc.nextLine();
        String ans = (checkPossibility(inputString,0))? "POSSIBLE" : "IMPOSSIBLE";
        System.out.println(ans);
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