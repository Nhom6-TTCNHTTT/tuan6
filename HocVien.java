package De1;
import java.io.Serializable;
import java.util.*;

public abstract class HocVien implements Serializable{
	protected String hoTen;
	protected String diaChi;
	protected int loaiCT;
	protected int loaiUT;
	public HocVien(String hoTen, String diaChi, int loaiCT, int loaiUT) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCT = loaiCT;
		this.loaiUT = loaiUT;
	}
	public HocVien() {
		super();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getLoaiCT() {
		return loaiCT;
	}
	public void setLoaiCT(int loaiCT) {
		this.loaiCT = loaiCT;
	}
	public int getLoaiUT() {
		return loaiUT;
	}
	public void setLoaiUT(int loaiUT) {
		this.loaiUT = loaiUT;
		if(this.loaiUT == 0) {
			System.out.println("Loi khi nhap UT bang 0");
		}
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\nNhap vao ho ten : ");
            setHoTen(sc.nextLine());
		}while(hoTen.isEmpty());
		 try {
			 System.out.print("\nNhap vao dia chi : ");
			  diaChi = sc.nextLine();        
	          System.out.print("\nNhap vao loai chuong trinh (1: Do hoa; 2. Lap trinh): ");
	          setLoaiCT(sc.nextInt());
	          System.out.print("\nNhap vao loai uu tien : ");
	          setLoaiUT((sc.nextInt()));
		 }catch (Exception ex){
			 System.out.println(ex);
		 }
			
	}
	public void inThongTin() {
		System.out.print(String.format("\n%20s %20s %20s %20s %20.2f", hoTen, diaChi,loaiCT == 1 ? "Do hoa" : "Lap trinh", loaiUT == 1 ? "Loai 1" : "Loai 2", hocPhi()));

	}
	public abstract double hocPhi() ;
		
	
}
