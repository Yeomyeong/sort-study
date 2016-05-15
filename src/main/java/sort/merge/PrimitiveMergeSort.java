package main.java.sort.merge;

import main.java.sort.Sort;

import java.util.List;

import static main.java.sort.SortUtil.copy;
import static main.java.sort.merge.MergeSortCore.mergeFromTwoCopiedArraysToOriginArray;

/**
 * recursive and using extra memory merge sort
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
      mergeFromTwoCopiedArraysToOriginArray(leftList, rightList, list);
    }
  }
}
