import java.util.Scanner;

public class stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int key = sc.nextInt();
        String pl = "";
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            int cur = (int)curr-'A' +1;
            pl = pl + cur;
        }
        System.out.println("plain text "+pl);
        int ciphertext = Integer.parseInt(pl) ^ key;
        System.out.println("cipher text "+ciphertext);
        decToBinary(ciphertext);

    }
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[32];
 
        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        String binary = "";
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
