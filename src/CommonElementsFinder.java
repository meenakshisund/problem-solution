import java.util.ArrayList;
import java.util.List;

public class CommonElementsFinder {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3,4,2};
        int[] arr2 = new int[] {3,4,5,1,2};
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int item:arr2) {
            list2.add(item);
        }

        for(Integer item:arr1) {
            if(list2.contains(item)){
                list3.add(item);
            }
        }
        System.out.println(list3);
    }
}