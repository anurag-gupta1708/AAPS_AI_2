import java.util.*;

class snakeLadder {

    static int[] t = new int[31];

    static int minThrow(int n, int arr[])
    {
        for (int i = 0; i < 31; i++) {
          
            t[i] = -1;
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < 2 * n; i = i + 2) {
            h.put(arr[i], arr[i + 1]);
        }
        return sol(1, h);
    }
    static int sol(int i, HashMap<Integer, Integer> h)
    {
        if (i >= 30)
            return 0;

        else if (t[i] != -1)
            return t[i];

        int min = Integer.MAX_VALUE;

        for (int j = 1; j <= 6; j++) {
            int k = i + j;
            if (h.containsKey(k)) {
                if (h.get(k) < k)
                    continue;
                k = h.get(k);
            }
            min = Math.min(min, sol(k, h) + 1);
        }
        t[i] = min;
        return t[i];
    }

    public static void main(String[] args)
    {
        int N = 8;
        int[] arr = new int[2 * N];
        arr[0] = 3;
        arr[1] = 22;
        arr[2] = 5;
        arr[3] = 8;
        arr[4] = 11;
        arr[5] = 26;
        arr[6] = 20;
        arr[7] = 29;
        arr[8] = 17;
        arr[9] = 4;
        arr[10] = 19;
        arr[11] = 7;
        arr[12] = 27;
        arr[13] = 1;
        arr[14] = 29;
        arr[15] = 9;

        System.out.println("Min Dice throws required is "+ minThrow(N, arr));
    }
}