import java.math.BigInteger;

public class newbie {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("93");
        a = a.pow(6);
        a = a.mod(new BigInteger("23"));
        System.out.println(a);
    }
    
}
