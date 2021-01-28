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
public class function {
    //merge hai mang con cua mang a[]
    //mang con thu nhat la a[l...m]
    //mang con thu hai la a[m+1...r]
    public void merge(int a[], int l,int m, int r){
         

        //kich thuoc cua mang con thu nhat         
        int n1 = m - l + 1;
        // kich thuoc cua mang con thu hai      
        int n2 = r - m;
        
        //tao hai mang tam de chua du lieu cua 2 mang con
        //co chieu dai bang hai mang con      
        int l1[] = new int[n1];
        int r1[] = new int[n2];
               
        //copy du lieu vao mang tam
        for( int i = 0; i< n1; i++){
            l1[i] = a[l+i];
        }
        for( int j =0; j< n2; j++){
            r1[j] = a[m+1+j];
        }
        
        //merge cac mang tam lai voi nhau
       
        //chi muc ban dau cua hai mang con
         int i =0; 
         int j= 0;
         
        //chi muc ban dau cua mang phu duoc hop nhat
        int k=l;
        while( i<n1 && j<n2 ){
            if(l1[i] <= r1[j]){
                a[k] =l1[i];
                i++;
            }
            else{
                a[k] =r1[j];
                j++;
            }
            k++;
        }
        
        //sao chep cac phan tu con lai cua mang con l1[] new co
        while(i<n1){
            a[k] = l1[i];
            i++;
            k++;
        }
        
        //sao chep cac phan tu con lai cua mang con r1[] new co
        while(j<n2){
            a[k] = r1[j];
            j++;
            k++;
        }
         
        
        
         
    }
    
    void sort(int a[], int l, int r){
        
        if(l<r){
            
            //tim diem chinh giua
            int m =(l+r)/2;
            
            //ham de quy tiep tuc chia doi
            
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        } 
        
        }
}
