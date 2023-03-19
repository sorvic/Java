package org.example.les01;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class programm {

    public static void main(String[] args) {
        System.out.println("Hi world!"); // вывод в терминал

        String s = null;
        System.out.println(s);
        String s2 = "    2";
        System.out.println(s2);

        // Примитивные типы данных
        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        float e = 2.7f; // обязательно указываем в конце f - указатель, что тип float - по-умолчанию double
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        char ch2 = 123;
        System.out.println(Character.isDigit(ch2)); // false
        System.out.println(ch2); // выводит - { - то есть происходит неявное преобразование в символ

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        boolean f1 = true || false;
        System.out.println(f1); // true
        boolean f2 = true && false;
        System.out.println(f2); // false
        boolean f3 = true & false;
        System.out.println(f3); // false
        // ^ - Разделяющая дизъюнкция или разделяющее или-или - возвращает истину тогда и только тогда, когда строго только одно истино!
        // || - или
        // & - и

        boolean f4 = true ^ false;
        System.out.println(f4); // true
        boolean f5 = true ^ true;
        System.out.println(f5); // false

        // СТРОКИ
        String msg = "Hello world";
        System.out.println(msg); // Hello world


        // НЕЯВНАЯ типизация
        var a = 123;
        System.out.println(a);
        var b = 123.456;
        System.out.println(b);
        System.out.println(getType(a)); // Integer
        System.out.println(getType(b)); // Double


        //Классы-обертки
        // int - Integer
        // short - Short
        // long - Long
        // byte - Byte
        // float - Float
        // double - Double
        // char - Character
        // boolean - Boolean

        // можно назначить переменную через int
        int i = 123_321; // можно разделять триады нижним подчеркиванием
        // Но пользоваться встроенными свойствами можно только через полное название Класса
        System.out.println(Integer.MIN_VALUE); // min значение
        System.out.println(Integer.MAX_VALUE); // max значение
        System.out.println(Integer.toString(i)); // перевод в строку
        System.out.println(getType(Integer.toString(i))); // String


        // как обратиться к символу в строке - не как в Python просто указанием индекса, а через строенный метод
        String str = "qwer";
        str.charAt(1); //w
        System.out.println(str.charAt(1));


        // Операции Java
        // Инкримент, декримент
        int a1 = 123;

        System.out.println(a1++); // 123
        // вывод в кончоль имеет более высокий приоритет, поэтому сначала срабатывать вывод, потом сложение!
        System.out.println(a1); // 124
        // НО!
        System.out.println(++a1); // 125
        System.out.println(a1); // 125

        // Вопросы с интервью! Чему будет равно?
        System.out.println(a1-- - --a1); // 125 - 123 = 2
        System.out.println(--a1 - a1--); // 122 - 122 = 0
        System.out.println(--a1 - a1--); // самое хитрое - писать без пробелов


        // Операции сравнения: <, >, ==, !=, >=, <=
        // Логические операции: ||, &&, ^, !
        // Конъюнция, дизъюнкция, разделительная дизъюнкция, инверсия
        // ^ - Разделяющая дизъюнкция или разделяющее или-или - возвращает истину тогда и только тогда, когда строго только одно истино!
        // || - или
        // & - и (прорверяет все значения)
        // && - и (проверяет первое значение и если он false, дальше не проверяет)

        // Побитовые операции: <<, >>, &, |, ^
        int a2 = 8;
        System.out.println(a2); // 8 в двоичном 1000
        System.out.println(a2 << 1); // 8 в двоичном 10000
        System.out.println(a2 >> 1); // 8 в двоичном 100

        int a3 = 18;
        System.out.println(a3); // 18 в двоичном 10010
        System.out.println(a3 << 1); // 36 в двоичном 100100
        System.out.println(a3 << 2); // 72 в двоичном 1001000
        System.out.println(a3 << 3); // 144 в двоичном 10010000
        System.out.println(a3 >> 1); // 9 в двоичном 1001
        System.out.println(a3 >> 2); // 4 в двоичном 100
        System.out.println(a3 >> 3); // 2 в двоичном 10

        // Побитовые опреации и(&) или(|)
        int i1 = 5;
        int i2 = 2;
        System.out.println((i1 | i2)); // 7
        // 5 = 101
        // 2 = 010
        //     111 = 7
        // (побитово сравниваем)
        // 1 или 1 = 1, 0 или 1 = 1, 1 или 0 = 1 => 111
        System.out.println((i1 & i2));
        // 5 = 101
        // 2 = 010
        //     000 = 0
        System.out.println((i1 ^ i2));
        // 5 = 101
        // 2 = 010
        //     111 = 7


        // МАССИВЫ
        int[] arr = new int[10];
        // на собесе могут спросит можно ли пистаь вот так int brr[] - так тоже можно
        System.out.println(arr.length); // 10
        System.out.println(arr[3]); // 0
        arr[3] = 7;
        System.out.println(arr[3]); // 7

        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5

        // МНОГОМЕРНЫЕ МАССИВЫ
        int[] arr1[] = new int[3][5];
        // int[][] arr = new int[3][5]; - можно и так записать [][] -массивы массивов
        for (int[] line : arr1) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }

        // Преобразование типов
        int i5 = 123;
        double d5 = i;
        System.out.println(i5);  // 123
        System.out.println(d5);  // 123.0
        d5 = 3.1415;
        i5 = (int) d5;
        System.out.println(d5);  // 3.1415
        System.out.println(i5);  // 3
        d5 = 3.9415;
        i5 = (int) d5;
        System.out.println(d5);  // 3.9415
        System.out.println(i5);  // 3
        byte b5 = Byte.parseByte("123");
        System.out.println(b5);  // 123
        //b5 = Byte.parseByte("1211");
        //System.out.println(b5);  // NumberFormatException: Value out of range -
        // потому что Byte может зранить даннеы от 0 до 255


        // Получение данных из терминала
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();


//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        // - проверка является ли вводимое чсило цифрой?
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        //
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();


        // ФОрматированный вывод
        String s6 = "qwe";
        int a6 = 123;
        String q = s6 + a6; // операция конкатенации
        // конкатенации строк очень опасны - могут забить всю память
        System.out.println(q);

        int a7 = 1, b7 = 2;
        int c7 = a7 + b7;
        String res = String.format("%d + %d = %d \n", a7, b7, c7);
        System.out.printf("%d + %d = %d \n", a7, b7, c7);
        System.out.println(res);

        // Виды спецификаторов
        //%d: целочисленных значений
        //%x: для вывода шестнадцатеричных чисел
        //%f: для вывода чисел с плавающей точкой
        //%e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        //%c: для вывода одиночного символа %s: для вывода строковых значений

        float pi1 = 3.1415f;
        System.out.printf("%f\n", pi1);    // 3,141500
        System.out.printf("%.2f\n", pi1);  // 3,14
        System.out.printf("%.3f\n", pi1);  // 3,141
        System.out.printf("%e\n", pi1);    // 3,141500e+00
        System.out.printf("%.2e\n", pi1);  // 3,14e+00
        System.out.printf("%.3e\n", pi1);  // 3,141e+00


        // Област видимости переменных
        {
            int i7 = 123;
            System.out.println(i7);
        }
        int i7 = 3;
        System.out.println(i7);


        // ФУНКЦИИ И МЕТОДЫ
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0


        // Управляющие конструкции
        int a8 = 1;
        int b8 = 2;
        int c8;
        if (a8 > b8) {
            c8 = a8;
        } else {
            c8 = b8;
        }
        System.out.println(c8);

        // можно ипсользовать укороченную запись
        if (a8 > b8) c8 = a8;
        if (b8 > a8) c8 = b8;

        // тернарный оператор
        int min = a8 < b8 ? a8 : b8;
        System.out.println(min);

        // switch - оператор выбора
        int mounth = 1;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);


        // ЦИКЛЫ
        //цикл while;
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count); //3


        //цикл do while;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count); //4


        //цикл for; и его модификация for in
        int s0 = 0;
        for (int i0 = 1; i0 <= 10; i0++) {
            s0 += i0;
        }
        System.out.println(s0); //55

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) continue;
            System.out.println(j);
        }
        // continue и break - не очень жалуют а разработке, считается признаком быдлокодинга
        // учитесь обходится без них

        // for для коллекций
        int arr0[] = new int[]{1, 2, 3, 55, 77, 56};
        for (int item : arr0) {
            System.out.printf("%d ", item);
        }
        System.out.println();


        // Работа с файлами - СОЗДАНИЕ и ЗАПИСЬ/дозапись
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


//        // ЧТЕНИЕ - вариант посимвольно
//  public static void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("file.txt");
//        int c;
//        while ((c = fr.read()) != -1) {
//            char ch = (char) c;
//            if (ch == '\n') {
//                System.out.print(ch);
//            } else {
//                System.out.print(ch);
//            }
//        }
//  }

        // ЧТЕНИЕ - вариант построчно
//  public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//        String str0;
//        while ((str0 = br.readLine()) != null) {
//            System.out.printf("== %s ==\n", str0);
//        }
//        br.close();
//  }
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    // ФУНКЦИИ И МЕТОДЫ
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }

}   