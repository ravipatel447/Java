import java.util.Scanner;

public class hill_cipher_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key[][] = new int [3][3];
        System.out.println("enter key 3X3");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int a = sc.nextInt();
                if(a<0){
                    int tmod = ((-1)*a)%26;
                    key[i][j] = 26-tmod;
                }
                else{
                    key[i][j] = a%26;
                }
            }
        }
        sc.nextLine();
        System.out.println("enter plain text");
        String plaintext = sc.nextLine().toUpperCase();
        int plen = (plaintext.length()+2)/3;
        String ar[] = new String [plen];
        int curr = 0;
        for(int i=0;i<plen;i++){
            ar[i] = plaintext.charAt(curr)+""+plaintext.charAt(curr+1)+""+plaintext.charAt(curr+2)+"";
            curr+=3;
            System.out.println(encryption(key, ar[i]));
        }
    }
    public static String encryption(int key[][],String text){
        int pl[] = new int [3];
        int ans[] = new int [3];
        for(int i=0;i<3;i++){
            pl[i] = text.charAt(i)-'A';
        }
        for(int i=0;i<3;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum = (sum + key[i][j]*pl[j]);
            }
            if(sum<0){
                int tmod = ((-1)*sum)%26;
                sum = 26-tmod;
            }
            sum = sum%26;
            ans[i] = sum;
            System.out.print(sum+" ");
        }
        String ans_ = "";
        for(int i=0;i<3;i++){
            char cur = (char)(ans[i]+65);
            ans_+=cur+"";
        }
        return ans_;
    }
    
}
