/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2_algo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PacMan {
   int x, y, width, heigth;

    public static void main(String[] args) {
        PacMan pm = new PacMan();
        pm.x = 10;pm.y=10;pm.width=100;pm.heigth=100;
        
        Scanner nursukma = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("1. Move Left");
            System.out.println("2. Move Right");
            System.out.println("3. Move Up");
            System.out.println("4. Move Down");
            System.out.println("0. Keluar");

            System.out.print("Pilih Menu: ");
            pilih = nursukma.nextInt();

            switch (pilih) {
                case 1:
                    pm.moveLeft(pm.x);
                    pm.printPosition(pm.x, pm.y);
                    break;
                case 2:
                    pm.moveRight(pm.x);
                    pm.printPosition(pm.x, pm.y);
                    break;
                case 3:
                    pm.moveUp(pm.y);
                    pm.printPosition(pm.x, pm.y);
                    break;
                case 4:
                    pm.moveDown(pm.y);
                    pm.printPosition(pm.x, pm.y);
                    break;
                default:

            }
        } while (pilih != 0);
    }

    public PacMan() {
    }

    public PacMan(int x, int y, int width, int heigth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    }

    void moveLeft(int a) {
        a --;
    }

    void moveRight(int a) {
        a ++;
    }

    void moveUp(int a) {
        a -- ;
    }

    void moveDown(int a) {
        a ++;
    }

    void printPosition(int a, int b) {
        System.out.println(a + " " + b);
    }
    
}
