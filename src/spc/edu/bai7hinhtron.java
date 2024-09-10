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
public class bai7hinhtron {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh hinh tron ");
        Scanner sc = new Scanner(System.in);
        double bankinh, chuvi, dientich;
        System.out.print("Nhap ban kinh:");
        bankinh = sc.nextInt();
    
        chuvi = Math.PI * 2 * bankinh;
        
        dientich = bankinh * bankinh * Math.PI; 
        
        System.out.println("chu vi la: " + chuvi);
        System.out.println("dientich la: " + dientich);
    }
}
