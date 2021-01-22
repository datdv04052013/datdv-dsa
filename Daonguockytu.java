/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daonguockytu;
import java.util.*;

/**
 *
 * @author Tun
 */
public class Daonguockytu {

    /**
     * @param args the command line arguments
     */
    
    public static void daonguoc(StringBuffer str) {
        int n = str.length();
        Stack st  = new Stack(n);
        
        //day tat ca ky tu cua chuoi vao trong ngan xep
        
        int i;
        for(i = 0;i<n;i++){
            st.push(str.charAt(i));
        }
        
        //xoa tat ca ky tu trong chuoi va them chung vao
        //str
        for(i=0;i<n;i++){
            char ch =st.pop();
            str.setCharAt(i, ch);
        }
    }
    public static void main(String[] args){
        //tao mot chuoi moi
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String string = sc.nextLine(); //doc ky tu nguoi dung nhap vao
        if (string.isEmpty()){ //kiem tra chuoi nhap vao co ky tu hay ko
            System.out.println("hay nhap lai");
        }
        else{
            StringBuffer s = new StringBuffer(string);
         //goi ham dao nguoc
         daonguoc(s);
         //in ra chuoi da dao nguoc
         
         System.out.println("Chuoi sau khi dao nguoc la: " +s);
        }
        
        }
        
        
    
    
}
