/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daonguockytu;

/**
 *
 * @author Tun
 */
public class Stack {
    int max;
    int top;
    char[] a;
    
    //check xem chuoi co trong hay ko
    public boolean isEmpty(){
        return top ==-1;
    }
    public Stack(int n){
        top =-1;
        max =n;
        a = new char[max];
    }
    //dung ham push de them vao stack
    public boolean push(char x){
        if(top>=max){
            System.out.println("Error !!! ");
            return false;
        }
        else{
            a[++top] =x;
            return true;
        }
        
    }
    
    //xoa ky tu 
    public char pop(){
        if(top==-1){
            System.out.println("Loi roi !!");
            return 0;
        }
        else{
            char x= a[top--];
            return x;
        }
    }
}
