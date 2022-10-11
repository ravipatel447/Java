import java.util.Scanner;

public class countHellsandvellys {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int heels = 0,vellys=0;
        for(int i=1;i<s.length()-1;i++){
            String str = ""+s.charAt(i-1)+s.charAt(i)+s.charAt(i+1);
            if(str.equals("010")){
                heels++;
            }
            else if(str.equals("101")){
                vellys++;
            }
        }
        System.out.println("total hells are "+heels);
        System.out.println("total vellys are "+vellys);
        sc.close();
    }
    
}
