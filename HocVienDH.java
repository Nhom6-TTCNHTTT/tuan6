package Tuan6;
import java.io.Serializable;
import java.util.Scanner;

public class HocVienDH extends HocVien implements Comparable<HocVienDH>, Serializable{
	private final int UUTIEN1 = 1000000;
	private final int UUTIEN2 = 500000;
	private int soBuoi;
	private double donGiaDH;
	
	public HocVienDH() {
	}

	public HocVienDH(int soBuoi, double donGiaDH, String hoTen, String diaChi, int loaiCT, int loaiUT) {
		super(hoTen, diaChi, loaiCT, loaiUT);
		try {
			this.soBuoi = soBuoi;
			this.donGiaDH = donGiaDH;
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) throws Exception {
		this.soBuoi = soBuoi;
		if(this.soBuoi <= 0) {
			throw new Exception("So buoi can lon hon 0");
		}
	}

	public double getDonGiaDH() {
		return donGiaDH;
	}

	public void setDonGiaDH(double donGiaDH) throws Exception {
		this.donGiaDH = donGiaDH;
		if(this.donGiaDH < 10000) {
			throw new Exception("Don gia lon hon 10000");
		}
	}
	@Override
	public void nhapThongTin() {
		try {
			super.nhapThongTin();
			Scanner sc = new Scanner(System.in);
            System.out.print("\nNhap vao so buoi : ");
            setSoBuoi(sc.nextInt());
            System.out.print("\nNhap vao don gia dh : ");
            setDonGiaDH(sc.nextDouble());
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	@Override
	public double hocPhi() {
		double hocPhi = 0;
		if(loaiUT == 1) {
			return hocPhi = soBuoi * donGiaDH - UUTIEN1;
		}else {
			return hocPhi = soBuoi * donGiaDH - UUTIEN2;
		}
	}
	@Override
    public int compareTo(HocVienDH o) {
        return Integer.compare(this.soBuoi, o.soBuoi);
    }
}
