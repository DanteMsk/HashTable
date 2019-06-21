package com.company;

public class HashTable {
    private Strack[] Array;


    public HashTable (int size){
        Array = new Strack[size];
        for (int i = 0; i<size; i++){
            Array[i] = new Strack();
        }
    }


    public void print() {                                       // Вывод хеш-таблицы на экран
        for(int i = 0; i< Array.length; i++) {
            System.out.print(i + ". ");
            Array[i].displayList();
        }
    }


    public int hashFunc(String key) {
        return Math.abs(key.hashCode()) % Array.length;
    }


    public void put(String key, String value) {                 // Добавление значения
        int hashIndex = hashFunc(key);
        Array[hashIndex].insertList(key, value);
    }


    public void remove (String key) {                           // Удаление элемента
        int hashIndex = hashFunc(key);
        Array[hashIndex].removeList(key);
    }

    public String find(String key) {                            // Поиск элемента
        int hashIndex = hashFunc(key);
        return Array[hashIndex].findList(key);
    }
}
