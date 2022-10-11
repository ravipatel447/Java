import java.util.*;

public class pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n  = sc.nextInt();
            long ground[] = new long [n];
            long water[] = new long [n];
            ArrayList<Interval> trainer = new ArrayList<>();
            for(int i=0;i<n;i++){
                ground[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++){
                water[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++){
                Interval a = new Interval(ground[i],water[i]);
                trainer.add(a);
            }
            Collections.sort(trainer,new first());

            ArrayList<Long> list = new ArrayList<>();
            int ans = Integer.MIN_VALUE;
            int values = 0;
            for(int i=n-1;i>=0;i--){
                int index = Collections.binarySearch(list, trainer.get(i).end);
                if(index<0){
                    index = index*(-1);
                    index--;
                }
                list.add(index, trainer.get(i).end);
                int strength = i + index;
                if(strength>ans){
                    ans = strength;
                    values = 1;
                }
                else if(strength==ans){
                    values++;
                }
            }
            System.out.println(values);
        }
    }
    static class Interval {
        long start;
        long end;
    
        Interval() {
            start = (long)0;
            end = (long)0;
        }
    
        Interval(long s, long e) {
            start = s;
            end = e;
        }
    }
    static class first implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            long diff = (a.start - b.start);
            if(diff<0) return -1;
            else if(diff>0) return 1;
            return 0;
        }
    }
}



