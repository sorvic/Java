package org.example.sem01.sw2;
// Дана последовательность n чисел
// Найти кол-во положительных чисел,
// после которых следует отрицательно число

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        // станндартная конструкция для ввода в консоль
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        int k = 0;
        int a = sc.nextInt();
        for (int i = 1; i < n; i++){
            int b = sc.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        System.out.println("k: " + k);
        // закрываем класс Scanner после использования - освобождаем память
        sc.close();
    }
}
