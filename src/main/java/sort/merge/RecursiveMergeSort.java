package main.java.sort.merge;

import main.java.sort.Sort;

import java.util.ArrayList;
import java.util.List;

import static main.java.sort.SortUtil.getMiddleOffset;

/**
 * Created by wymstar on 5/14/16.
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
      merge(list, startIndex, middle, endIndex);
    }
  }

  private void merge(List<Integer> list, int startIndex, int middle, int endIndex) {
    List<Integer> helper = new ArrayList<>(list.subList(startIndex, endIndex+1));

    int leftIndex = 0,
        leftEnd = middle - startIndex,
        rightIndex = middle + 1 - startIndex,
        rightEnd = endIndex - startIndex,
        current = startIndex;

    while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
      if (helper.get(leftIndex) < helper.get(rightIndex)) {
        list.set(current, helper.get(leftIndex));
        leftIndex++;
      } else {
        list.set(current, helper.get(rightIndex));
        rightIndex++;
      }
      current++;
    }

    while (current <= endIndex && leftIndex <= leftEnd) {
      list.set(current, helper.get(leftIndex));
      leftIndex++;
      current++;
    }
  }


}
