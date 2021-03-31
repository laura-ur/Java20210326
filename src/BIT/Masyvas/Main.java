package BIT.Masyvas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        int[] m = {10, -2, 3, 5, 0, 5, 4, 3, -30};
        System.out.println(Arrays.toString(m));

        int empty = 0;

        System.out.println();

        for (int i = 0; i < m.length; i++) {
//            System.out.println((m[i]));
            for (int k = i + 1; k < m.length; k++) {
//                System.out.println((m[k]));
                if (m[i] < m[k]) {
                    empty = m[k];
                    m[k] = m[i];
                    m[i] = empty;
                }

            }

        }
        System.out.println(Arrays.toString(m));
    }
}