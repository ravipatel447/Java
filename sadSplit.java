import java.util.Scanner;

public class sadSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n+"";
        int even = 0;
        int odd = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            int curr = Integer.parseInt(a+"");
            if(curr%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(even>1 || odd>1){
            System.out.println("evens are "+even);
            System.out.println("odd are "+odd);
                System.out.println("Yes");
        }
        else{
            System.out.println("evens are "+even);
            System.out.println("odd are "+odd);
            System.out.println("No");
        }
    }
    
}
