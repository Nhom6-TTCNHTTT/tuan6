/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx2_viettesthashset142;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author Dell Pc
 */
public abstract class HocVien implements Serializable {
    protected String HoTen;
    protected String DiaChi;
    protected String LoaiCT;
    protected int LoaiUT;

    public HocVien() {
    }

    public HocVien(String HoTen, String DiaChi, String LoaiCT, int LoaiUT) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.LoaiCT = LoaiCT;
        this.LoaiUT = LoaiUT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getLoaiCT() {
        return LoaiCT;
    }

    public int getLoaiUT() {
        return LoaiUT;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setLoaiCT(String LoaiCT) {
        this.LoaiCT = LoaiCT;
    }

    public void setLoaiUT(int LoaiUT) {
        this.LoaiUT = LoaiUT;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.println("Nhap loai chuong trinh: ");
        LoaiCT = sc.nextLine();
        System.out.println("Nhap loai uu tien: ");
        LoaiUT = sc.nextInt();
        
    }
    
    public void Xuat() {
        System.out.printf("\n%20s %20s %20s %20s %20s", HoTen, DiaChi, LoaiCT, LoaiUT, hocPhi());
    }
    
    public abstract double hocPhi();
    
}
