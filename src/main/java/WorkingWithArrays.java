import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkingWithArrays {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        replacementOfElements(arr);

        String[] strings = {"one", "two", "three"};
        replacementArrayToArrayList(strings);
    }

    public static void replacementOfElements(List<Integer> arr) {
        int temp = arr.get(0);
        arr.set(0, arr.get(1));
        arr.set(1, temp);
        System.out.print("replacementOfElements: " + arr);
        System.out.println();
    }

    public static void replacementArrayToArrayList(String[] str) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, str);
        list.add("four");
        list.add("five");

        System.out.print("replacementArrayToArrayList: ");
        for (String s : list) {
            System.out.print(" " + s);
        }

    }
}
