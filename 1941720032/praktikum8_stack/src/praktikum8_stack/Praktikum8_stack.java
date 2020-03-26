/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8_stack;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Praktikum8_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);
        System.out.print("Masukkan banyak tumpukan: ");
        int dt = nursukma.nextInt();
        Stack tumpukan = new Stack(dt);
        
        for(int i=dt;i>0;i--){
            System.out.print("Masukkan angka: ");
            tumpukan.push(nursukma.nextInt());
        }
        
        tumpukan.print();
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
    
}
