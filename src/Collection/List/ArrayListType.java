package Collection.List;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListType {
    public static void main(String[] args) {
        List list = new ArrayList<>();//define without generic it take all datatype
        list.add(12);
        list.add("abc");
        System.out.println(list);


        List<Integer> alist = new ArrayList<>();//only integer can store
        List<Integer> alist1 = new ArrayList<>();
        List<String> s=new ArrayList<>();
        s.add("a");
        s.add("e");
        s.add("i");
        s.add("o");
        s.add("u");
        System.out.println("String Array : " + s);



        for (int i = 1; i <= 10; i++) {
            alist.add(i);
            alist1.add(i);

        }
        System.out.println(alist);

        //arrayList methods
        System.out.println("equla Method : " + alist.equals(alist1));
        System.out.println("get Method : " + alist.get(4));
        System.out.println("replace Method : " + alist.set(2, 100));
        System.out.println("remove Method : " + alist.remove(6));
        System.out.println("Contain method : " + alist.contains(10));

        System.out.println(alist);
    }
}


//array and arrayList difference--->array can declare exact index value and arrayList we cannot declare index we add infintely