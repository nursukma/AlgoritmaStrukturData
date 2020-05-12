/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum14_tree;

/**
 *
 * @author USER
 */
public class Node {
    int data;
    Node left, right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
}
