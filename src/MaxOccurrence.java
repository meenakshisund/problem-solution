import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurrence {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(3,4,5,1,2,3,1,23,4,51,3,2,4,4);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int maxCount = 0;
        int maxOccurredElement = 0;
        for (Integer item: list2) {
            count = Collections.frequency(list2, item);
            map.put(item, count);
            if(count > maxCount) {
                maxCount = count;
                maxOccurredElement = item;
            }
        }
        System.out.println(map);
        System.out.println(maxOccurredElement);

        Map<Integer, Long> map1 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     // Optional<Map.Entry<Integer, Long>> maxKey = map1.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
        Optional<Map.Entry<Integer, Long>> maxKey = map1.entrySet().stream().max((i,j)->i.getValue().compareTo(j.getValue()));
        System.out.println(map1);
        System.out.println(maxKey.get().getKey());
    }
}