import java.util.*;
import java.lang.*;
import java.io.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for(int i=1;i<=30;i++){
            System.out.println(countSay("21", 1));
        // }
    }
    public static String countSay(String s,int n){
        if(n==0){
            return s;
        }
        else{
            String ans = "";
            for(int i=0;i<s.length();){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)==s.charAt(i) && j!=s.length()-1){
                        continue;
                    }
                    else{
                        if(j==s.length()-1){
                            ans += (j-i+1)+""+(s.charAt(i));
                            i= j+1;
                        }
                        else{
                            ans += (j-i)+""+(s.charAt(i));
                            i = j;
                        }
                        break;
                    }
                }
            }
            System.out.println("this is ans "+ans);
            return countSay(ans,n-1);
        }
    }
}