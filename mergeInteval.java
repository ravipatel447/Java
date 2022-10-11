import java.util.Comparator;

public class mergeInteval {

    public static void main(String[] args) {
        
    }
    
} 
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
class first implements Comparator<Interval>{
    public int compare(Interval a, Interval b)
    {
        return a.start - b.start;
    }
}