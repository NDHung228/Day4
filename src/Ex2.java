import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {

    public static void bubbleSort(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {

                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println("List before sort: "+list);

        Collections.sort(list);

        System.out.println("List after sort: " + list);

       int i = list.get(0).compareTo(list.get(1));
        System.out.println(i);

    }
}
