package Homework1;

import java.util.Arrays;

public class ChangeArrays {
    public static void main(String[] args) {

        Integer[] integerArr = {1, 2, 3, 4, 5};
        changeElements(integerArr, 2,4);
        String[] stringArr = {"А", "воз", "и", "ныне", "там"};
        changeElements(stringArr, 0, 3);
    }

    public static <V> void changeElements(V[] arrays, int i, int j) {
        if ((i < 0 || i >= arrays.length) || (j < 0 || j >= arrays.length)) {
            return;
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("Элементы массива с индексами " + i + " и " + j + " поменялись местами.");
        V change = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = change;
        System.out.println(Arrays.toString(arrays));
        System.out.println("******************************");
    }
}
