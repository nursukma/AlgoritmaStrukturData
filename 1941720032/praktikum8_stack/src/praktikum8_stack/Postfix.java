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
public class Postfix {
    int n, top;
    char stack[];

    public Postfix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }    
    
    void push(char c){
        top++;
        stack[top] = c;
    }
    
    char pop(){
        char item = stack[top];
        top--;
        return item;
    }
    
    boolean isOperand(char c){
        if((c>='A' && c<='z') || (c >= 'a' && c <='z') || (c >= '0' && c<='9') || c == ' '  || c == '.')
            return true;
        else
            return false;
    }
    
    boolean isOperator(char c){
        if(c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+')
            return true;
        else
            return false;
    }
    
    int presedence(char c){
        switch(c){
            case '^' : return 3;
            case '%' : return 2;
            case '/' : return 2;
            case '*' : return 2;
            case '-' : return 1;
            case '+' : return 1;
            default : return 0;
        }
    }
    
    String konversi(String Q){
        String P="";
        char c;
        for(int i =0; i<n; i++){
            c = Q.charAt(i);
            
            if(isOperand(c)){
                P = P+c;
            }
            if(c == '('){
                push(c);
            }
            
            if(c == ')'){
                while (stack[top] != '('){
                    P = P + pop();
                }
                char temp = pop();
            }
            
            if(isOperator(c)){
                while(presedence(stack[top]) >= presedence(c)){
                    P = P+ pop();
                }
                push(c);
            }
        }
        return P;
    }
}
