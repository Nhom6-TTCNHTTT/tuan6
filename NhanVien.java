package TreeMap;

import java.util.Scanner;

public class NhanVien {
    public String HoTen, PhuCap;
    public int Luong,NamVaoLam;
    public NhanVien(){
        
    }
    public NhanVien(String HoTen, String PhuCap, int Luong, int NamVaoLam) {
        this.HoTen = HoTen;
        this.PhuCap = PhuCap;
        this.Luong = Luong;
        this.NamVaoLam = NamVaoLam;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "HoTen=" + HoTen + ", PhuCap=" + PhuCap + ", Luong=" + Luong + ", NamVaoLam=" + NamVaoLam + '}';
    }
     public void nhapThongTinNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên nhân viên: ");
        HoTen = scanner.nextLine();
        System.out.print("Nhập phụ cấp: ");
        PhuCap = scanner.nextLine();
        System.out.print("Nhập lương cơ bản:  ");
        Luong = scanner.nextInt();
        System.out.print("Nhập năm vào làm:  ");
        NamVaoLam= scanner.nextInt();
    }
    public void xuatThongTinNhanVien(){
        System.out.print("Họ tên: "+ HoTen);
        System.out.print("Phụ cấp: " +PhuCap);
        System.out.print("Lương cơ bản: " +Luong);
        System.out.print("Năm vào làm: " +NamVaoLam);
    }
       
}
