import java.util.ArrayList;
import java.util.Scanner;
public class adjlove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int [n];
        int even = 0;
        int odd = 0;
        ArrayList<Integer> even_ = new ArrayList<>();
        ArrayList<Integer> odd_ = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
            if(ar[i]%2==0){
                even++;
                even_.add(ar[i]);
            }
            else{
                odd++;
                odd_.add(ar[i]);
            }
        }
        if(odd%2==0){
            all.addAll(odd_);
            all.addAll(even_);
        }
        else{
            if(even!=0 && odd>1){
                all.addAll(odd_);
                all.remove(all.size()-1);
                all.addAll(even_);
                all.add(odd_.size()-1);
            }
            else{
                System.out.println(-1);
            }
        }
        for(int i=0;i<all.size();i++){
            System.out.print(all.get(i)+" ");
        }
        System.out.println();
    }
    
}
