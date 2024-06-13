package ru.yandex.praktikum.lessons.arrays;

import java.util.Scanner;
import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива: ");
        int countOfArrays = scanner.nextInt();
        int[] newArray = new int[countOfArrays];
        Random random = new Random();

        for (int i = 0; i<newArray.length; i++){
            newArray[i] = random.nextInt(100);
        }

        System.out.print("Сгенерированный массив: [");
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]);
            if (i < newArray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Длина массива: " + newArray.length);
        int countNumberMoreThan8 = 0;
        int countNumberEqual1 = 0;
        int countEvenNumber = 0;
        int countOddNumber = 0;
        int arraySum = 0;

        for (int x:newArray){
            if (x > 8){
                countNumberMoreThan8++;
            }
            if (x == 1){
                countNumberEqual1++;
            }
            if (x % 2 == 0){
                countEvenNumber ++;
            }
            if (x % 2 !=0){
                countOddNumber++;
            }
            arraySum = arraySum + x;
        }

        System.out.println("Количество чисел больше 8: " + countNumberMoreThan8);
        System.out.println("Количество чисел равных 1: " + countNumberEqual1);
        System.out.println("Количество четных чисел: " + countEvenNumber);
        System.out.println("Количество нечетных чисел: " + countOddNumber);
        System.out.println("Сумма всех чисел в массиве: " + arraySum);

        scanner.close();

    }
}
