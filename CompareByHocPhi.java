package De1;

import java.util.Comparator;

public class CompareByHocPhi implements Comparator<HocVienDH>{
	@Override
    public int compare(HocVienDH o1, HocVienDH o2) {
        return Double.compare(o1.hocPhi(), o2.hocPhi());
    }
}
