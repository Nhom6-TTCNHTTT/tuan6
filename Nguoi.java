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
public class Nguoi implements Serializable{
   protected String hoTen;
   protected int tuoi;
   protected char gioiTinh;
    public Nguoi(){}
    public Nguoi(String hoTen, int tuoi, char gioiTinh) {
        try {
            if (tuoi<=0){
                throw new Exception("Tuoi can > 0");
            }
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        }catch(Exception ex){
            System.out.print(ex.toString());
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) throws Exception {
        if(tuoi<=0){
            throw new Exception("Tuoi can >0");
        }
        this.tuoi = tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
   public void Nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("\nNhap vao ho ten: ");
       hoTen = sc.nextLine();
       System.out.print("\nNhap vao tuoi: ");
       try{
            tuoi=sc.nextInt();
            if(tuoi <= 0 ){
                throw new Exception("Tuoi phai >0");
            }
       }catch(Exception ex){
           System.out.print(ex.toString());
       }
       System.out.print("Gioi tinh (women - w, Man - m): " );
       setGioiTinh(sc.nextLine().charAt(0));
   }
   public void inTT(){
       System.out.printf("%20s");
   }
    @Override
    public String toString() {
        return String.format("%20s %20s %20s ",hoTen,tuoi,gioiTinh == 'w'?"Nữ":"Nam");
    }
   
}
