/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8_stack;

/**
 *
 * @author USER
 */
public class Stack {
    int size, top, data[];

    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = 0;
    }
   
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    
    public void push(int dt){
        if(!isFull()){
            top++;
            data[top]=dt;
        }else{
            System.out.println("Isi Stack Penuh");
        }
    }
    
    public void pop(){
        if(!isEmpty()){
            int x = data[top];
            top--;
            System.out.println("Data yang keluar: "+x);
        }else{
            System.out.println("Stack kosong");
        }
    }
    
    void peek(){
        System.out.println("Elemen Teratas: "+data[top]);
    }
    
    void print(){
        System.out.println("isi stack: ");
        for(int i = top; i>= 0;i--){
            System.out.println(""+data[i]);
        }
        System.out.println("");
    }
    
    void clear(){
        if(!isEmpty()){
            for(int i=top;i>=0;i--){
                top--;
            }
            System.out.println("Stack sudah di kosongkan");
        }else
            System.out.println("Gagal Stack masih kosong");
    }
}
