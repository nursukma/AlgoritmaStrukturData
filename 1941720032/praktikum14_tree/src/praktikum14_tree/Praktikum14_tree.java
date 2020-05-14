/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum14_tree;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Praktikum14_tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner nursukma = new Scanner(System.in);
        int pilih = 0;

        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            pilih = nursukma.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    bt.insert( nursukma.nextInt());
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    bt.delete(nursukma.nextInt());
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    System.out.println("Find " + bt.find(nursukma.nextInt()));
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println("");
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println("");
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Nilai terkecil: "+bt.minValue(bt.root));
                    break;
                case 8:
                    System.out.println("Nilai terbesar: "+bt.maxValue(bt.root));
                    break;
                case 9:
                    bt.printLeafNodes(bt.root);
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("Banyak leaf: "+bt.getLeafCount());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan tidak valid");
            }
        } while (pilih >= 0 || pilih <= 10);
    }

    public static void menu() {
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse inOrder");
        System.out.println("5. Traverse preOrder");
        System.out.println("6. Traverse postOrder");
        System.out.println("7. Smallest Value");
        System.out.println("8. Largest Value");
        System.out.println("9. Show leaf");
        System.out.println("10. Count leaf");
        System.out.println("0. Keluar");
    }
}
