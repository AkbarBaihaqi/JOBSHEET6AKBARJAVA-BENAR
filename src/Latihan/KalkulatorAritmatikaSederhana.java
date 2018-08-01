package Latihan;
import java.util.Scanner;
public class KalkulatorAritmatikaSederhana {
    public static void main(String[] args){
    
    int a, b, c;
    
    Scanner baca = new
    Scanner(System.in);        
    
    System.out.println("Kalkulator Aritmatika Sederhana");
    System.out.print("Angka pertama: ");
    a = baca.nextInt();
    System.out.print("Angka kedua: ");
    b = baca.nextInt();
    System.out.println("Pilih operator"+
          "\n1. +"+
          "\n2. -"+
          "\n3. x"+
          "\n4. /");
    
    System.out.print("Operator: ");
    String somethin = baca.next();
    String Penjumlahan ="+";
    String Pengurangan ="-";
    String Perkalian ="x";
    String Pembagian ="/";
   
   if (somethin.equals(Penjumlahan)) {
       c = a + b;
       System.out.println(a+"+"+b+"="+c);}
   else if (somethin.equals(Pengurangan)) {
       c = a - b;
       System.out.println(a+"-"+b+"="+c);}
   else if (somethin.equals(Perkalian)) {   
       c = a * b;
       System.out.println(a+"x"+b+"="+c);}
   else if (somethin.equals(Pembagian)) {
       c = a / b;
       System.out.println(a+"/"+b+"="+c);} 
    }
}
