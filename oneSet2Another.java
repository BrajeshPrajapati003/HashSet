import java.util.HashSet;

public class oneSet2Another {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);

        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(set);
        System.out.println("second set is: " + hs);
    }
}
