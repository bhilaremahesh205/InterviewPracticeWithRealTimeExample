package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {
    private static void creatEmpList(List<Emp> emps) {
        Emp e1 = new Emp();
        e1.setId("1");
        e1.setName("mahesh");
        e1.setCity("pune");

        Emp e2 = new Emp();
        e2.setId("2");
        e2.setName("mahesh");
        e2.setCity("pune");

        Emp e3 = new Emp();
        e3.setId("3");
        e3.setName("mahesh");
        e3.setCity("pune");

        Emp e4 = new Emp();
        e4.setId("4");
        e4.setName("mahesh");
        e4.setCity("pune");

        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
    }

    public static void main(String[] args) {
        List<Emp> emps = new ArrayList<>();
        creatEmpList(emps);
        Map<String, List<Emp>> empMap = emps.stream().collect(Collectors.groupingBy(Emp::getCity));
        empMap.forEach((key, value) ->
                System.out.println("City:" + key + "Emp:" + value));
    }
}
