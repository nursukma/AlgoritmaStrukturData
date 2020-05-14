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
public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }
    
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    
    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }
    }
    
    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
        }
    }
    
    public void add(int value) {
        if (data[0] == 0) {
            data[0] = value;
            return;
        }

        recAdd(0, value);
    }

    public void recAdd(int root, int value) {
        if (data[root] == 0) {
            return;
        }

        if (value < data[root]) {
            // this is the formula to access the left node
            if (data[root * 2 + 1] == 0) {
                data[root * 2 + 1] = value;
                return;
            } else {
                recAdd(root * 2 + 1, value);
            }

        } else {
            // this is the formula to access the right node
            if (data[root * 2 + 2] == 0) {
                data[root * 2 + 2] = value;
                return;
            } else {
                recAdd(root * 2 + 2, value);
            }

        }
    }
}
