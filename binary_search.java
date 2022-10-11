import java.util.*;
public class binary_search {
    static int count = 0;
    static int binarySearch(int arr[], int l, int r, int x)
    {
        count++;
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
  
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
  
            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
  
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        binary_search ob = new binary_search();
        System.out.println("total testcase");
        int t = sc.nextInt();
        while(t--!=0){
            System.out.println("enter array size");
            int n = sc.nextInt();
            int arr[] = new int [n];
            System.out.println("enter "+n+" elements");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("enter wanted number");
            int x = sc.nextInt();
            int result = ob.binarySearch(arr, 0, n - 1, x);
            if (result == -1){
                System.out.println("Element not present");
                count=0;
            }
            else{
                System.out.println("Element found at index " + result+" and the count is "+count);
                count = 0;
            }
        }
        sc.close();
    }
}
