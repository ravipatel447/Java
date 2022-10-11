import java.util.Scanner;

public class rail_fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Message:");
        String s = sc.nextLine();
        System.out.println("Enter a key");
        int key = sc.nextInt();
        // String encrypted = encrypt(s, key);
        String decrypted = decryptRailFence(s, key);
        // System.out.println("Encrypted message: "+encrypted);
        System.out.println("Decrypted message: "+decrypted);
        System.out.println("19DCE111:- Ravi Patel");
    }

    public static String encrypt(String plaintext, int key) {
        char[][] ar = new char[key][plaintext.length()];
        boolean dir_down = false;
        int row = 0, col = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < plaintext.length(); j++) {
                ar[i][j] = '~';
            }
        }
        for (int i = 0; i < plaintext.length(); i++) {
            if (row == 0 || row == key - 1)
                dir_down = !dir_down;
            ar[row][col++] = plaintext.charAt(i);
            if (dir_down) {
                row++;
            } else {
                row--;
            }
        }
        String ciphertext = "";
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < plaintext.length(); j++) {
                if (ar[i][j] != '~')
                    ciphertext += ar[i][j];
            }
        }
        return ciphertext;
    }

    public static String decryptRailFence(String cipher, int key) {
        char[][] ar = new char[key][cipher.length()];
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < cipher.length(); j++) {
                ar[i][j] = '~';
            }
        }
        boolean dir_down = true;
        int row = 0, col = 0;
        for (int i = 0; i < cipher.length(); i++) {
            if (row == 0)
                dir_down = true;
            if (row == key - 1)
                dir_down = false;
            ar[row][col++] = '*';
            if (dir_down) {
                row++;
            } else {
                row--;
            }
        }
        int index = 0;
        for (int i = 0; i < key; i++)
            for (int j = 0; j < cipher.length(); j++)
                if (ar[i][j] == '*' && index < cipher.length())
                    ar[i][j] = cipher.charAt(index++);

        String result = "";

        row = 0;
        col = 0;
        for (int i = 0; i < cipher.length(); i++) {
            if (row == 0)
                dir_down = true;
            if (row == key - 1)
                dir_down = false;

            if (ar[row][col] != '*') {
                result += ar[row][col++];
            }
            if (dir_down) {
                row++;
            } else {
                row--;
            }
        }
        return result;
    }
}
