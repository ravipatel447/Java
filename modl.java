import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class modl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int []{1,2,3,4,5};
        boolean checkarr[] = new boolean [ar.length];
        ArrayList<Integer> fill = new ArrayList<>();
        permutation(ar, checkarr, fill);
    }
    public static void permutation (int ar[],boolean checkarr[],ArrayList<Integer> fill){
        if(fill.size()==ar.length){
            System.out.println(fill);
        }
        else{
            for(int i=0;i<ar.length;i++){
                if(checkarr[i]){
                    continue;
                }
                else{
                    checkarr[i]=true;
                    fill.add(ar[i]);
                    permutation(ar, checkarr, fill);
                    checkarr[i]=false;
                    fill.remove(fill.size()-1);
                }
            }
        }
    }
}
