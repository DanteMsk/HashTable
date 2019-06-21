package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        HashTable hashTable = new HashTable(size());
        int command = -1;
        do {
            menu();
            System.out.print("Введите команду: ");
            if (input.hasNextInt()) {
                command = input.nextInt();
            } else {
                input.next();
                System.out.print("Некорректный ввод!\n");
                continue;
            }
            switch (command) {
                case 1:
                    hashTable.put(key(), value());
                    System.out.println();
                    hashTable.print();
                    System.out.println();
                    break;
                case 2:
                    String find = hashTable.find(key());
                    if (find == null) {
                        System.out.println("элемент не найден.");
                    } else {
                        System.out.println("Поиск: " + find);
                    }
                    System.out.println();
                    break;
                case 3:
                    hashTable.remove(key());
                    System.out.println();
                case 4:
                    hashTable.print();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Программа завершена.");
                    break;
                default:
                    System.out.print("Неверно введена команда!\n");
            }
        }
        while (command != 5);
    }

    public static void menu() {
        System.out.println("Меню программы:" +
                "\n" + "1. добавить" +
                "\n" + "2. найти" +
                "\n" +"3. удалить" +
                "\n" + "4. печать" +
                "\n" + "5. выход");
    }

    public static String key() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        return sc.nextLine();
    }

    public static String value() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите элемент: ");
        return sc.nextLine();
    }

    public static int size() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер хеш-таблицы: ");
        return input.nextInt();
    }
}
