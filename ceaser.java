import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ceaser {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Enter a message for Encryption:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter the key:");
        int key = sc.nextInt() % 26;
        sc.nextLine();
        // String input = sc.nextLine().toLowerCase();
        // if (input.charAt(0) == 'e') {
            System.out.println("Encrypted text: "+encryption(s, key));
        // } else {
            // System.out.println("Decrypted text: "+decryption(s, key));
            System.out.println("19DCE111:- Ravi Patel");
        // }
    }

    public static String encryption(String s, int key) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if ((int) a == 32) {
                ans += a;
                continue;
            }
            int last = ((((int) a + key) - 97) % 26) + 97;
            a = (char) (last);
            ans = ans + a;
        }
        return ans;
    }

    public static String decryption(String s, int key) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if ((int) a == 32) {
                ans += a;
                continue;
            }
            int last = (((int) a - key) - 97);
            if (last < 0) {
                last += 26;
            }
            last += 97;
            a = (char) (last);
            ans = ans + a;
        }
        return ans;
    }
}