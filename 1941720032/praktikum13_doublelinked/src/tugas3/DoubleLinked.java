/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author USER
 */
public class DoubleLinked {

    Node<Mahasiswa> head;
    int size;

    public DoubleLinked() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa m) {
        if (isEmpty()) {
            head = new Node(null, m, null);
        } else {
            Node newNode = new Node(null, m, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Mahasiswa item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            System.out.println("Nilai index diluar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data.nama + "\t" + tmp.data.nilai + "\n");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        }
        return head.data;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void getPcc(String data) throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (tmp.data.nama.contains(data)) {
                index = i;
                System.out.println("Data ditemukan di index ke-" + index);
                break;
            }
            index = 99;
            tmp = tmp.next;
        }
        if (index == 99) {
            System.out.println("Data tidak tersedia");
        }
    }

    public String[][] addArr() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }
        Node tmp = head;
        String arr[][] = new String[size][2];
        for (int i = 0; i < arr.length; i++) {
            if (tmp != null) {
                arr[i][0] = tmp.data.nama;
                arr[i][1] = "" + tmp.data.nilai;
            }
            tmp = tmp.next;
        }
        return arr;
    }

    public void bubbleSort(String arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Integer.parseInt(arr[j][1]) < Integer.parseInt(arr[j + 1][1])) {
                    int temp = Integer.parseInt(arr[j][1]);
                    String t = arr[j][0];
                    arr[j][1] = arr[j + 1][1];
                    arr[j][0] = arr[j+1][0];
                    arr[j + 1][1] = String.valueOf(temp);
                    arr[j + 1][0] = t;
                }
            }
        }
    }

    public void insertionSort(String arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(arr[i][1]);
            String t = arr[i][0];
            int j = i - 1;

            while (j >= 0 && Integer.parseInt(arr[j][1]) < temp) {
                arr[j + 1][1] = arr[j][1];
                arr[j+1][0] = arr[j][0];
                j -= 1;
            }
            arr[j + 1][1] = String.valueOf(temp);
            arr[j + 1][0] = t;
        }
    }

    public void mergeProses(String arr[][], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[][] = new String[n1][2];
        String R[][] = new String[n2][2];

        for (int i = 0; i < n1; i++) {
            L[i][1] = arr[l + i][1];
            L[i][0] = arr[l + i][0];
        }
        for (int j = 0; j < n2; j++) {
            R[j][1] = arr[1 + m + j][1];
            R[j][0] = arr[1 + m + j][0];
        }

        int x = 0, y = 0;
        int k = l;
        while (x < n1 && y < n2) {
            if (Integer.parseInt(L[x][1]) >= Integer.parseInt(R[y][1])) {
                arr[k][1] = L[x][1];
                arr[k][0] = L[x][0];
                x++;
            } else {
                arr[k][1] = R[y][1];
                arr[k][0] = R[y][0];
                y++;
            }
            k++;
        }

        while (x < n1) {
            arr[k][1] = L[x][1];
            arr[k][0] = L[x][0];
            x++;
            k++;
        }

        while (y < n2) {
            arr[k][1] = R[y][1];
            arr[k][0] = R[y][0];
            y++;
            k++;
        }
    }

    public void mergeSort(String arr[][], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            mergeProses(arr, l, m, r);
        }
    }

    public void printArray(String arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }
}
