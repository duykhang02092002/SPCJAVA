/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner; 
/**
 *
 * @author Administrator
 */
public class bai10luongthuongthue {
    public static void main(String[] args) {
        System.out.println("tinhluongthuongvafthue");
               double luong, thuong, thue,tong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong : ");
        luong = scanner.nextDouble();
        System.out.print("Nhap thuong : ");
        thuong = scanner.nextDouble();
        System.out.println("luong : " + luong);
        System.out.println("thuong : " + thuong);
        tong=(luong+thuong);
        if (tong < 9) {
            System.out.println("thue: 0%" );
        } 
          else if (tong<= 15) 
        {
            
            System.out.println("thue 10%:" +tong*10/100  );
        } 
          else if (tong<= 30) 
        {
            
            System.out.println("thue 15%:" +tong*15/100 );
        } 
          else 
        {
            thue=tong*2.0;
            System.out.println("thue 20%:" +tong*20/100 );
        } 
        

        
    }
}
