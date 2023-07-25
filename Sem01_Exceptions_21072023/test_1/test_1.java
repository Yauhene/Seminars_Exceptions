package test_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[5];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i;
        }

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 5;
        int b = 5;
        int c = 9;
        double result = c / (a - b);
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String fWorld = "Fucking world!!!";
        System.out.println(Integer.parseInt(fWorld));
    }

}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
