import java.util.*;
public class deQueInsertion {
    
    public static void main(String[] args)
        throws IllegalStateException
    {

        Deque<Integer> DQ = new ArrayDeque<Integer>();

        DQ.add(9);
        DQ.add(3);
        DQ.add(5);
        DQ.add(7);

        System.out.println("Deque: " + DQ);
    }
}

