package De1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet tree = new TreeSet();
        FakeData(tree);
        System.out.println("\n==================================================================");
        System.out.print("\nNhap vao so luong hoc vien dh muon them : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++){
            HocVienDH hv = new HocVienDH();
            hv.nhapThongTin();
            tree.add(hv);
        }
        
        InTree(tree);
        /*
        CompareByHocPhi hp = new CompareByHocPhi();
        HocVienDH maxHVDH = Collections.max(tree, hp);
        System.out.println("\n============================= MAX ============================");
        System.out.print("\nHoc vien co hoc phi cao nhat la : " + maxHVDH.HoTen);*/
        System.out.println("\n============================= Ghi FILE ===========================");
        try{
            GhiFile(tree);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("\nDa ghi file thanh cong");
        
        System.out.println("\n============================= DOC FILE ===========================");
        TreeSet<HocVienDH> treeRead = new TreeSet<HocVienDH>();
        try{
            treeRead = DocFile();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        InTree(treeRead);
    }
    
    public static void FakeData(TreeSet tree){
        tree.add(new HocVienDH(20, 5000000, "Nguyen Xuan", "Ha Noi", 1, 1));
        tree.add(new HocVienDH(10, 7000000, "Nguyen Hoang", "Ha Noi", 1, 2));
        tree.add(new HocVienDH(15, 3000000, "Nguyen An", "Ha Noi", 2, 1));
        
        InTree(tree);
    }
    
    public static void InTree(TreeSet tree){
        Iterator<HocVienDH> ir = tree.iterator();
        
        System.out.print(String.format("\n%20s %20s %20s %20s %20s", "Ho Ten", "Dia Chi","Loai CT", "Loai UT", "Hoc phi"));
        while(ir.hasNext()){
            HocVienDH hv =  ir.next();
            hv.inThongTin();
        }
    }
    
    public static void GhiFile(TreeSet<HocVienDH> tree) throws Exception{
        FileOutputStream fo = new FileOutputStream("HocVienDH.txt");
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(tree);
        out.close();    
    }
    
    public static TreeSet<HocVienDH> DocFile() throws Exception{
        TreeSet<HocVienDH> tree = new TreeSet<HocVienDH>();
        
        FileInputStream fi = new FileInputStream("HocVienDH.txt");
        ObjectInputStream in = new ObjectInputStream(fi);
        return (TreeSet<HocVienDH>)in.readObject();
    }
}