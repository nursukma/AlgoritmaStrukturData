package praktikum10_queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class queue {
    int max, size, front, rear;
    int [] q;

    public queue(int n) {
        max = n;
        create();
    }

    public void create() {
        q = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    
    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: "+q[front]);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekRear(){
        if(!isEmpty())
            System.out.println("Elemen terdapat: "+q[rear]);
        else
            System.out.println("Antrian masih kosong");
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            while(i!=rear){
                System.out.print(q[i]+" ");
                i = (i+1) % max;
            }
            System.out.println(q[i]+" ");
            System.out.println("Jumlah antrian: "+size);
        }
    }
    
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Antrian sudah penuh");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max -1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
        }
        q[rear] = data;
        size++;
    }
    
    public int dequeue(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            data = q[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else{
                if(front == max -1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;    
    }
}
