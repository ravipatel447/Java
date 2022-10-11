import java.util.Scanner;

public class navunavu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 35;
        int y = 192;
        for(int i=0;i<1000;i++){
            int a = ((x*i)+1)%y;
            if(a==0){
                System.out.println(i);
                break;
            }
        }

    }
    
}
