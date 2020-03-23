/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7_sorting;

/**
 *
 * @author USER
 */
public class SortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        mergeSort mSort = new mergeSort();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergesort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
