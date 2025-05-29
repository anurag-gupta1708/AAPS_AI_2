  import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class deQuedeletion {

    public static void eraseAt(Deque<Integer> d, int x) {
        Iterator<Integer> itr = d.iterator();
        int index = 0;
        while (itr.hasNext()) {
            if (index == x) {
                itr.remove();
                break;
            }
            itr.next();
            index++;
        }
    }

    public static void eraseInRange(Deque<Integer> d, int start, int end) {
        for (int i = 0; i < end - start; i++) {
            eraseAt(d, start);  
        }
    }

    public static void eraseAll(Deque<Integer> d) {
        d.clear();
    }

    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(4);
        d.add(5);
        d.add(6);

        eraseAt(d, 2);  

        for (Integer num : d) {
            System.out.print(num + " ");
        }
        System.out.println();  
    }
}

