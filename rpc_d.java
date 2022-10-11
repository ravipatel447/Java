import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class rpc_d {
    static long l_row[] = new long [44722];
    static long fact[] = new long [44722];
    static long mod = 1000000007;
    public static void main(String[] args) {
        // for(int i=1;i<44722;i++){
        //     l_row[i] = i*(i+1)/2;
        // }
        // fact[0] = 1;
        // for(int i=1;i<44722;i++){
        //     fact[i] = fact[i-1]*i%mod;
        // }
        Scanner sc = new Scanner (System.in);
        long first = sc.nextLong();
        long last = sc.nextLong();
        // long r_first_ = binarySearch(l_row,1,44721,first);
        // long c_first_ = first-l_row[(int)r_first_-1];
        // long r_last_ = binarySearch(l_row,1,44721,last);
        // long c_last_ = last-l_row[(int)r_last_-1];
        // long n = r_last_-r_first_;
        // long r = c_last_-c_first_;
        long start = System.currentTimeMillis();
        System.out.println("real ans "+power(first, last));
        long end = System.currentTimeMillis();
        System.out.println("1st time "+(end-start));
        start = System.currentTimeMillis();
        System.out.println("my ans "+power_my(first, last));
        end = System.currentTimeMillis();
        System.out.println("2nd time "+(end-start));

        // if(r<0 || r>n){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println(ncr(n, r));
        // }
    }
    static long power_my(long a,long b){
        if(b==1){
            return a;
        }
        if(b%2==0){
            return power(a, b/2)*power(a, b/a)%mod;
        }
        else{
            return power(a, b/2)*power(a, b/2)*a%mod;
        }
    }
    static long binarySearch(long arr[], long l, long r, long x)
    {
        if (r >= l) {
            long mid = l + (r - l) / 2;
            if(x>= arr[(int)mid-1] && x<=arr[(int)mid]){
                if(x==arr[(int)mid-1]){
                    return mid-1;
                }
                else{
                    return mid;
                }
            }
            else if(x>arr[(int)mid] && x<=arr[(int)mid+1]){
                return mid+1;
            }
            if (arr[(int)mid-1] > x)
                return binarySearch(arr, l, mid - 1, x);
            else if(arr[(int)mid+1] < x){
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }
    public static long power(long a,long n){
        long res = 1;
        while(n!=0){
            if(n%2==0){
                res = ((long)res*a)%1000000007;
            }
            n = n/2;
            a = (long)a*a%1000000007;
        }
        return res;
    }
    public static long ncr (long n,long r){
        if(r>n) return 0;
        long res = 0;
        // res = res / fact[(int)r];
        // res = res / fact[(int)(n-r)];
        return res;
    }
    public static int search_row(long j){
        for(int i=0;i<1000000;i++){
            if(l_row[i]>=j){
                return i;
            }
        }
        return -1;
    }
    public static long r_ans(long n,long r){
        if(r==n || r==0) return 1;
        return (r_ans(n-1,r-1)%1000000007)+(r_ans(n-1,r)%1000000007);
    }

}
