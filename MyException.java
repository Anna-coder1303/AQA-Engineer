class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class MyArrayDataException extends MyException {

    MyArrayDataException(int i, int j) {
        super(String.format("Неверные данные лежат в ячейке [%d, %d]\n", i, j));
    }
}

class MyArraySizeException extends MyException {

    MyArraySizeException() {
        super("Неверный размер массива, размер массива должен быть [4 x 4]\n");
    }
}

class Converter {
    static int strConverter(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new MyArraySizeException();
        for (int i = 0; i < strArray.length; i++) {
            if (4 != strArray[i].length) throw new MyArraySizeException();
            for (int k = 0; k < strArray[i].length; k++) {
                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String[][] correctM = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"0", "0", "0", "0"}
        };
        String[][] wrongSizeM = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"0", "0"}
        };
        String[][] wrongCharM = {
                {"A", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"0", "0", "0", "0"}
        };

        try {
            System.out.println("Задание 1:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctM) + ".\n");
        } catch (MyException e) {
            e.getMessage();
        }

        try {
            System.out.println("Задание 2:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeM) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Задание 3:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharM) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

