import java.util.Scanner;

class knapsack {
	
	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}

	// static int knapsack(int W, int wt[], int val[], int n)
	// {
	// 	if (n == 0 || W == 0)
	// 		return 0;

	// 	if (wt[n - 1] > W)
	// 		return knapsack(W, wt, val, n - 1);

	// 	else
	// 		return max(val[n - 1]
	// 				+ knapsack(W - wt[n - 1], wt,
	// 							val, n - 1),
	// 				knapsack(W, wt, val, n - 1));
	// }

	public static void main(String args[])
	{
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter target weight");
        int w = sc.nextInt();
		int val[] = new int[n];
		int wt[] = new int [n];
        System.out.println("Enter all "+n+" elements");
        System.out.println("with formate weight\" \"value");
        for(int i= 0;i<n;i++){
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
		System.out.println("total max value is "+knp(w, wt, val, n));
        sc.close();
	}
	public static int knp(int w,int wt[],int val[],int n){
		if(w==0 || n==0){
			return 0;
		}
		else{
			if(wt[n-1]>w){
				return knp(w, wt, val, n-1);
			}
			else{
				return max((val[n-1]+knp(w-wt[n-1], wt, val, n-1)), knp(w, wt, val, n-1));
			}
		}
	}
}
