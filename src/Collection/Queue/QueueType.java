package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueType {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(34);
        q.add(57);
        q.add(9);
        q.add(23);
        q.add(23);
        q.add(23);
        System.out.println("queue order : " + q);

        //methods
        System.out.println("peek : " + q.peek());//represents head
        System.out.println("remove : " + q.remove());//remove first input
        System.out.println("Poll : " + q.poll());//if queue is empty it return null
        System.out.println("Peek again : "+q.peek());
        System.out.println("array : " + q);


    }
}
