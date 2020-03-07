import java.util.ArrayList;
import java.util.List;

public class SongsMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(10);
        list.add(150);
        list.add(40);
        list.add(30);
        System.out.println(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                //System.out.println("i = " + i + "; j = " + j);
                int firstValue = list.get(i);
                int secondValue = list.get(j);
                if ((firstValue + secondValue) % 60 == 0) {
                    sum += (firstValue + secondValue) / 60;
                    System.out.println("firstValue = " + firstValue + "; secondValue = " + secondValue);
                }
            }
        }
        System.out.println("Total number of minutes couple of songs in the album can make : " + sum);
    }
}
