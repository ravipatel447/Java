import java.util.Scanner;

public class hill_cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message:");
        String s = sc.nextLine().toUpperCase();
        String key = "GYBNQKURP".toUpperCase();
        int length = (s.length()+2)/3;
        String ar[] = new String [length];
        int curr = 0;
        for(int i=0;i<length;i++){
            ar[i] = s.charAt(curr)+""+s.charAt(curr+1)+""+s.charAt(curr+2)+"";
            curr+=3;
            HillCipher(ar[i],key);
        }
        System.out.println("19DCE111:- Ravi Patel");

    }
    static void getKeyMatrix(String key, int keyMatrix[][])
{
    int k = 0;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            keyMatrix[i][j] = (key.charAt(k)) % 65;
            k++;
        }
    }
}
static void encrypt(int cipherMatrix[][],
            int keyMatrix[][],
            int messageVector[][])
{
    int x, i, j;
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 1; j++)
        {
            cipherMatrix[i][j] = 0;
         
            for (x = 0; x < 3; x++)
            {
                cipherMatrix[i][j] +=
                    keyMatrix[i][x] * messageVector[x][j];
            }
         
            cipherMatrix[i][j] = cipherMatrix[i][j] % 26;
        }
    }
}
static void decrypt(int finalmetrix[][],int keymetrix[][],int cipherMatrix[][]){
    int inv[][] = new int [3][3];
    inverse(keymetrix, inv);
    encrypt(finalmetrix, inv, cipherMatrix);
}
static void HillCipher(String message, String key)
{
    int [][]keyMatrix = new int[3][3];
    getKeyMatrix(key, keyMatrix);
 
    int [][]messageVector = new int[3][1];
    for (int i = 0; i < 3; i++)
        messageVector[i][0] = (message.charAt(i)) % 65;
    int [][]cipherMatrix = new int[3][1];
    encrypt(cipherMatrix, keyMatrix, messageVector);
    String CipherText="";
    for (int i = 0; i < 3; i++)
        CipherText += (char)(cipherMatrix[i][0] + 65);
    System.out.println("Ciphertext: " + CipherText);
    int [][]finalmetrix = new int [3][1];
    decrypt(finalmetrix, keyMatrix, cipherMatrix);
    String PlainText = "";
    for(int i=0;i<3;i++)
        PlainText += (char)(finalmetrix[i][0]+65);
    System.out.println("Decrypted: "+PlainText);
}
static void inverse(int [][]keyMatrix,int [][]inv){
    adjoint(keyMatrix, inv);
    int det = determinant(keyMatrix, 3);
    int invdet = -1;
    for(int i=1;i<1000;i++){
        if((det*i)%26==1){
            invdet = i;
            break;
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            inv[i][j] *= invdet; 
            if(inv[i][j]<0){
                inv[i][j] = 26-(((-1)*inv[i][j])%26);
            }
            else{
                inv[i][j] = inv[i][j]%26;
            }
        }
    }

}
static void adjoint(int A[][],int [][]adj)
{
    int sign = 1;
    int [][]temp = new int[3][3];
 
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            getCofactor(A, temp, i, j, 3);
            sign = ((i + j) % 2 == 0)? 1: -1;
            adj[j][i] = (sign)*(determinant(temp, 2));
        }
    }
}
static int determinant(int A[][], int n)
{
    int D = 0;
    if (n == 1)
        return A[0][0];
 
    int [][]temp = new int[3][3];
 
    int sign = 1;
    for (int f = 0; f < n; f++)
    {
        getCofactor(A, temp, 0, f, n);
        D += sign * A[0][f] * determinant(temp, n - 1);
        sign = -sign;
    }
 
    return D;
}
static void getCofactor(int A[][], int temp[][], int p, int q, int n)
{
    int i = 0, j = 0;
    for (int row = 0; row < n; row++)
    {
        for (int col = 0; col < n; col++)
        {
            if (row != p && col != q)
            {
                temp[i][j++] = A[row][col];
                if (j == n - 1)
                {
                    j = 0;
                    i++;
                }
            }
        }
    }
}
}
