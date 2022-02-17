package Homework1;

import java.util.ArrayList;
import java.util.List;

public class TaskWithArraysList {
    public static void main(String[] args) {
        Integer[] integerArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"А", "воз", "и", "ныне", "там"};
        System.out.println("Преобразование массива в ArrayList");
        System.out.println(taskWithArraysList(integerArr));
        System.out.println(taskWithArraysList(stringArr));
    }

    public static <V> List<V> taskWithArraysList(V[] arrays) {
        ArrayList<V> list = new ArrayList<>();
        for (V arr : arrays) {
            list.add(arr);
        }
        return list;
    }
}

