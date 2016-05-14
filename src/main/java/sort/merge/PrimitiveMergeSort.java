package main.java.sort.merge;

import main.java.sort.Sort;

import java.util.List;

import static main.java.sort.SortUtil.copy;

/**
 * Created by wymstar on 5/14/16.
 */
public class PrimitiveMergeSort implements Sort{
  @Override
  public void sort(List<Integer> list) {
    if(list.size() > 1) {
      int length = list.size(),
          middle = (int) Math.ceil((double)length/2);

      List<Integer> leftList = copy(list, 0, middle) ;
      List<Integer> rightList = copy(list, middle, list.size()) ;

      sort(leftList);
      sort(rightList);
      merge(leftList, rightList, list);
    }
  }

  private void merge(List<Integer> leftList, List<Integer> rightList, List<Integer> list) {
    int leftIndex=0, rightIndex=0, k=0,
        leftSize = leftList.size(), rightSize = rightList.size();

    while (leftIndex < leftSize && rightIndex < rightSize) {
      if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
        list.set(k, leftList.get(leftIndex));
        leftIndex++;
      } else {
        list.set(k, rightList.get(rightIndex));
        rightIndex++;
      }
      k++;
    }

    if (leftIndex >= leftSize) {
      while (k < list.size()) {
        list.set(k, rightList.get(rightIndex));
        rightIndex++;
        k++;
      }
    } else {
      while (k < list.size()) {
        list.set(k, leftList.get(leftIndex));
        leftIndex++;
        k++;
      }
    }
  }


}
