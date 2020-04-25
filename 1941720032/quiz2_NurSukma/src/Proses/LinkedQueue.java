/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proses;

import dataobject.DataPasien;
import java.util.NoSuchElementException;

/**
 *
 * @author USER
 */
public class LinkedQueue {

    protected Node<DataPasien> front, rear;
    public int size;

    public LinkedQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public int getTotalWaktu() {
        if (isEmpty()) {
            return 0;
        } else {
            Node<DataPasien> tmp = front;
            int ttl = 0;
            int i = 0;
            while (tmp != null && i < size) {
                ttl = ttl + tmp.data.getWaktu();
                tmp = tmp.getNext();
                i++;
            }
            return ttl;
        }
    }

    public int getWaktuByNum(int no) {
        if (isEmpty() && no == 0 || no >= size) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (tmp != null && i < (no - 1)) {
                ttl += tmp.getData().getWaktu();
                i++;
                tmp = tmp.getNext();
            }
            return ttl;
        }
    }

    public int getAntri(int no) {
        if (isEmpty() && no == 0 || no >= size) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (i < size) {
                if (no == tmp.getData().getNo()) {
                    ttl = no - 1;
                    break;
                }
                tmp = tmp.getNext();
                i++;
            }
            return ttl;
        }
    }

    public int getRata() {
        if (isEmpty()) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (tmp!= null && i < size) {
                ttl += tmp.getData().getWaktu();
                i++;
                tmp.getNext();
            }
            return (ttl / size);
        }
    }
    
    public Object getInfo(int no){
        if (isEmpty()) {
            return "Antrian masih kosong";
        }else{
            Node tmp = front;
            Object data = null;
            while(tmp != null){
                if(no == tmp.getData().getNo()){
                    data = tmp.getData();
                }else{
                    data = "Inputan tidak valid";
                    break;
                }
                tmp = tmp.getNext();
            }
            return data;
        }
    }
    
    public void infoKeluhan(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else{
            Node tmp = front;
            int i = 1;
            while(tmp != null && tmp.getNext() != null){
                if(tmp.getData().getKeluhan() == tmp.getNext().data.getKeluhan()){
                    i++;
                    System.out.println(tmp.data.getKeluhan()+": "+i+" pasien");
                    tmp = tmp.getNext();
                }else{
                    i = 1;
                    System.out.println(tmp.data.getKeluhan()+": "+i+" pasien");
                }
                tmp = tmp.getNext();
            }
        }
    }

    public void insert(DataPasien data) {
        Node tmp = new Node(data, null);
        if (rear == null) {
            front = rear = tmp;
        } else {
            rear.setNext(tmp);
            rear = rear.getNext();
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        Node<DataPasien> tmp = front;
        front = tmp.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("" + tmp.getData());
    }

    public void print() {
        System.out.println("Data antrian");
        System.out.println("----------------------------------");
        if (size == 0) {
            System.out.print("Antrian masih kosong\n");
            return;
        }
        Node<DataPasien> ptr = front;
        while (ptr != rear.getNext()) {
            System.out.print(ptr.getData() + "\n");
            ptr = ptr.getNext();
        }
        System.out.println();
    }
}
