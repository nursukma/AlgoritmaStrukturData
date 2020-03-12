/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5_algo;

/**
 *
 * @author USER
 */
public class MhsBerprestasi {

    Mahasiswa list[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < list.length) {
            list[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : list) {
            m.tampil();
            System.out.println("-------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].ipk > list[j - 1].ipk) {
                    Mahasiswa tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < list.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].ipk < list[idxMin].ipk) {
                    idxMin = j;
                }
            }

            Mahasiswa temp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = temp;
        }
    }

    void insertionSort(boolean asc) {
        int i, j;
        for (i = 1; i < list.length; i++) {
            Mahasiswa temp = new Mahasiswa();
            temp = list[i];
            j = i;

            if (asc) {
                while ((j > 0) && (list[j - 1].ipk > temp.ipk)) {
                    list[j] = list[j - 1];
                    j--;
                }
                list[j] = temp;
            } else {
                while ((j > 0) && (list[j - 1].ipk < temp.ipk)) {
                    list[j] = list[j - 1];
                    j--;
                }
            }
        }
    }
}
