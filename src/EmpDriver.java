import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpDriver {

    public static void main(String[] args) {
        List<Emp> emps=new ArrayList<>();
        emps.add(new Emp("a","clerk"));
        emps.add(new Emp("b","clerk"));
        emps.add(new Emp("c","clerk"));
        emps.add(new Emp("d","watchMan"));
        emps.add(new Emp("e","watchMan"));
        emps.add(new Emp("f","watchMan"));
        emps.add(new Emp("f","XXXX"));
        emps.stream().filter(a->a.getJob().equals("clerk")).collect(Collectors.toList()).forEach(System.out::println);
        Map<String, Long> collect = emps.stream().collect(Collectors.groupingBy(Emp::getJob, Collectors.counting()));
        Set set=new HashSet();
        emps.stream().filter(a->set.add(a.getJob())).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(set);

    }
}
