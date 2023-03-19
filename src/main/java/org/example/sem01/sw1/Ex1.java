package org.example.sem01.sw1;
// Учитывая целое число n, верните разницу между произведением
// его цифр и суммой его цифр.

//Input: n = 234
//Output: 15
//Explanation:
//Product of digits = 2 * 3 * 4 = 24
//Sum of digits = 2 + 3 + 4 = 9
//Result = 24 - 9 = 15

//Input: n = 4421
//Output: 21
//Explanation:
//Product of digits = 4 * 4 * 2 * 1 = 32
//Sum of digits = 4 + 4 + 2 + 1 = 11
//Result = 32 - 11 = 21

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("result : %d",subtractProductAndSum(n));
    }

    // МЕТОДЫ - то что можем использовать в коде несколько раз
    public static int subtractProductAndSum(int n) {
        int sum = 0, multi = 1;
        // Для ввода чисел есть класс Scanner
        while (n != 0) {
            sum += n%10;
            multi *= n%10;
            n /= 10;
        }
        return multi - sum;
    }

}
