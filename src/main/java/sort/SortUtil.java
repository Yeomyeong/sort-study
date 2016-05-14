package main.java.sort;

import java.util.ArrayList;
import java.util.List;

public class SortUtil {
  public static void swap(List<Integer> list, int i, int j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }

  public static List<Integer> copy(List<Integer> list, int fromIndex, int toIndex) {
    return new ArrayList<>(list.subList(fromIndex, toIndex));
  }

  public static int getMiddleOffset(List list) {
    return (int) Math.ceil((double) (list.size() / 2) );
  }
}
