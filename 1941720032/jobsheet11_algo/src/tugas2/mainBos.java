/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class mainBos {
    public static void main(String[] args)
    {
        Scanner nursukma = new Scanner(System.in); 
        /* instansiasi object */   
        linkedQueue lq = new linkedQueue();           
        char ch;        
        do
        {
            System.out.println("Pilih Menu");
            System.out.println("1. Queue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Peek Rear");
            System.out.println("6. Peek Position");
            System.out.println("7. Peek At");
            System.out.println("0. Keluar");
            System.out.println("-----------------");
            int choice = nursukma.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.print("Masukkan data: ");
                lq.insert( nursukma.nextInt() );
                break;                         
            case 2 : 
                try 
                {
                    System.out.println("Data yang dikeluarkan: "+ lq.remove());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Elemen terakhir : "+ lq.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                lq.display();
                break;
 
            case 5 : 
                System.out.println("Elemen terbaru : "+ lq.peekRear());
                break;  
            case 6:
                System.out.print("Masukkan data: ");
                lq.peekPosition(nursukma.nextInt());
                break;
            case 7:
                System.out.print("Masukkan posisi: ");
                lq.peekAt(nursukma.nextInt());
                break;
            default : 
                System.out.println("Maaf inputan tidak cocok");
                break;
            }
            System.out.println("----------------------------------------");
            System.out.print("Do you want to continue (Type y or n) \n");
            ch = nursukma.next().charAt(0);
            System.out.println("----------------------------------------");
        } while (ch == 'Y'|| ch == 'y');                                                            
    } 
}
