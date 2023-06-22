package Operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntData {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,6,44,7,1,44,22,55,11,555);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
