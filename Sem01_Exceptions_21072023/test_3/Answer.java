package test_3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int sizeDiff = a.length - b.length;
        int sizeA = a.length;
        int c[] = new int[sizeA];
        int d[] = new int[]{0};
        boolean divZero = true;
        boolean resNotInt = true;

        if (sizeDiff == 0) {
            for (int i=0; i < sizeA; i++) {
                if (b[i] == 0) {
                    divZero = false;
                    throw new RuntimeException("на ноль делить нельзя");
                } else
                {
                    if (a[i] % b[i] != 0) {
                        resNotInt = false;
                        throw new RuntimeException("числа " + a[i] + " и " + b[i] + " не являются кратными");
                    }
                }
                if (resNotInt && divZero) {
                    c[i] = a[i] / b[i];
                }
            }
            return c;
        } else {
            return d;
        }

    }
}

