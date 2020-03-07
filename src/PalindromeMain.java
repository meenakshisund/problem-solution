import java.util.ArrayList;
import java.util.List;

public class PalindromeMain {
    public static void main(String[] args) {
        String inputString = "abbaeae";
        int length = inputString.length();
        int sum = 0;
        List<String> finalList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                //System.out.println("i = " + i + "; j = " + j);
                if(isPalindrome(inputString.substring(i, j))){
                    //System.out.println("firstValue = " + i + "; secondValue = " + j);
                    finalList.add(inputString.substring(i, j));
                    sum++;
                }
            }
            //System.out.println();
        }

        if(isPalindrome(inputString))
            sum++;

        System.out.println(finalList);
        System.out.println(sum);
    }
    private static boolean isPalindrome(String str){
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}
