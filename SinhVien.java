/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author FPT SHOP
 */
public class SinhVien extends Nguoi implements Serializable{
    String lop;
    String nganh;

    public SinhVien() {
    }

    public SinhVien(String lop, String nganh, String hoTen, int tuoi, char gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap vao nganh: ");
        nganh = sc.nextLine();
    }
    
    @Override
    public String toString() {
        return String.format("%20s %20s",lop, nganh);
    }
    
}
