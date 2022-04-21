package com.kidek;

import java.util.Scanner;
import static com.kidek.NumberDictionary.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            String num = in.nextLine();
            System.out.println(calc(num));
        }
    }


    public static String calc(String input) {

        int[] myArray = new int[] {
                input.indexOf("+"),
                input.indexOf("-"),
                input.indexOf("/"),
                input.indexOf("*")
        };

        if (myArray[0] == -1 & myArray[1] == -1 & myArray[2] == -1 & myArray[3] == -1)
            throw new ArithmeticException("Неверное выражение (нет оператора)"); // Ищем оператор в выражении

        int s = 0;
        for (int i = 0; i < 4; i++) if (myArray[i] < 0) myArray[i] = 100; //заменяет все -1 на 100 для удобства
        for (int i = 1; i < 4; i++)
            if (myArray[s] > (myArray[i])) s = i; // вычисляет какой из операторов встречается первее

        int index = switch (s) {
            case 0 -> input.indexOf("+");
            case 1 -> input.indexOf("-");
            case 2 -> input.indexOf("/");
            case 3 -> input.indexOf("*");
            default -> 0;
        };

        //Ищем аргументы в строке
        String A = input.substring(0, index).trim();
        String B = input.substring(index + 1, input.length()).trim();
//переводим аргументы в инты с помощью словаря
        int Aint = decoding(A);
        int Bint = decoding(B);
//блок проверок
        if (Aint == 0 | Bint == 0) throw new NumberFormatException("Допускаются только целочисленные аргументы в диапазоне 1-10 или I-X");
        if ((Aint >= 100 & Bint >= 1 & Bint <= 10) | (Bint >= 100 & Aint >= 1 & Aint <= 10))
            throw new ArithmeticException("Не допускается использовать арабские и римские числа одновременно");

//блок решения выражения
        int result = 0;
  //арабские числа
        if (Aint < 100 & Bint < 100) {
            if (s == 0) result = Aint + Bint;
            if (s == 1) result = Aint - Bint;
            if (s == 2) result = Aint / Bint;
            if (s == 3) result = Aint * Bint;
            return input + " = " + result;
        }
  //римские числа
        if (Aint > 100 & Bint > 100) {
            Aint = Aint - 100;
            Bint = Bint - 100;

            if (s == 0) result = Aint + Bint;
            if (s == 1) result = Aint - Bint;
            if (s == 2) result = Aint / Bint;
            if (s == 3) result = Aint * Bint;
            if (result < 0) throw new ArithmeticException("Результат меньше нуля (недопустимо для римских чисел)");
            return input + " = " + RomanNumerals(result);
        }
        return "ERROR";
    }

}