/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author USER
 * @param <T>
 */
public class LinkedList<T> {

    Node<T> head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void addFirst(T item) {
        head = new Node<T>(item, head);
        size++;
    }

    public void add(T item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (IsEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }

    public void addByValue(T item, int cari) throws Exception {
        if (IsEmpty()) {
            addFirst(item);
        } else {
            Node<T> tmp = head;
            while (tmp != null && tmp.data.equals(cari)) {
                tmp = tmp.next;
            }

            if (tmp != null) {
                tmp.next = new Node(item, tmp.next);
            }
            size++;
        }
    }

    public void addLast(T item) {
        if (IsEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        }
    }

    public Object get(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getValue(int item) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Nilai index di luar batas");
        }
        Node<T> tmp = head;
         
        int i = 0;
        while (tmp != null) {
            String a = tmp.data.toString().substring(0, 3);
            if(Integer.parseInt(a) == item){
                break;
            }else{
                tmp = tmp.next;
            }
            i++;
        }
        return i;
    }

    public void remove(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeByValue(int item) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node<T> prev = head;
            Node<T> cur = head.next;
            Mahasiswa m = new Mahasiswa();
            while (prev != null && cur != null && prev.data.equals(m.getNim() == item)) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!IsEmpty()) {
            Node<T> tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
