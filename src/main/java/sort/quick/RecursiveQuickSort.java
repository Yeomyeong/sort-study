package main.java.sort.quick;

import main.java.sort.Sort;

import java.util.List;

import static main.java.sort.quick.QuickSortUtil.partitionByPivot;

/**
 * In fact, it is correct to name/call quick sort as partition exchange sort.
 */
public class RecursiveQuickSort implements Sort {
  @Override
  public void sort(List<Integer> list) {
    if (list != null && list.size() > 1) {
      partition(list, 0, list.size()-1);
    }
  }

  private void partition(List<Integer> list, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int pivotPosition = partitionByPivot(list, startIndex, endIndex);

      partition(list, startIndex, pivotPosition - 1);
      partition(list, pivotPosition + 1, endIndex);
    }
  }
}
