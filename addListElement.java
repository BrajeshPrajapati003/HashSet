import java.util.HashSet;
import java.util.ArrayList;
public class addListElement {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);

        for(int i: list){
            set.add(i);
        }

        System.out.println(set);
    }

}
