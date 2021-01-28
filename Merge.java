/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Tun
 */
public class Merge {

    public static void main(String[] args) {
        
        int a[]  ={38,27,43,3,9,82,10};
        
        System.out.println("Mang Ban Dau La: " );
        print(a);
        System.out.println("");
        function ms  = new function();
        ms.sort(a,0,a.length-1);
        System.out.println("Mang Sau Khi Merge la: ");
        print(a);
    
    }
   
    
    //in cac phan tu trong mang
    
    static void print(int a[]){
        int n = a.length;
        for(int i =0; i<n ; i++){
            System.out.print(a[i]+" ");
        }
    }
    
    
}
