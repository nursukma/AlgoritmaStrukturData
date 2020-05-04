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
public class Node <T> {
    Mahasiswa data;
    Node<Mahasiswa> next,prev;

    public Node() {
        next = null;
        data = null;
    }

    public Node(Node<Mahasiswa> prev ,Mahasiswa data, Node<Mahasiswa> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
