/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;


         Scanner input = new Scanner(System.in);
         
   
         System.out.println("Inputkan Bilangan");
          pilih = input.nextInt();

         if(pilih %2==0){
             System.out.println("Genap");
         }else {
             System.out.println("Ganjil");
     
         
    }
    
}
}