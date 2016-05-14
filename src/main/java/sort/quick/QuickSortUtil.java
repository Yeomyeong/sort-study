package main.java.sort.quick;

import java.util.List;

import static main.java.sort.SortUtil.swap;

/**
 * Created by wymstar on 5/14/16.
 */
public class QuickSortUtil {
  public static int partitionByPivot(List<Integer> list, int startIndex, int endIndex) {
    int pivot = list.get(startIndex),
            i = startIndex + 1,
            j = endIndex;

    while (i < j) {
      while (i < j && list.get(j) > pivot) j--;
      while (i < j && list.get(i) < pivot) i++;

      swap(list, i, j);
    }
    int pivotOffset = i;
    if (list.get(startIndex) > list.get(pivotOffset))
      swap(list, startIndex, pivotOffset);
    System.out.println(list);
    return pivotOffset;
  }
}
