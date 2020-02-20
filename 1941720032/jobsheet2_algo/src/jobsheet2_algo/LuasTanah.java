/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2_algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LuasTanah {

    int panjang, lebar;

    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);

        System.out.print("Jumlah Tanah: ");
        LuasTanah[] lt = new LuasTanah[nursukma.nextInt()];

        int c = lt.length;
        int coba[] = new int[c];

        for (int i = 0; i < c; i++) {
            System.out.println("Tanah " + (i + 1));

            System.out.print("Panjang: ");
            lt[i] = new LuasTanah(nursukma.nextInt(), 0);

            System.out.print("Lebar: ");
            lt[i] = new LuasTanah(lt[i].panjang, nursukma.nextInt());
        }

        System.out.println("");

        for (int i = 0; i < c; i++) {
            coba[i] = lt[i].hitungLuas(lt[i].panjang, lt[i].lebar);

            System.out.println("Luas Tanah " + (i + 1) + ": "
                    + lt[i].hitungLuas(lt[i].panjang, lt[i].lebar));
        }

        int max = coba[0];
        int bb = 0;
        for (int i = 1; i < coba.length; i++) {
            max = Math.max(coba[i], max);
            bb = i;
        }
        System.out.println("Tanah Terluas ke- " + bb + " dengan: "+max);
    }

    public LuasTanah(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    int hitungLuas(int a, int b) {
        return a * b;
    }
}
