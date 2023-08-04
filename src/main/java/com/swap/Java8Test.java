package com.swap;

import com.swap.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Test {
//    static void consumerTest(String s) {
//        System.out.println(s);
//    }

    //    static void BiConsumerTest(String s1, String s2){
//        System.out.println(s1);
//        System.out.println(s2);
//    }

    //    static Integer addList(List<Integer> lstInt){
//        return lstInt.stream().mapToInt(Integer::intValue).sum();
//    }
    public static void main(String[] args) {
        //Consumer<String> con = Java8Test::consumerTest;
        Consumer<String> con = s -> System.out.println(s);
        con.accept("abdbsbdsb");

        BiConsumer<String, String> bcon = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
        };
        bcon.accept("bdahb", "hdiahd");

        List<Integer> lstInt = new ArrayList<Integer>();
        lstInt.add(10);
        lstInt.add(11);

        Function<List<Integer>, Boolean> funsum = l -> l.removeAll(l);/*stream().filter(a -> a>10).collect(Collectors.toList())*//*mapToInt(Integer::intValue).count();*/
        Boolean res = funsum.apply(lstInt);
        System.out.println(funsum);
        System.out.println("result of sum of list: " + res);

        Employee emp1 = new Employee(5, "John", 29);
        Employee emp2 = new Employee(2, "kone", 32);
        Employee emp3 = new Employee(3, "Bone", 23);
        Employee emp4 = new Employee(8, "Tone", 54);

        List<Employee> lemp = new ArrayList<Employee>();
        lemp.add(emp1);
        lemp.add(emp2);
        lemp.add(emp3);
        lemp.add(emp4);

        // List<Employee> nlemp = lemp.stream().sorted().collect(Collectors.toList());/*filter(age->age.getAge()>30).collect(Collectors.toList());*/
        List<Employee> nlemp = lemp.stream().filter(age -> age.getAge() > 30).collect(Collectors.toList());
        System.out.println("Employee with more age" + nlemp);

        Predicate<String> pd = n -> n.startsWith("B");
        boolean verify = pd.test(emp1.getName());
        System.out.println("suitable name: " + verify);


    }
}
