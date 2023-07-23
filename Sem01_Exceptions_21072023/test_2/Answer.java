package test_2;

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int sizeDiff = a.length - b.length;
        int sizeA = a.length;
        int c[] = new int[sizeA];
        int d[] = new int[]{0};
        if (sizeDiff == 0) {
            for (int i=0; i < sizeA; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        } else {
            return d;
        }

    }
}

