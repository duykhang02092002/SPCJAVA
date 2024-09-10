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
public class bai8ptrinhbac2 {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh bac 2");
        double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a (a khac 0): ");
        a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        c = scanner.nextDouble();
        
        System.out.println("Phuong trinh bac hai co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = b*b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } 
        else if (delta == 0) 
        {
            x1 = -b / (2 * a);
            System.out.println("Phuong trinh co 1 nghiem là x1 = x2 = " + x1);
        } 
        else
        {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan bien ");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}

