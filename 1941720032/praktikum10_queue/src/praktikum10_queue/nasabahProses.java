/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_queue;

/**
 *
 * @author USER
 */
public class nasabahProses {

    int max, front, rear, size;
    nasabah q[];

    public nasabahProses(int n) {
        max = n;
        create();
    }

    private void create() {
        q = new nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(String noRek, String nama) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        nasabah nb = new nasabah(noRek, nama);
        q[rear] = nb;
        size++;
    }

    public nasabah dequeue() {
        nasabah nb = new nasabah();
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            nb = q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return nb;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i!=rear) {
                System.out.println("No Rekening\t: " + q[i].noRekening);
                System.out.println("Nama Nasabah\t: " + q[i].nama);
                
                System.out.println("");
                
                i = (i+1) % max;
            }
            
            System.out.println("No Rekening\t: " + q[i].noRekening);
            System.out.println("Nama Nasabah\t: " + q[i].nama);

            System.out.println("Jumlah antrian: " + size);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("No Rekeneing terdepan\t: " + q[front].noRekening);
            System.out.println("Nama terdepan\t\t: " + q[front].nama);
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("No Rekeneing terbaru\t: " + q[rear].noRekening);
            System.out.println("Nama terbaru\t\t: " + q[rear].nama);
        }
    }

    public void peekPosition(nasabah NB) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i!=rear) {
                if (q[i].nama.equals(NB.nama) && q[i].noRekening.equals(NB.noRekening)) {
                    System.out.println("Datamu di antrian index ke-" + i);
                    break;
                }
                i = (i+1) % max;
            }
        }
    }

    public void printNasabah(int posisi) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Data di antrian index ke-" + posisi + " adalah\n" + 
                    "No Rekening\t: " +q[posisi].noRekening+"\n"+
                    "Nama\t\t: "+q[posisi].nama+"\n");
        }
    }
}
