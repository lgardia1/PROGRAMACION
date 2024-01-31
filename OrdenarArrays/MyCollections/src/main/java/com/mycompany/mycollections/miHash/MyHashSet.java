
package com.mycompany.mycollections.miHash;

import java.util.HashSet;

public class MyHashSet {

    public HashSet<Integer> numbers;

    public MyHashSet() {
        this.numbers = new HashSet<>();
    }

    public HashSet<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(HashSet<Integer> numbers) {
        this.numbers = numbers;
    }

    public void addNumber(int n) {
        numbers.add(n);
    }

    public void removeNumber(int n) {
        numbers.remove(n);
    }

    public boolean exitNumber(int n) {
        return numbers.contains(n);
    }

    public void removeNumbers() {
        numbers.clear();
    }

    public int numberSize() {
        return numbers.size();
    }

    public void showNumber() {
        for (int i : numbers) {
            System.out.print(i+" ");
        }
    }
}
