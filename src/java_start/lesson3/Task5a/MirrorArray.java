package java_start.lesson3.Task5a;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class MirrorArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите размер массива: ");
        int num = scn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        Arrays.sort(arr);
        System.out.println("Размер массива: ");
        System.out.println(arr.length);
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length >> 1; i++) {
            num = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = num;
        }
        System.out.println("Зеркальный массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
