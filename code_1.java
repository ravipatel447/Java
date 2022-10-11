import java.util.Scanner;
public class code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
		int k = sc.nextInt();
        sc.nextLine();
		String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        StringBuilder str_first = new StringBuilder();
        int start = 0;
        int end = k-1;
        boolean check = true;
        while(start<=end){
            if(check){
                str_first.append(str.charAt(start));
                start++;
                check = false;
            }
            else{
                str_first.append(str.charAt(end));
                end--;
                check = true;
            }
        }
        str_first.reverse();
        str_first.append(str.substring(k, n));
        System.out.println(str_first.toString());
		// char ar[] = s.toCharArray();
		// char ar_one[] = new char [k];
		// if(k%2==0){
		//     int mid = k/2;
		//     for(int i=0,j=0;i<k;i++){
		//         if(i%2==0){
		//             ar_one[i] = ar[mid+j];
		//         }
		//         else{
		//             ar_one[i] = ar[mid-j-1];
        //             j++;
		//         }
		//     }
		// }
		// else{
		//     int mid = k/2;
		//     for(int i=0,j=0;i<k;i++){
		//         if(i%2==0){
		//             ar_one[i] = ar[mid-j];
        //             j++;
		//         }
		//         else{
		//             ar_one[i] = ar[mid+j];
		//         }
		//     }
		// }
		
		// for(int i=0;i<k;i++){
		//     System.out.print(ar_one[i]);
		// }
		// for(int i=k;i<n;i++){
		//     System.out.print(ar[i]);
		// }
		// System.out.println();
    }
}
