package main.java.sort;

import java.util.List;

/**
 * Created by wymstar on 5/12/16.
 */
public class SortUtil {
  public static void swap(List<Integer> list, int i, int j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }
}
