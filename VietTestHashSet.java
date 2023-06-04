/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viettesthashset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Dell Pc
 */
public class VietTestHashSet {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<HocVienLT> hs = new HashSet<HocVienLT>();
        FakeData(hs);
        InHashSet(hs);
        
        int n;
        System.out.print("\nNhap vao so luong hoc vien muon them : ");
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("\n======= Nhap vao hoc vien lt ==========");
            HocVienLT them = new HocVienLT();
            them.Nhap();
            hs.add(them);
        }
        
        System.out.println("\n============ DS SAU KHI THEM ==============");
        InHashSet(hs);
        
        System.out.println("\n============ Ghi FILE ==============");
        try{
            GhiFile(hs);
            System.out.print("\nGhi file thanh cong");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        System.out.println("\n============ Doc FILE ==============");
        try{
            HashSet<HocVienLT> hsThem;
            hsThem = DocFile();
            InHashSet(hsThem);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void FakeData(HashSet<HocVienLT> hs){
        hs.add(new HocVienLT("Nguyen An", "Ha Noi", "Lap trinh", 1, 21, 5000000));
        hs.add(new HocVienLT("Nguyen Nam", "Ha Noi", "Lap trinh", 2, 22, 4500000));
        hs.add(new HocVienLT("Nguyen Hoang", "Ha Noi", "Lap trinh", 1, 26, 300000));
    }
    
    public static void InHashSet(HashSet<HocVienLT> hs){
        System.out.print(String.format("\n%20s %20s %20s %20s %20s", "Ho Ten", "Dia Chi", "Loai UT", "Loai CT", "Hoc phi"));
        for(HocVienLT i : hs)
            i.Xuat();
    }
    
    public static void GhiFile(HashSet<HocVienLT> hs) throws Exception{
        FileOutputStream fo = new FileOutputStream("HocVienLT.TXT");
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(hs);
        out.close();
    }
    
    public static HashSet<HocVienLT> DocFile() throws Exception{
        HashSet<HocVienLT> hs;
        FileInputStream fi = new FileInputStream("HocVienLT.TXT");
        ObjectInputStream in = new ObjectInputStream(fi);
        hs = (HashSet<HocVienLT>)in.readObject();
        in.close();
        return hs;
    }
    
}
