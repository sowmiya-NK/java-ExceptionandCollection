package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetType {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<Integer>();
        s.add(10);
        s.add(7);
        s.add(5);
        s.add(4);
        s.add(3);
        s.add(15);
        System.out.println("HashSetOrder order : " + s);//store sorted order


        Set<Integer> s1=new LinkedHashSet<>();
        s1.add(10);
        s1.add(7);
        s1.add(5);
        s1.add(4);
        s1.add(3);
        s1.add(15);
        System.out.println("LinkedHashSet Order : " + s1);

        Set<Integer> s2=new TreeSet<>();
        s2.add(10);
        s2.add(7);
        s2.add(5);
        s2.add(4);
        s2.add(3);
        s2.add(15);
        System.out.println("TreeSet Order : " + s2);//store sorted order


    }
}
