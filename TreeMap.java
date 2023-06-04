package TreeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Nhom8
 */
public class TreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Thêm các phần tử vào TreeMap                      
        treeMap.put(3, "Uông Nhật");
        treeMap.put(1, "Minh Đức" );
        treeMap.put(2, "Dinh Phúc" );
        treeMap.put(5, "Ngô Việt" );
        treeMap.put(4, "Quốc Việt" );        
        System.out.println("TreeMap: " + treeMap);
        
        //Lấy ra 1 phần tử
        System.out.println("Lấy giá trị theo khóa 3:" + treeMap.get(3));
        
        // Lấy phần tử lớn nhất và nhỏ nhất trong TreeMap
        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();
        String firstValue = treeMap.firstEntry().getValue();
        String lastValue = treeMap.lastEntry().getValue();
        System.out.println("Min: " + firstKey + ", " + firstValue);
        System.out.println("Max: " + lastKey + ", " + lastValue);

        // Sắp xếp TreeMap theo giá trị tăng dần
        Comparator<Integer> valueComparator = (Integer o1, Integer o2) -> {
            String value1 = treeMap.get(o1);
            String value2 = treeMap.get(o2);
            return value1.compareToIgnoreCase(value2);
        };
        TreeMap<Integer, String> sortedTreeMap = new TreeMap<>(valueComparator);
        sortedTreeMap.putAll(treeMap);
        System.out.println("Sắp xếp theo giá trị tăng dần: " + sortedTreeMap);

 	   // Sắp xếp TreeMap theo giá trị giảm dần
        Comparator<Integer> valueComparatordes = (Integer k1, Integer k2) -> {
            int compare = treeMap.get(k2).compareTo(treeMap.get(k1));
            if (compare == 0) {
                return 1;
            } else {
                return compare;
            }
        };
        TreeMap<Integer, String> sortedByValues = new TreeMap<>(valueComparatordes);
        sortedByValues.putAll(treeMap);
        System.out.println("Sắp xếp theo giá trị giảm dần: " + sortedByValues);
        
        // Chuyển đổi TreeMap sang HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);
        System.out.println("Chuyển đổi từ treemap sang hashmap: " + hashMap);
        
        // Sửa phần tử trong TreeMap
        treeMap.put(2, "Đinh Phúc");
        System.out.println("Sau khi sửa key 2: " + treeMap);

        // Xóa phần tử khỏi TreeMap       
        treeMap.remove(3);
        System.out.println("Sau khi xóa: " + treeMap);
    }
}
