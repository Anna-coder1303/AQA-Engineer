import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumm(5, 8));
        checkNumb (125);
        System.out.println(checkNum(-36));
        printStr("Ура",3);
        System.out.println(whatYear(5));
        integArr();
        emptyIntArr();
        arrSix();
        twoArr();
        odnMas(6, 8);
    }

    public static void printThreeWords() {
        System.out.println("\nЗадание 1.");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }



    public static void checkSumSign() {
        System.out.println("\nЗадание 2.");
        int a = 1;
        int b = -3;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("\nЗадание 3.");
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        System.out.println("\nЗадание 4.");
        int a = 5;
        int b = 1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean checkSumm(int a, int b) {
        System.out.println("\nЗадание 5.");
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }


    public static void checkNumb(int a) {
        System.out.println("\nЗадание 6.");
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        }
        else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    static boolean checkNum(int a) {
        System.out.println("\nЗадание 7.");
        if (a < 0) return true;
        else return false;
    }

    public static void printStr(String s, int count) {
        System.out.println("\nЗадание 8.");
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }


    static boolean whatYear(int y) {
        System.out.println("\nЗадание 9.");
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            return true;
        else return false;
    }

    public static void integArr() {
        System.out.println("\nЗадание 10.");
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void emptyIntArr() {
        System.out.println("\nЗадание 11.");
        int size = 100;
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
        System.out.print("\n");
    }


    public static void arrSix() {
        System.out.println("\nЗадание 12.");
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
        }
        System.out.print("\n");
    }

    public static void twoArr() {
        System.out.println("\nЗадание 13.");
        int[][] kvadrat = new int[5][5];
        for (int i = 0; i < kvadrat.length; i++) {
            for (int j = 0; j < kvadrat.length; j++) {
                kvadrat[i][i] = 1;
                System.out.print(kvadrat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void odnMas(int len, int initialValue) {
        System.out.println("\nЗадание 14.");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        System.out.print("\n");
    }
}
