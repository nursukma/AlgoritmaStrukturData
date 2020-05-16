/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_nursukma;

/**
 *
 * @author USER
 */
public class DoubleLinkedList {
    
    Node<BukuObject> head;
    int size;
    
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(BukuObject data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void upStok(int key, String judul, int stok, BukuObject data) {
        Node tmp = head;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (tmp.data.getKdBuku() == key && tmp.data.getJudul().equalsIgnoreCase(judul)) {
                tmp.data.stok += stok;
                flag = true;
            }
            tmp = tmp.next;
        }
        
        if (flag) {
            removeDuplicates(tmp);
            
        } else {
            addFirst(data);
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            if (head.data.getStok() == 0) {
                System.out.println("Maaf stok tidak bisa dikurangi");
            } else {
                head = head.next;
                head.prev.data.stok -= 1;
            }
        }
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        } else if (head.next == null) {
            if (head.data.getStok() == 0) {
                System.out.println("Maaf stok tidak bisa dikurangi");
            } else {
                head.data.stok -= 1;
                return;
            }
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next.data.stok -= 1;
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
                current.prev.next.data.stok -= 1;
            } else if (current.prev == null) {
                current = current.next;
                current.prev.data.stok -= 1;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }
    
    public Object getFind(Object data) throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong");
        }
        Node tmp = head;
        Object hasil = null;
        
        while (tmp != null) {
            if (data.equals(tmp.data.getJudul()) || data.equals(String.valueOf(tmp.data.getKdBuku()))) {
                hasil = tmp.data;
            }
            tmp = tmp.next;
        }
        return hasil;
    }
    
    public void addRusak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index diluar batas");
        }
        Node tmp = head;
        
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.setKeadaan("Rusak");
    }
    
    public void sortList() {
        Node current = null, index = null;
        BukuObject temp;

        //Check whether list is empty  
        if (head == null) {
            return;
        } else {
            //Current will point to head  
            for (current = head; current.next != null; current = current.next) {
                //Index will point to node next to current  
                for (index = current.next; index != null; index = index.next) {
                    //If current's data is greater than index's data, swap the data of current and index  
                    if (current.data.getJudul().compareTo(index.data.getJudul()) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            Node tmp = head;
            
            String format = "%1$-5s|%2$-20s|%3$-8s|%4$-10s\n";
            System.out.format(format, "KdBuku", "Judul", "Stok", "Keadaan");
            
            while (tmp != null) {
                System.out.format(String.format(format, tmp.data.getKdBuku(),
                        tmp.data.getJudul(), tmp.data.getStok(), tmp.data.getKeadaan()));
                tmp = tmp.next;
            }
        }
    }
    
    public Node removeDuplicates(Node head_ref) {
        // if DLL is empty or if it contains only 
        // a single node 
        if ((head_ref) == null
                || (head_ref).next == null) {
            return head_ref;
        };
        
        Node ptr1, ptr2;

        // pick elements one by one 
        for (ptr1 = head_ref;
                ptr1 != null; ptr1 = ptr1.next) {
            ptr2 = ptr1.next;

            // Compare the picked element with the 
            // rest of the elements 
            while (ptr2 != null) {

                // if duplicate, then delete it 
                if (ptr1.data.getKdBuku() == ptr2.data.getKdBuku()) {

                    // store pointer to the node next to 'ptr2' 
                    Node next = ptr2.next;

                    // delete node pointed to by 'ptr2' 
                    head_ref = deleteNode(head_ref, ptr2);

                    // update 'ptr2' 
                    ptr2 = next;
                } // else simply move to the next node 
                else {
                    ptr2 = ptr2.next;
                }
            }
        }
        return head_ref;
    }
    
    public Node deleteNode(Node head_ref, Node del) {
        // base case 
        if (head_ref == null || del == null) {
            return head_ref;
        }

        // If node to be deleted is head node 
        if (head_ref == del) {
            head_ref = del.next;
        }

        // Change next only if node to be deleted 
        // is NOT the last node 
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        // Change prev only if node to be deleted 
        // is NOT the first node 
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return head_ref;
        
    }
    
}
