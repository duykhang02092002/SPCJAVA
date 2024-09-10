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
public class bai6hinhchunhat {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        double chieudai, chieurong, chuvi, dientich;
        System.out.print("Nhap chieu dai:");
        chieudai = sc.nextInt();
        System.out.print("Nhap chieu rong:");
        chieurong = sc.nextInt();
        
        chuvi = 2*(chieudai+chieurong);
        
        dientich = chieudai * chieurong;
        
        System.out.println("chu vi la: " + chuvi);
        System.out.println("dientich la: " + dientich);
        
    }
}