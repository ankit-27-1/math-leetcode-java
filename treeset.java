import java.util.*;
public class file9 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Chennai");
        System.out.println(cities);
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Chennai");
        System.out.println(lhs);
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Chennai");
        System.out.println(ts);
    }
}
