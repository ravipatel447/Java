import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sleepingTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int l[] = new int [n];
            int r[] = new int [n];
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            ArrayList<Interval> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
                Interval x = new Interval(l[i],r[i]);
                list.add(x);
            }
            Collections.sort(list,new First());
            HashMap<Interval,Integer> map = new HashMap<>();
            for(Interval var: list){
                map.put(var,1);
            }
            int size = list.size();
            for(int i=1;i<size;i++){
                Interval curr = list.get(i);
                Interval pre = list.get(i-1);
                int preend = pre.end;
                if(pre.end>=curr.start){
                    int preval = map.get(pre);
                    int currval = map.get(curr);
                    map.remove(pre);
                    map.remove(curr);
                    pre.start = Math.min(pre.start, curr.start);
                    pre.end = curr.start-1;
                    list.set(i-1, pre);
                    map.put(pre, preval);
                    int nstart = curr.start;
                    int nend = Math.min(curr.end, pre.end);
                    Interval now = new Interval(nstart,nend);
                    list.add(i, now);
                    map.put(now, Math.max(preval, currval)+1);
                    curr.start = nend+1;
                    curr.end = Math.max(curr.end, preend);
                    map.put(curr, currval);
                    list.set(i+1, curr);
                    Collections.sort(list,new First());
                    i--;
                }
            }
            System.out.println("The ans is start from here");
            System.out.println("----------------------------------------");
            for(Map.Entry<Interval,Integer> entry: map.entrySet()){
                System.out.println("( "+entry.getKey().start +" , "+entry.getKey().end+" )  --> "+entry.getValue());
            }
        }
        sc.close();
    }
    static class Interval{
        int start;
        int end;
        Interval(){
            start = 0;
            end = 0;
        }
        Interval(int a,int b){
            start = a;
            end = b;
        }
    }
    static class First implements Comparator<Interval>{
        public int compare(Interval a,Interval b){
            return a.start-b.start;
        }
    }
}
