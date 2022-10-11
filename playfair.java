import java.util.HashSet;
import java.util.Scanner;
public class playfair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plain Text:");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter the key:");
        String key = sc.nextLine().toLowerCase();
        char [][] table = table(key);
        System.out.println("table of playfair");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        String r = encryption(s, key);
        String d = decryption(r, key);
        System.out.println("encryption message "+r);
        System.out.println("decrypted message "+d);
        System.out.println("19DCE111:- Ravi Patel");
        
    }
    public static String encryption(String plaintext,String key){
        char playfair[][] = table(key);
        int size = (plaintext.length()+1)/2;
        String ar[] = new String [size];
        int curr = 0;
        for(int i=0;i<size;i++){
            if((curr+1)==plaintext.length()){
                ar[i] = plaintext.charAt(curr)+"x";
            }
            else{
                ar[i] = plaintext.charAt(curr)+""+plaintext.charAt(curr+1);
            }
            curr+=2;
        }
        String ciphertext = "";
        for(int i=0;i<size;i++){
            char a = ar[i].charAt(0);
            char b = ar[i].charAt(1);
            if(a==b){
                if(a=='x'){
                    b = 'y';
                }
                else{
                    b = 'x';
                }
            }
            int ai = -1,bi=-1;
            int aj = -1,bj=-1;
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    if(playfair[j][k]==a){
                        ai = j;
                        aj = k;
                    }
                    else if(playfair[j][k]==b){
                        bi = j;
                        bj = k;
                    }
                }
                if(ai!=-1 && bi!=-1){
                    break;
                }
            }
            char anew = playfair[bi][aj];
            char bnew = playfair[ai][bj];
            if(aj==bj){
                if(ai==4){
                    anew = playfair[0][aj];
                    bnew = playfair[bi+1][bj];
                }
                else if(bi==4){
                    anew = playfair[ai+1][aj];
                    bnew = playfair[0][bj];
                }
                else{
                    anew = playfair[ai+1][aj];
                    bnew = playfair[bi+1][bj];
                }
            }
            else if(ai==bi){
                if(aj==4){
                    anew = playfair[ai][0];
                    bnew = playfair[bi][bj+1];
                }
                else if(bj==4){
                    anew = playfair[ai][aj+1];
                    bnew = playfair[bi][0];
                }
                else{
                    anew = playfair[ai][aj+1];
                    bnew = playfair[bi][bj+1];
                }
            }
            ciphertext += anew+""+bnew+" ";
        }
        return ciphertext;
    }
    public static String decryption(String ciphertext,String key){
        char playfair[][] = table(key);
        String ar[] = ciphertext.split(" ");
        int size = ar.length;
        String plaintext = "";
        for(int i=0;i<size;i++){
            char a = ar[i].charAt(0);
            char b = ar[i].charAt(1);
            int ai = -1,bi=-1;
            int aj = -1,bj=-1;
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    if(playfair[j][k]==a){
                        ai = j;
                        aj = k;
                    }
                    else if(playfair[j][k]==b){
                        bi = j;
                        bj = k;
                    }
                }
                if(ai!=-1 && bi!=-1){
                    break;
                }
            }
            char anew = playfair[bi][aj];
            char bnew = playfair[ai][bj];
            if(aj==bj){
                if(ai==0){
                    anew = playfair[4][aj];
                    bnew = playfair[bi-1][bj];
                }
                else if(bi==0){
                    anew = playfair[ai-1][aj];
                    bnew = playfair[4][bj];
                }
                else{
                    anew = playfair[ai-1][aj];
                    bnew = playfair[bi-1][bj];
                }
            }
            else if(ai==bi){
                if(aj==0){
                    anew = playfair[ai][4];
                    bnew = playfair[bi][bj-1];
                }
                else if(bj==0){
                    anew = playfair[ai][aj-1];
                    bnew = playfair[bi][4];
                }
                else{
                    anew = playfair[ai][aj-1];
                    bnew = playfair[bi][bj-1];
                }
            }
            plaintext += anew+""+bnew+" ";
        }
        return plaintext;
    }
    public static char[][] table (String key){
        char ar[] = new char [25];
        HashSet<Character> chrlist = new HashSet<>();
        int curr = 0;
        for(int i=0;i<key.length();i++){
            char c = key.charAt(i);
            if(c=='j'){
                c='i';
            }
            if(chrlist.contains(c)){
                continue;
            }
            else{
                chrlist.add(c);
                ar[curr] = c;
                curr++;
            }
        }
        for(int i=97;i<123;i++){
            char c = (char)i;
            if(c=='j'){
                c='i';
            }
            if(chrlist.contains(c)){
                continue;
            }
            else{
                chrlist.add(c);
                ar[curr] = c;
                curr++;
            }
        }
        char[][] playfair = new char [5][5];
        curr = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                playfair[i][j] = ar[curr];
                curr++;
            }
        }
        return playfair;
    }
    
}
