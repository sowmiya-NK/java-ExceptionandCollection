package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListType {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(list);

        Iterator i = list.iterator();//interface
        while (i.hasNext())
            System.out.println(i.next());//next next value print


    }
}

//arrayList and LinkedList have do same method function
//LinkedList uses-->easily insert and delete the date inbetween
//more memory alloation