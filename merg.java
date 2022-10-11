import java.util.*;
public class merg {
    public static void main(String[] args) {
        int ar[] = new int []{1,2,34,5,6,7,8,9,98};
        int max = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        int maxlength = (int)Math.log10(max)+1;
        int ans[] = new int [ar.length];
        for(int i=0;i<maxlength;i++){
            for(int j=0;j<ar.length;j++){
                String s = ""+ar[j];
                int sum = 0;
                if(s.length()<i+1){
                    sum = Integer.parseInt(s.charAt(s.length()-1)+"");
                }
                else{
                    sum = Integer.parseInt(s.charAt(i)+"");
                }
                ans[j]+=sum;
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        System.out.println(maxlength);
    }
}
