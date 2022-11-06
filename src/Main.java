import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (!(i % 2 == 0)) {
                System.out.println(nums.get(i));
            }
        }


    }
}