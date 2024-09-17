import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        zadanie5();
        zadanie6();
        zadanie7();
        zadanie8();
        zadanie9();
        zadanie10();
        zadanie11();
        zadanie12();
        zadanie13();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.print("\n");
    }



    public static void checkSumSign() {
        int a = 1;
        int b = -3;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.print("\n");
    }

    public static void printColor() {
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
        System.out.print("\n");
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.print("\n");
    }

    public static void zadanie5() {
        int a = 5;
        int b = 100;
        int c = a + b;
        boolean d = c >= 10 && c <= 20;
        {
            System.out.println(d);
        }
        System.out.print("\n");
    }


    public static void zadanie6() {
        int f = 125;

        if (f >= 0) {
            System.out.println("Число " + f + " положительное");
        } else {
            System.out.println("Число " + f + " отрицательное");
        }
        System.out.print("\n");
    }

    public static void zadanie7() {
        int a = 53;
        boolean b = a < 0;
        {
            System.out.println(b);
        }
        System.out.print("\n");
    }

    public static void zadanie8() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ура");
        }
        System.out.print("\n");
    }


    public static void zadanie9() {
        int x = 10;
        if (!(x % 4 == 0) || ((x % 100 == 0) && !(x % 400 == 0))) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        System.out.print("\n");
    }

    public static void zadanie10() {
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("\n");
    }

    public static void zadanie11() {
        int size = 100;
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
        System.out.print("\n");
        System.out.print("\n");
    }


    public static void zadanie12()
    {
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
        System.out.print("\n");
    }


    public static void zadanie13() {
        int[][] kvadrat = new int[5][5];
        for (int i = 0; i < kvadrat.length; i++) {
            for (int j = 0; j < kvadrat.length; j++) {
                kvadrat[i][i] = 1;
                System.out.print(kvadrat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class zadanie14 {
    public static void main (String args[]) {
        int len = 6;
        int initialValue = 8;
    }
public static void zadanie14(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
        arr[i] = initialValue;
        System.out.print("[" + i + "]" + arr[i] + " ");
    }
}
}