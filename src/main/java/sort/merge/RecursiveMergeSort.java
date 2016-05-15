package main.java.sort.merge;

import main.java.sort.Sort;

import java.util.ArrayList;
import java.util.List;

import static main.java.sort.SortUtil.getMiddleOffset;
import static main.java.sort.merge.MergeSortCore.mergeInPlace;

/**
 * recursive and in-place merge sort
 */
public class RecursiveMergeSort implements Sort{
  @Override
  public void sort(List<Integer> list) {
    if(list.size() > 1) {
      mergeSort(list, 0, list.size()-1);
    }
  }

  private void mergeSort(List<Integer> list, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int middle = (startIndex + endIndex) / 2;
      mergeSort(list, startIndex, middle);
      mergeSort(list, middle+1, endIndex);
      mergeInPlace(list, startIndex, middle, endIndex);
    }
  }


}
