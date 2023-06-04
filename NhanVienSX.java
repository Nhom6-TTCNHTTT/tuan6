package Phieu4.Bai4_Nhom8.Bai3;

import java.util.Scanner;

public class NhanVienSX extends NhanVien {
    public int SanPham;

    public NhanVienSX() {
    }

    public NhanVienSX(int SanPham, String HoTen, String PhuCap, int Luong, int NamVaoLam) {
        super(HoTen, PhuCap, Luong, NamVaoLam);
        this.SanPham = SanPham;
    }

    public int getSanPham() {
        return SanPham;
    }

    public void setSanPham(int SanPham) {
        this.SanPham = SanPham;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getPhuCap() {
        return PhuCap;
    }

    public void setPhuCap(String PhuCap) {
        this.PhuCap = PhuCap;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

    public int getNamVaoLam() {
        return NamVaoLam;
    }

    public void setNamVaoLam(int NamVaoLam) {
        this.NamVaoLam = NamVaoLam;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "HoTen=" + HoTen + ", PhuCap=" + PhuCap + ", Luong=" + thanhTien() + ", NamVaoLam=" + NamVaoLam +"Sản phẩm" + SanPham + '}';
    }
    public int thanhTien(){
        return Luong =SanPham*10000;
    }
    public void nhapNhanVienSX(){
        this.nhapThongTinNhanVien();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số sản phẩm:   ");
        SanPham= scanner.nextInt();
        
    }
    public void xuatNhanVienSX(){
        this.xuatThongTinNhanVien();
    }
    
}
