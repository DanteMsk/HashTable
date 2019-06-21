package com.company;

public class Strack {
    private Element first;

    public void insertList(String key, String value) {
        Element previous = null;
        Element current = first;

        while (current != null) {
            boolean cmp = key.equals(current.key);
            if (cmp) {
                current.value = value;
                return;
            } else {
                previous = current;
                current = current.next;
            }
        }
        Element node = new Element(key, value);
        if (previous == null) {
            first = node;
        } else {
            previous.next = node;
        }
    }

    public String findList(String key) {
        Element current = first;
        while (current != null) {
            boolean cmp = key.equals(current.key);
            if (cmp) {
                return current.value;
            } else {
                current = current.next;
            }
        }
        return null;
    }


    public void removeList(String key) {
        Element current = first;
        Element previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void displayList() {
        System.out.print("List:    ");
        Element current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}






