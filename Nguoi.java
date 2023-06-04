
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPT SHOP
 */
public class Nguoi {
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;
    public Nguoi(){}
    public Nguoi(String ten, int tuoi, char gioiTinh) {
       try{
        if(tuoi<0) throw new Exception("Tuoi phai lon hon 0");
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }catch(Exception ex){
           System.out.print(ex.toString());
    }
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) throws Exception {
        if(tuoi<0) throw new Exception("Tuoi phai lon hon 0");
        this.tuoi = tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhapThongTin(){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        ten=sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        tuoi=sc.nextInt();
        System.out.println("Gioi tinh (women:w, man:m :");
        setGioiTinh(sc.nextLine().charAt(0));
    }catch(Exception ex){
            System.out.print(ex.toString());
          }
    }
    @Override
    public String toString() {
        return String.format("%20s%20d%20s",ten,tuoi,gioiTinh == 'w'?"women":"Man");
    }
}   
