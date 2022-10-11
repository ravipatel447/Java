import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        // int lastElement = 171;
        int lastElement = 1300;
        for(int i=1;i<=lastElement;i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            map.put(i,list);
        }

        for(int i=2;i<lastElement;i++){
            for(int j=1;(i*j)<=lastElement;j++){
                int get = i*j;
                ArrayList<Integer> list = map.get(get);
                list.add(i);
                map.put(get, list);
            }
        }
        // System.out.println("completed");
        System.out.println(map);
        // int t = sc.nextInt();
        // while (t-- != 0) {
        //     int n
        // }
    }
    
}
