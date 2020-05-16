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
public class Node <T>{
    Node <BukuObject> prev, next;
    BukuObject data;

    public Node(Node<BukuObject> prev, BukuObject data, Node<BukuObject> next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
    
   
}
