package HomeWork_3;

import HomeWork_3.Apple;
import HomeWork_3.Orange;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        // (массив может быть любого ссылочного типа);
        String[] arr = {"asd", "ds", "ret", "123"};
        //Integer[] arr = {3, 4, 6, 234, -1324, 111};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));



        //Задача 2. Коробки с фруктами

        System.out.println("Task 2");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box orangeBox1 = new Box();
        Box orangeBox2 = new Box();
        Box appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orangeBox1Weight = orangeBox1.getWeight();
        Float orangeBox2Weight = orangeBox2.getWeight();
        Float appleBoxWeight = appleBox.getWeight();
        String orange1Weight;
        System.out.println("Вес коробки 1 с апельсинами: " + orangeBox1Weight);
        String orange2Weight;
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2Weight);
        System.out.println("Вес коробки с яблоками: " + appleBoxWeight);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
//            orangeBox1.moveAt(appleBox);   Error

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}