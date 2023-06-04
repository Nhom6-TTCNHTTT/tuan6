/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author FPT SHOP
 */
public class OnTap {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<SinhVien> sv = new LinkedHashSet<>();
    FakeData(sv);
    inTT(sv);
    }
    public static void FakeData(LinkedHashSet<SinhVien> sv){
        sv.add(new SinhVien("HTTT1","HTTT","A",20,'m'));
        sv.add(new SinhVien("HTTT1","HTTT","B",21,'w'));
        sv.add(new SinhVien("HTTT1","HTTT","C",22,'m'));
    } 
    public static void inTT(LinkedHashSet<SinhVien> sv){
        System.out.printf("\n%20s %20s %20s %20s %20s ","Lop","Nganh","Ho ten","tuoi","Gioi tinh");
        for(SinhVien a:sv){
            a.toString();
        }
    }
}
