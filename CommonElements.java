package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7);

        List<Integer> common = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            int value1 = list1.get(i);

            for (int j = 0; j < list2.size(); j++) {
                int value2 = list2.get(j);

                if (value1 == value2) {
                    common.add(value1);
                    break;
                }
            }
        }

        System.out.println(common);
	}

}
