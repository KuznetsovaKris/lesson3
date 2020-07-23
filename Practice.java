package com.company;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        GuessTheNumber();
    }
    static void GuessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ваша задача угадать число от 0 до 9 с 3х попыток.");
        do {
            int number = random.nextInt(10);
            for(int i = 0;i < 3; i++) {
                System.out.println("Попытка № " + (int) (i + 1));
                System.out.println("Введите число");
                int input_number = scanner.nextInt();
                if (input_number < number) {
                    System.out.println("Загаданное число больше.");
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Вы угадали.");
                    break;
                }
            }  System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt() == 1);
        System.out.println("Игра окончена!");
    }
}
