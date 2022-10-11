import java.io.Console;
import java.util.*;
public class eb {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t--!=0){
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int ar[] = new int [n];
                    int ar2[] = new int [m];
                    for(int i=0;i<n;i++){
                        ar[i] = sc.nextInt();
                    }
                    Arrays.sort(ar);
                    for(int i=0;i<m;i++){
                        ar2[i] = sc.nextInt();
                    }
                    Arrays.sort(ar2);
                    System.out.println(findMedianSortedArrays(ar, ar2));
        }
        sc.close();
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tlength = nums1.length+nums2.length;
        int fnums[] = new int [tlength];
        int middle = tlength/2;
        int fi=0;
        int si = 0;
        int i = 0;
        while(fi<nums1.length && si<nums2.length){
            if(nums1[fi]<nums2[si]){
                fnums[i] = nums1[fi];
                fi++;
                i++;
            }
            else{
                fnums[i] = nums2[si];
                si++;
                i++;
            }
        }
        if(fi==nums1.length){
            for(;i<tlength;i++){
                fnums[i] = nums2[si];
                si++;
            }
        }
        else{
            for(;i<tlength;i++){
                fnums[i] = nums1[fi];
                fi++;
            }
        }
        double ans = 0;
        if(tlength%2==0){
            ans = (double)((fnums[middle]+fnums[middle-1]))/2;
        }
        else{
            ans = fnums[middle];
        }
        return ans;
    }
    
}
