package main.java.sort.merge;

import main.java.sort.Sort;

import java.util.List;

import static main.java.sort.merge.MergeSortCore.mergeInPlace;

/**
 * iterative and in-place merge sort
 */
public class IterativeMergeSort implements Sort{
  @Override
  public void sort(List<Integer> list) {
    if(list.size() > 1) {
      int length = list.size();

      for (int sizeOfMerge=1; sizeOfMerge <= length-1; sizeOfMerge = 2 * sizeOfMerge)
      {
        for (int startIndex=0; startIndex < length-1; startIndex += 2 * sizeOfMerge)
        {
          int mid = startIndex + sizeOfMerge - 1;
          int endIndex = Math.min(startIndex + 2 * sizeOfMerge - 1, length-1);
          mergeInPlace(list, startIndex, mid, endIndex);
        }
      }
    }
  }
}
