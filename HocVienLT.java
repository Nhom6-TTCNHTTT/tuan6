/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viettesthashset;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author Dell Pc
 */
public class HocVienLT extends HocVien implements Serializable  {
    private int SoBuoi;
    private double DonGiaLT;

    public HocVienLT() {
    }

    public HocVienLT(int SoBuoi, double DonGiaLT) {
        this.SoBuoi = SoBuoi;
        this.DonGiaLT = DonGiaLT;
    }
    
    public HocVienLT(String HoTen, String DiaChi, String LoaiCT, int LoaiUT, int SoBuoi, double DonGiaLT ) {
        super(HoTen, DiaChi, LoaiCT, LoaiUT);
        this.SoBuoi = SoBuoi;
        this.DonGiaLT = DonGiaLT;
    }

    public int getSoBuoi() {
        return SoBuoi;
    }

    public double getDonGiaLT() {
        return DonGiaLT;
    }

    public void setSoBuoi(int SoBuoi) {
        this.SoBuoi = SoBuoi;
    }

    public void setDonGiaLT(double DonGiaLT) {
        this.DonGiaLT = DonGiaLT;
    }
    
    @Override
    public void Nhap() {
        try {
            super.Nhap();
            Scanner sc  = new Scanner(System.in);
            System.out.println("Nhap vao so buoi: ");
            SoBuoi = sc.nextInt();
            System.out.println("Nhap vao don gia lap trinh: ");
            do{
                DonGiaLT = sc.nextDouble();
                if(DonGiaLT <= 10000)
                    throw new Exception("Don gia lap trinh can > 10000");
            }while(DonGiaLT<=0);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    @Override
    public double hocPhi() {
        Double HocPhi = SoBuoi * DonGiaLT;
        if(LoaiUT == 1) 
            return HocPhi - 1000000;
        return HocPhi - 800000;
    }
    
    
    //@Override
    /*public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocVienLT other = (HocVienLT) obj;
        if (this.SoBuoi != other.SoBuoi) {
            return false;
        }
        return Double.doubleToLongBits(this.DonGiaLT) == Double.doubleToLongBits(other.DonGiaLT);
    }*/
    
    
    
    @Override
    public int hashCode() {
        return HoTen.hashCode() + DiaChi.hashCode()  + LoaiCT.hashCode()+ LoaiUT + SoBuoi + Double.hashCode(DonGiaLT);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocVienLT other = (HocVienLT) obj;
        if (this.SoBuoi != other.SoBuoi) {
            return false;
        }
        return Double.doubleToLongBits(this.DonGiaLT) == Double.doubleToLongBits(other.DonGiaLT);
    }

    
}
