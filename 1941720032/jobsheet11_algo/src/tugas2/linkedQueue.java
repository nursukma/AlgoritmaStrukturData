/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.NoSuchElementException;

/**
 *
 * @author USER
 */
public class linkedQueue {

    protected Node front, rear;
    public int size;

    public linkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /*  cek isi queue */
    public boolean isEmpty() {
        return front == null;
    }

    /*  mengambil value size */
    public int getSize() {
        return size;
    }

    /*  enqueue */
    public void insert(int data) {
        Node nptr = new Node(data, null);
        if (rear == null) {
            front = nptr;
            rear = nptr;
        } else {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
    }

    /*  dequeue */
    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Antrian masih kosong");
        }
        Node ptr = front;
        front = ptr.getLink();
        if (front == null) {
            rear = null;
        }
        size--;
        return ptr.getData();
    }

    /*  mengambil value posisi terdepan */
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Antrian masih kosong");
        }
        return front.getData();
    }

    /*  mengambil value posisi terbelakang */
    public int peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        return rear.getData();
    }

    /*  mengambil value berdasar data */
    void peekPosition(int data) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            Node tmp = front;
            int i = 0;
            while (i < size) {
                if (tmp.getData() == data) {
                    System.out.println("data terletak di index: " + i);
                    break;
                } else {
                    tmp = tmp.link;
                }
                i++;
            }
        }
    }

    /*  mengambil value berdasar posisi */
    void peekAt(int position) {
        if (!isEmpty()) {
            if (position < size) {
                int i = 0;
                Node tmp = front;
                while (i < size) {
                    if (i == position) {
                        System.out.println("Data index ke-" + position + " adalah " + tmp.getData());
                        break;
                    } else {
                        tmp = tmp.link;
                    }
                    i++;
                }
            } else {
                System.out.println("Index tidak valid");
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    /*  menampilkan queue */
    public void display() {
        System.out.print("Data antrian : ");
        if (size == 0) {
            System.out.print("Antrian masih kosong\n");
            return;
        }
        Node ptr = front;
        while (ptr != rear.getLink()) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}
